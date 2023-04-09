package exception;

import java.util.concurrent.ThreadLocalRandom;

public class ArrayValueCalculator {
    String[][] matrix = new String[4][4];
    private static final int MAX_MATRIX_SIZE = 4;

    public void arrayInitialization(String[][] values) {
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values[i].length; j++) {
                values[i][j] = String.valueOf(ThreadLocalRandom.current().nextInt(5));
            }
        }
    }

    public int doCalc(String[][] values) {
        int results = 0;
        if (values.length != MAX_MATRIX_SIZE || checkMatrixSize(values)) {
            throw new ArraySizeException("В параметр внесено розмір масиву не відповідний розміру 4х4.");
        }
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values[i].length; j++) {
                checkExceptionNull(values[i][j], i, j);
                try {
                    results = results + Integer.parseInt(values[i][j]);
                } catch (NumberFormatException e) {
                    throw new ArrayDataException("в індексі " + "[" + i + "]" + "[" + j + "]" + "" +
                            " - строкового масиву знаходиться невірні данні");
                }
            }
        }
        return results;
    }

    public void checkExceptionNull(String value, int i, int j) {
        if (value == null) {
            throw new NullPointerException("в індексі строкового масива: " + "[" + i + "]" + "[" + j + "]" + " - лежить null");
        }
    }

    public boolean checkMatrixSize(String[][] values) {
        for (int i = 0; i < values.length; i++) {
            if (values[i].length != MAX_MATRIX_SIZE) {
                return true;
            }
        }
        return false;
    }
}
