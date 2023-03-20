package polymorphism.event;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Obstacle[] obstacles = {
                new Racetrack(),
                new Wall() };

        Participant[] participants = {
                new Cat("Bob", 10,34),
                new Human("Anton", 500, 25),
                new Robot("Taras",800, 23) };


        for (Obstacle obstacle: obstacles) {
            for (Participant participant: participants) {
                if (participant.isStatusParticipant()) {
                    obstacle.overcome(participant);
                } else {
                    System.out.println(participant.getName() + " вибув");
                }
            }
        }
    }
}
