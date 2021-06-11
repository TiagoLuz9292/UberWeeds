package org.academiadecodigo.sshpecials.gameObjects.Wall;

/**
 * Wall that will block lower limit of walking area
 */

public class StreetUberLeft extends Wall {

    private static int LEFT_LIMIT_X = -25;
    private static int RIGHT_LIMIT_X = 3;
    private static int UP_LIMIT_Y = -1;
    private static int DOWN_LIMIT_Y = 388;

    public StreetUberLeft(){

        super(LEFT_LIMIT_X, RIGHT_LIMIT_X, UP_LIMIT_Y, DOWN_LIMIT_Y);
    }

    @Override
    public void changeState() {
        super.changeState();
    }
}
