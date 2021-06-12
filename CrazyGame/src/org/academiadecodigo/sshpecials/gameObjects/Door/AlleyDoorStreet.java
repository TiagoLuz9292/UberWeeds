package org.academiadecodigo.sshpecials.gameObjects.Door;

public class AlleyDoorStreet extends Door{

    private static int LEFT_LIMIT_X = -50;
    private static int RIGHT_LIMIT_X = 31;
    private static int UP_LIMIT_Y = -9;
    private static int DOWN_LIMIT_Y = 450;

    public AlleyDoorStreet() {
        super(LEFT_LIMIT_X, RIGHT_LIMIT_X, UP_LIMIT_Y, DOWN_LIMIT_Y, 4);
    }
}
