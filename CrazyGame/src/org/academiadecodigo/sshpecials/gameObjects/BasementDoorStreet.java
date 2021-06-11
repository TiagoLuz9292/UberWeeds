package org.academiadecodigo.sshpecials.gameObjects;

import org.academiadecodigo.sshpecials.testing.Inventory;

public class BasementDoorStreet extends GameObject {


    private static int LEFT_LIMIT_X = 63;
    private static int RIGHT_LIMIT_X = 140;
    private static int UP_LIMIT_Y = 0;
    private static int DOWN_LIMIT_Y = 130;


    public BasementDoorStreet() {
        super(LEFT_LIMIT_X, RIGHT_LIMIT_X, UP_LIMIT_Y, DOWN_LIMIT_Y);
    }

    public void changeState(Inventory inventory){

    }
    public int getNextSceneryIndex() {
        return 1;
    }
    @Override
    public String toString() {
        return "IM A DOOR";
    }
}
