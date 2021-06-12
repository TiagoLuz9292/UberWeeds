package org.academiadecodigo.sshpecials.gameObjects.Door;

public class UberDoorStreet extends Door{

    private static int LEFT_LIMIT_X = -25;
    private static int RIGHT_LIMIT_X = 12;
    private static int UP_LIMIT_Y = -1;
    private static int DOWN_LIMIT_Y = 600;

    public UberDoorStreet(){

        super(LEFT_LIMIT_X, RIGHT_LIMIT_X, UP_LIMIT_Y, DOWN_LIMIT_Y, 4);
    }
}
