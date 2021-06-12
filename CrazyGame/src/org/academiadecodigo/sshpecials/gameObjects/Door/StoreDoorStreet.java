package org.academiadecodigo.sshpecials.gameObjects.Door;

public class StoreDoorStreet extends Door{
    private static int LEFT_LIMIT_X = -50;
    private static int RIGHT_LIMIT_X = -10;
    private static int UP_LIMIT_Y = 3;
    private static int DOWN_LIMIT_Y = 300;

    public StoreDoorStreet(){

        super(LEFT_LIMIT_X, RIGHT_LIMIT_X, UP_LIMIT_Y, DOWN_LIMIT_Y, 4);
    }
}
