package multithreading;

import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        ValueCalculator valueCalculator = new ValueCalculator();
        Thread thread1 = new Thread(valueCalculator, " Thread 1");
        Thread thread2 = new Thread(valueCalculator, " Thread 2");

        thread1.start();
        thread2.start();

    }
}
