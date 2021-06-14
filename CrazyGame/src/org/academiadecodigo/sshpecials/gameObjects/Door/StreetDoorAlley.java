package org.academiadecodigo.sshpecials.gameObjects.Door;

public class StreetDoorAlley extends Door{


    private static int LEFT_LIMIT_X = 454;
    private static int RIGHT_LIMIT_X = 527;
    private static int UP_LIMIT_Y = 0;
    private static int DOWN_LIMIT_Y = 271;

    public StreetDoorAlley() {
        super(LEFT_LIMIT_X, RIGHT_LIMIT_X,  UP_LIMIT_Y, DOWN_LIMIT_Y, 5);
    }

}
