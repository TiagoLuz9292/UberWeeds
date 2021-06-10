package org.academiadecodigo.sshpecials.gameObjects.Wall;

import org.academiadecodigo.sshpecials.gameObjects.Wall.Wall;

/**
 * Wall that will block lower limit of walking area
 */

public class DownWall extends Wall {

    private static int LEFT_LIMIT_X = -30;
    private static int RIGHT_LIMIT_X = 920;
    private static int UP_LIMIT_Y = 215;
    private static int DOWN_LIMIT_Y = 275;

    public DownWall(){

        super(LEFT_LIMIT_X, RIGHT_LIMIT_X, UP_LIMIT_Y, DOWN_LIMIT_Y);
    }

    @Override
    public void changeState() {
        super.changeState();
    }
}
