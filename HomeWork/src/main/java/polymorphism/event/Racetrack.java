package polymorphism.event;

public class Racetrack implements Obstacle {

    private String name = " Бігова доріжка ";
    private int trackLength = 200;

    public int getTrackLength() {
        return trackLength;
    }

    public String getName() {
        return name;
    }

    @Override
    public void overcome(Participant participant) {
        participant.run();
    }
}
