package polymorphism.event;

public class Wall implements Obstacle {

    private String name = "Стіна";
    private int wallHeight = 30;

    public int getWallHeight() {
        return wallHeight;
    }

    public String getName() {
        return name;
    }

    @Override
    public void overcome(Participant participant) {
        participant.jump();
    }
}
