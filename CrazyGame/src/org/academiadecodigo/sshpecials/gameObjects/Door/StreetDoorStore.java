package org.academiadecodigo.sshpecials.gameObjects.Door;

public class StreetDoorStore extends Door{

    private static int LEFT_LIMIT_X = 660;
    private static int RIGHT_LIMIT_X = 690;
    private static int UP_LIMIT_Y = 0;
    private static int DOWN_LIMIT_Y = 292;

    public StreetDoorStore() {
        super(LEFT_LIMIT_X, RIGHT_LIMIT_X,  UP_LIMIT_Y, DOWN_LIMIT_Y, 6);
    }
}
