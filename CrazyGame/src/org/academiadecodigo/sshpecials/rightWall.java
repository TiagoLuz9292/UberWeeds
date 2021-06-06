package org.academiadecodigo.sshpecials;

public class rightWall extends GameObject{

    private static int LEFT_LIMIT_X = 720;
    private static int RIGHT_LIMIT_X = 1000;
    private static int UP_LIMIT_Y = 0;
    private static int DOWN_LIMIT_Y = 1000;

    public rightWall(){
        super(LEFT_LIMIT_X, RIGHT_LIMIT_X, UP_LIMIT_Y, DOWN_LIMIT_Y);
    }

    public void changeState(){

    }
}
