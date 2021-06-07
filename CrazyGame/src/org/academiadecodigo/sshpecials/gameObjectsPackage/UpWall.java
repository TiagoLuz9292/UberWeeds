package org.academiadecodigo.sshpecials.gameObjectsPackage;


import org.academiadecodigo.sshpecials.GameObject;

/**
 * Wall that will block Upper limit of walking area
 */
public class UpWall extends GameObject {

    private static int LEFT_LIMIT_X = -90;
    private static int RIGHT_LIMIT_X = 740;
    private static int UP_LIMIT_Y = 0;
    private static int DOWN_LIMIT_Y = 115;

    public UpWall(){
        super(LEFT_LIMIT_X, RIGHT_LIMIT_X, UP_LIMIT_Y, DOWN_LIMIT_Y);

    }

    public void changeState(){

    }
}
