package exception;

import string.StringLevelOne;

import java.util.Arrays;
import java.util.zip.DataFormatException;

public class ArrayValueCalculator {

    int results = 0;
    String[][] str = new String[4][4];

    public void arrayInitialization(String[][] strings1) {
        for (int i = 0; i < strings1.length; i++) {
            for (int j = 0; j < strings1[i].length; j++) {
                strings1[i][j] = "5";
            }
        }
    }

    public int doCalc(String[][] strings1) {
        if (strings1.length != str.length || strings1[0].length != str[0].length) {
            throw new ArraySizeException("В параметр внесено розмір масиву не відповідний розміру 4х4.");
        }

        for (int i = 0; i < strings1.length; i++) {
            for (int j = 0; j < strings1[i].length; j++) {
                checkExceptionNull(strings1[i][j], i, j);

                if (checkNumbValue(strings1[i][j])) {
                    results = results + Integer.parseInt(strings1[i][j]);
                } else {
                    throw new ArrayDataException("в індексі " + "[" + i + "]" + "[" + j + "]" + "" +
                            " - строкового масиву знаходиться невірні данні");
                }
            }
        }
        return results;
    }

    public boolean checkNumbValue(String cell) {
        try {
            Integer.parseInt(cell);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public void checkExceptionNull(String value, int i, int j) {
        if (value == null) {
            throw new NullPointerException("в індексі строкового масива: " + "[" + i + "]" + "[" + j + "]" + " - лежить null");
        }
    }
}
