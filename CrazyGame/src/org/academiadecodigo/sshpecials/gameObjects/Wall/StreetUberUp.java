package org.academiadecodigo.sshpecials.gameObjects.Wall;

/**
 * Wall that will block lower limit of walking area
 */

public class StreetUberUp extends Wall {

    private static int LEFT_LIMIT_X = -9;
    private static int RIGHT_LIMIT_X = 795;
    private static int UP_LIMIT_Y = -1;
    private static int DOWN_LIMIT_Y = 368;

    public StreetUberUp(){

        super(LEFT_LIMIT_X, RIGHT_LIMIT_X, UP_LIMIT_Y, DOWN_LIMIT_Y);
    }

    @Override
    public void changeState() {
        super.changeState();
    }
}
