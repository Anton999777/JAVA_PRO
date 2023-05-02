package coffee.order;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        CoffeeOrderBoard coffeeOrderBoard = new CoffeeOrderBoard();

        coffeeOrderBoard.add(new Order("Anton"));
        coffeeOrderBoard.add(new Order("Sergey"));
        coffeeOrderBoard.add(new Order("Serey"));
        coffeeOrderBoard.add(new Order("Srgey"));
        coffeeOrderBoard.add(new Order("Sery"));
        coffeeOrderBoard.add(new Order("sttttt"));


        System.out.println(coffeeOrderBoard.draw());
        coffeeOrderBoard.deliver();
        System.out.println(coffeeOrderBoard.draw());
        coffeeOrderBoard.deliver();
        coffeeOrderBoard.deliverByNumber(4);
        coffeeOrderBoard.deliverByNumber(6);
        System.out.println(coffeeOrderBoard.draw());
        coffeeOrderBoard.add(new Order("Sery"));
        coffeeOrderBoard.add(new Order("RRRRRRRR"));
        coffeeOrderBoard.add(new Order("YYYYYYY"));
        System.out.println(coffeeOrderBoard.draw());
    }
}
