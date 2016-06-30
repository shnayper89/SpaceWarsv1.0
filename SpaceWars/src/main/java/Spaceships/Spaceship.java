package Spaceships;

import Movement.Movement;

/**
 * Created by spirit on 6/30/16.
 */
public class Spaceship extends Movement {

    public Spaceship(String name, int xp, int rockets, int axisX, int axisY) {
        this.name = name;
        this.xp = xp;
        this.rockets = rockets;
        this.axisX = axisX;
        this.axisY = axisY;

    }


}
