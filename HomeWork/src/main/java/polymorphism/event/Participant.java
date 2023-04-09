package polymorphism.event;

public abstract class Participant {

    private int participantResult;

    boolean statusParticipant = true;
    private String name;
    private int runningLimit;
    private int jumpLimit;

    public Participant(String name, int runningLimit, int jumpLimit) {
        this.name = name;
        this.runningLimit = runningLimit;
        this.jumpLimit = jumpLimit;
    }

    public String getName() {
        return name;
    }

    public double getParticipantResult() {
        return participantResult;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isStatusParticipant() {
        return statusParticipant;
    }

    public abstract void run();

    public abstract void jump();

    public boolean constraintCheckJump() {
        Wall wall = new Wall();
        if (wall.getWallHeight() >= this.jumpLimit) {
            this.statusParticipant = false;
            this.participantResult = (int) (Math.random() * this.jumpLimit) + 1;
            return false;
        } else {
            this.statusParticipant = true;
            return true;
        }
    }

    public boolean constraintCheckRun() {
        Racetrack racetrack = new Racetrack();
        if (racetrack.getTrackLength() >= this.runningLimit) {
            this.statusParticipant = false;
            this.participantResult = (int) (Math.random() * this.runningLimit) + 1;
            return false;
        } else {
            this.statusParticipant = true;
            return true;
        }
    }
}
