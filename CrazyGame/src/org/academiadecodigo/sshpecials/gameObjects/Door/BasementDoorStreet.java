package org.academiadecodigo.sshpecials.gameObjects.Door;

import org.academiadecodigo.sshpecials.gameObjects.GameObject;

public class BasementDoorStreet extends Door {


    private static int LEFT_LIMIT_X = 850;
    private static int RIGHT_LIMIT_X = 920;
    private static int UP_LIMIT_Y = 0;
    private static int DOWN_LIMIT_Y = 700;


    public BasementDoorStreet() {
        super(LEFT_LIMIT_X, RIGHT_LIMIT_X, UP_LIMIT_Y, DOWN_LIMIT_Y,1);
    }

    public void changeState(){

    }
    @Override
    public String toString() {
        return "IM A DOOR";
    }
}
