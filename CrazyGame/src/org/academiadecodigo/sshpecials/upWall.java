package org.academiadecodigo.sshpecials;


/**
 * Wall that will block Upper limit of walking area
 */
public class upWall extends GameObject{

    private static int LEFT_LIMIT_X = 0;
    private static int RIGHT_LIMIT_X = 740;
    private static int UP_LIMIT_Y = 0;
    private static int DOWN_LIMIT_Y = 115;

    public upWall(){
        super(LEFT_LIMIT_X, RIGHT_LIMIT_X, UP_LIMIT_Y, DOWN_LIMIT_Y);

    }

    public void changeState(){

    }
}
