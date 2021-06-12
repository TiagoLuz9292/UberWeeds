package org.academiadecodigo.sshpecials.gameObjects.Wall;
import org.academiadecodigo.sshpecials.testing.Inventory;
public class BasementLeftWall extends Wall{

    private static int LEFT_LIMIT_X = -30;
    private static int RIGHT_LIMIT_X = 128;
    private static int UP_LIMIT_Y = 0;
    private static int DOWN_LIMIT_Y = 275;

    public BasementLeftWall(){

        super(LEFT_LIMIT_X, RIGHT_LIMIT_X, UP_LIMIT_Y, DOWN_LIMIT_Y);
    }


}
