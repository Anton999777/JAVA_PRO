package generics;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Fruit> fruits = new ArrayList<>();
        Orange fruit = new Orange();
        Apple apple = new Apple();
        Box<Orange> box1 = new Box<>(fruit);
        Box<Apple> box2 = new Box<>(apple);
        fruits.add(new Apple());
        fruits.add(new Apple());
        box2.add(apple);
        box1.add(fruit);
        box1.add(new Orange());

        box2.addAllFruit(fruits);
        box1.compare(box2);
        box2.getWeight();
        box1.getWeight();
        box1.merge(box1);


    }
}
