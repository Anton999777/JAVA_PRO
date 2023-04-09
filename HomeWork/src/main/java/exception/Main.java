package exception;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayValueCalculator arrayValueCalculator = new ArrayValueCalculator();
        String[][] str = new String[4][4];

        arrayValueCalculator.arrayInitialization(str);
        System.out.println("Сума всіх чисел строковго массиву: " + arrayValueCalculator.doCalc(str));
    }


}
