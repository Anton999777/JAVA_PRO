package streams;

import java.util.concurrent.*;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class PetrolStation {
    private double amount = 100;
    private final Semaphore semaphore = new Semaphore(3);
    private final Lock lock = new ReentrantLock();

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void doRefuel(double amountPetrol) throws InterruptedException {
        semaphore.acquire();
        lock.lock();
        try {
            amount -= amountPetrol;
            int refuelingTime = ThreadLocalRandom.current().nextInt(3, 10);
            TimeUnit.SECONDS.sleep(refuelingTime);
        } finally {
            lock.unlock();
        }
        semaphore.release();
    }
}
