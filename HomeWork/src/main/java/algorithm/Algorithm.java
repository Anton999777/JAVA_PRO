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

    public static int[] insertionSort(int[] elements) {
        int next;
        for (int i = 0; i < elements.length - 1; i++) {
            if (elements[i] > elements[i + 1]) {
                next = elements[i + 1];
                elements[i + 1] = elements[i];
                elements[i] = next;
                for (int j = i; j > 0; j--) {
                    if (next < elements[j - 1]) {
                        elements[j] = elements[j - 1];
                        elements[j - 1] = next;
                    } else {
                        break;
                    }
                }
            }
        }
        return elements;
    }

    public static int[] bubbleSort(int[] elements) {
        for (int i = 0; i < elements.length; i++) {
            for (int j = 0; j < elements.length - 1 - i; j++) {
                if (elements[j] > elements[j + 1]) {
                    int next = elements[j + 1];
                    elements[j + 1] = elements[j];
                    elements[j] = next;
                }
            }
        }
        return elements;
    }
}
