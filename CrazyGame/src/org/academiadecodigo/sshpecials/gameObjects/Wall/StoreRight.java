package org.academiadecodigo.sshpecials.gameObjects.Wall;

/**
 * Wall that will block lower limit of walking area
 */

public class StoreRight extends Wall {

    private static int LEFT_LIMIT_X = 760;
    private static int RIGHT_LIMIT_X = 850;
    private static int UP_LIMIT_Y = 3;
    private static int DOWN_LIMIT_Y = 500;

    public StoreRight(){

        super(LEFT_LIMIT_X, RIGHT_LIMIT_X, UP_LIMIT_Y, DOWN_LIMIT_Y);
    }

}
