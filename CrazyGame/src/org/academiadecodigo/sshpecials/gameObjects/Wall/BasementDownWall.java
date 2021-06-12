package org.academiadecodigo.sshpecials.gameObjects.Wall;

import org.academiadecodigo.sshpecials.gameObjects.Wall.Wall;
import org.academiadecodigo.sshpecials.testing.Inventory;

/**
 * Wall that will block lower limit of walking area
 */

public class BasementDownWall extends Wall {

    private static int LEFT_LIMIT_X = -30;
    private static int RIGHT_LIMIT_X = 920;
    private static int UP_LIMIT_Y = 220;
    private static int DOWN_LIMIT_Y = 300;

    public BasementDownWall(){

        super(LEFT_LIMIT_X, RIGHT_LIMIT_X, UP_LIMIT_Y, DOWN_LIMIT_Y);
    }

}
