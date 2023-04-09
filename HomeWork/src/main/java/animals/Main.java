package animals;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Lucia", 200, 0);
        Dog dog = new Dog("Barsik", 500, 10);


        cat.run(10);
        cat.swimming(0);
        dog.run(13);
        dog.swimming(9);

        System.out.println("Було створено: " + Cat.getCatsCounter() + " котів");
        System.out.println("Було створено: " + Dog.getDogsCounter() + " собак");
        System.out.println("Було створено: " + Animal.getAnimalsCounter() + " тварини");

    }
}
