package org.academiadecodigo.sshpecials.gameObjects.Wall;

import org.academiadecodigo.sshpecials.testing.Inventory;

/**
 * Wall that will block lower limit of walking area
 */

public class StreetStoreLeftWall extends Wall {

    private static int LEFT_LIMIT_X = 19;
    private static int RIGHT_LIMIT_X = -3;
    private static int UP_LIMIT_Y = 2;
    private static int DOWN_LIMIT_Y = 362;

    public StreetStoreLeftWall(){

        super(LEFT_LIMIT_X, RIGHT_LIMIT_X, UP_LIMIT_Y, DOWN_LIMIT_Y);
    }

    @Override
    public void changeState(Inventory inventory) {

    }
}
