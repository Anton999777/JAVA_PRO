package streams;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(4);
        PetrolStation petrolStation = new PetrolStation();

        Buyer buyer = new Buyer(15, petrolStation);
        Buyer buyer1 = new Buyer(15, petrolStation);
        Buyer buyer2 = new Buyer(10, petrolStation);
        Buyer buyer3 = new Buyer(5, petrolStation);


        executorService.invokeAll(List.of(buyer, buyer1, buyer2, buyer3));
        System.out.println(petrolStation.getAmount());
        executorService.shutdownNow();
    }
}
