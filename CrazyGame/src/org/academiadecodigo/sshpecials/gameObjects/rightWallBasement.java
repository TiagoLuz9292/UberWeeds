package org.academiadecodigo.sshpecials.gameObjects;


import org.academiadecodigo.sshpecials.gameObjects.GameObject;

/**
 * Wall that will block Right limit of walking area
 */
public class rightWallBasement extends GameObject {

    private static int LEFT_LIMIT_X = 850;
    private static int RIGHT_LIMIT_X =1000 ;
    private static int UP_LIMIT_Y = -130;
    private static int DOWN_LIMIT_Y = 270;


    public rightWallBasement(){
        super(LEFT_LIMIT_X, RIGHT_LIMIT_X, UP_LIMIT_Y, DOWN_LIMIT_Y);
    }

    public void changeState(){

    }
    @Override
    public String toString() {
        return "IM RIGHT WALL";
    }
}
