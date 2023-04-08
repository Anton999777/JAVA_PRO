package animals;

public class Cat extends Animal {

    private static int catsCounter;

    public Cat(String name, int runRestriction, int swimRestriction) {
        super(name, runRestriction, swimRestriction);
        catsCounter++;
    }

    public static int getCatsCounter() {
        return catsCounter;
    }

    @Override
    public void swimming(int lengthBarrier) {
        System.out.println("Коти не плавають!");
    }

    @Override
    public void run(int lengthBarrier) {
        if (lengthBarrier < 0) {
            System.out.println("Please enter a positive number for the length of the barrier");
        } else if (lengthBarrier > getRunRestriction()) {
            System.out.println(getName() + " не може бігти більш ніж " + getRunRestriction() + "м :(");
        } else {
            System.out.println(getName() + " пробіг " + lengthBarrier + "м");
        }
    }
}
