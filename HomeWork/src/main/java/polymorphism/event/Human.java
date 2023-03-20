package polymorphism.event;

public class Human extends Participant {

    public Human(String name, int runningLimit, int jumpLimit) {
        super(name, runningLimit, jumpLimit);
    }

    @Override
    public void run() {
        Racetrack racetrack = new Racetrack();

        if (constraintCheckRun()) {
            System.out.println("Участник: " + getName() + " пройшов перешкоду: "
                    + racetrack.getName() + ", на дистанції " + racetrack.getTrackLength() + " м");
        } else {
            System.out.println("Участник: " + getName() + " не пройшов перешкоду " + racetrack.getName() + " на дистанції "
                    + racetrack.getTrackLength() + ", Пройдено: " + getParticipantResult());
        }
    }

    @Override
    public void jump() {
        Wall wall = new Wall();
        if (constraintCheckJump()) {
            System.out.println("Участник: " + getName() + " пройшов перешкоду: "
                    + wall.getName() + ", на висоті " + wall.getWallHeight() + " м");
        } else {
            System.out.println("Участник: " + getName() + " не пройшов перешкоду " + wall.getName() + " висота якої: "
                    + wall.getWallHeight() + " м " + " Результат участника: " + getParticipantResult() + " м");
        }

    }
}
