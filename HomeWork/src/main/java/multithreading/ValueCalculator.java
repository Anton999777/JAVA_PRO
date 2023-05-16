package multithreading;

import java.util.Arrays;

public class ValueCalculator implements Runnable {

    private int[] numbers = new int[1_200_000];
    private int lengthArrayNum = numbers.length;
    private int half = lengthArrayNum / 2;
    private int[] secondHalfNumbers = new int[half];
    private volatile long start;
    private volatile long finish;

    public long currentTimeMillis() {
        return System.currentTimeMillis();
    }

    public int[] arrayFilling(int[] arr) {
        Arrays.fill(arr, 3);
        return arr;
    }

    public void splittingArray() {
        System.arraycopy(numbers, 0, numbers, 0, half);
        System.arraycopy(numbers, half, secondHalfNumbers, 0, half);
    }

    public float[] convertToFloat(int[] arr) {
        float[] floats = new float[arr.length];
        for (int i = 0; i < arr.length; i++) {
            floats[i] = arr[i];
        }
        return floats;
    }

    public float[] newValueForArray(float[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        return arr;
    }

    public float[] joiningArrays(float[] arr1, float[] arr2) {
        float[] floats = new float[lengthArrayNum];
        System.arraycopy(arr1, 0, floats, 0, half);
        System.arraycopy(arr2, 0, floats, half, half);
        return floats;
    }

    public String result () {
        return "Current" + Thread.currentThread().getName()
                + ": Elapsed time from the start of the program to its completion : " + (finish - start);
    }

    @Override
    synchronized public void run() {
        start = currentTimeMillis();
        arrayFilling(numbers);
        splittingArray();
        newValueForArray(convertToFloat(numbers));
        joiningArrays(convertToFloat(secondHalfNumbers), newValueForArray(convertToFloat(numbers)));
        finish = currentTimeMillis();

        System.out.println(result());
    }
}
