package org.academiadecodigo.sshpecials.gameObjects.Wall;

/**
 * Wall that will block lower limit of walking area
 */

public class StreetStoreRightWall extends Wall {

    private static int LEFT_LIMIT_X = 835;
    private static int RIGHT_LIMIT_X = 870;
    private static int UP_LIMIT_Y = 2;
    private static int DOWN_LIMIT_Y = 362;

    public StreetStoreRightWall(){

        super(LEFT_LIMIT_X, RIGHT_LIMIT_X, UP_LIMIT_Y, DOWN_LIMIT_Y);
    }

    @Override
    public void changeState() {
        super.changeState();
    }
}
