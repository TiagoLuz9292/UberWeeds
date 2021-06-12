package org.academiadecodigo.sshpecials.gameObjects.Wall;

public class StreetUberUpUpWall extends Wall{

    private static int LEFT_LIMIT_X = -9;
    private static int RIGHT_LIMIT_X = 1000;
    private static int UP_LIMIT_Y = -1;
    private static int DOWN_LIMIT_Y = 383;

    public StreetUberUpUpWall(){

        super(LEFT_LIMIT_X, RIGHT_LIMIT_X, UP_LIMIT_Y, DOWN_LIMIT_Y);

    }
}
