package org.academiadecodigo.sshpecials.gameObjects;

public class Door extends GameObject {


    private static int LEFT_LIMIT_X = 63;
    private static int RIGHT_LIMIT_X = 140;
    private static int UP_LIMIT_Y = 0;
    private static int DOWN_LIMIT_Y = 130;


    public Door() {
        super(LEFT_LIMIT_X, RIGHT_LIMIT_X, UP_LIMIT_Y, DOWN_LIMIT_Y);
    }

    public void changeState(){

    }
    @Override
    public String toString() {
        return "IM A DOOR";
    }
}
