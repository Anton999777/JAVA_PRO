package algorithm;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Algorithm {
    public static void main(String[] args) {
        insertionSort(arrayFilling(20));
        bubbleSort(arrayFilling(200));

    }

    public static int[] arrayFilling(int size) {
        int[] arrayFilling = new int[size];
        for (int i = 0; i < arrayFilling.length; i++) {
            arrayFilling[i] = ThreadLocalRandom.current().nextInt(size);
        }
        return arrayFilling;
    }

    public static int[] insertionSort(int[] arrayFilling) {
        int next;
        for (int i = 0; i < arrayFilling.length - 1; i++) {
            if (arrayFilling[i] > arrayFilling[i + 1]) {
                next = arrayFilling[i + 1];
                arrayFilling[i + 1] = arrayFilling[i];
                arrayFilling[i] = next;
                for (int j = i; j > 0; j--) {
                    if (next < arrayFilling[j - 1]) {
                        arrayFilling[j] = arrayFilling[j - 1];
                        arrayFilling[j - 1] = next;
                    } else {
                        break;
                    }
                }
            }
        }
        return arrayFilling;
    }

    public static int[] bubbleSort(int[] arrayFilling) {
        for (int i = 0; i < arrayFilling.length; i++) {
            for (int j = 0; j < arrayFilling.length - 1 - i; j++) {
                if (arrayFilling[j] > arrayFilling[j + 1]) {
                    int next = arrayFilling[j + 1];
                    arrayFilling[j + 1] = arrayFilling[j];
                    arrayFilling[j] = next;
                }
            }
        }
        return arrayFilling;
    }
}
