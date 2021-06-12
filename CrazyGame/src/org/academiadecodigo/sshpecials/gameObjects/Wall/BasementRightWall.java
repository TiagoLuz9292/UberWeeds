package org.academiadecodigo.sshpecials.gameObjects.Wall;


import org.academiadecodigo.sshpecials.gameObjects.Wall.Wall;

/**
 * Wall that will block Right limit of walking area
 */
public class BasementRightWall extends Wall {

    private static int LEFT_LIMIT_X = 850;
    private static int RIGHT_LIMIT_X = 920;
    private static int UP_LIMIT_Y = 0;
    private static int DOWN_LIMIT_Y = 275;

    public BasementRightWall(){

        super(LEFT_LIMIT_X, RIGHT_LIMIT_X, UP_LIMIT_Y, DOWN_LIMIT_Y);
    }


    @Override
    public String toString() {
        return "IM RIGHT WALL";
    }
}
