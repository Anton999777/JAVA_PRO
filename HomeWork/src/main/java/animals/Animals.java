package animals;

public class Animals {
    private String name;
    private int runRestriction;
    private int swimRestriction;

    private static int counterAnimals;


    public Animals(String name, int runRestriction, int swimRestriction) {
        this.name = name;
        this.runRestriction = runRestriction;
        this.swimRestriction = swimRestriction;
        counterAnimals++;
    }

    public static int getCounterAnimals() {
        return counterAnimals;
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

    public void run (int lengthBarrier) {
        System.out.println("Animal running");
    }

    public void swimming (int lengthBarrier) {
        System.out.println("Animal swimming");
    }
}
