package animals;

public class Animal {

    private static int animalsCounter;
    private String name;
    private int runRestriction;
    private int swimRestriction;


    public Animal(String name, int runRestriction, int swimRestriction) {
        this.name = name;
        this.runRestriction = runRestriction;
        this.swimRestriction = swimRestriction;
        animalsCounter++;
    }

    public static int getAnimalsCounter() {
        return animalsCounter;
    }

    public int getRunRestriction() {
        return runRestriction;
    }

    public int getSwimRestriction() {
        return swimRestriction;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void run(int lengthBarrier) {
        System.out.println("Animal running");
    }

    public void swimming(int lengthBarrier) {
        System.out.println("Animal swimming");
    }
}
