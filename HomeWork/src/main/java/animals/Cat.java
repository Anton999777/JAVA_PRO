package animals;

public class Cat extends Animals {

    private static int counterCats;
    public Cat(String name, int runRestriction, int swimRestriction) {
        super(name, runRestriction, swimRestriction);
        counterCats++;
    }

    public static int getCounterCats() {
        return counterCats;
    }

    @Override
    public void run (int lengthBarrier) {
        super.run(lengthBarrier);

       if (lengthBarrier < 0) {
           System.out.println("Please enter a positive number for the length of the barrier");
        } else if (lengthBarrier > getRunRestriction()) {
            System.out.println(getName() + " не може бігти більш ніж " + getRunRestriction() + "м :(");
        } else {
            System.out.println(getName() + " пробіг " + lengthBarrier + "м");
        }
    }

    @Override
    public void swimming(int lengthBarrier) {
        super.swimming(lengthBarrier);

         if (0 > lengthBarrier) {
             System.out.println("Please enter a positive number for the length of the barrier");
         } else if (getSwimRestriction() == 0) {
            System.out.println(getName() + " не вміє плавати :(");
        } else if (lengthBarrier < getSwimRestriction()) {
            System.out.println(getName() + " проплив " + lengthBarrier + "м");
        }
    }
}
