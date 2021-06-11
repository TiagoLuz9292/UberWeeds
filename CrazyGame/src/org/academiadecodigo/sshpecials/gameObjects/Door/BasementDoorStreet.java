package org.academiadecodigo.sshpecials.gameObjects.Door;

import org.academiadecodigo.sshpecials.gameObjects.Door.Door;
import org.academiadecodigo.sshpecials.testing.Inventory;

public class BasementDoorStreet extends Door {


    private static int LEFT_LIMIT_X = 855;
    private static int RIGHT_LIMIT_X = 875;
    private static int UP_LIMIT_Y = 0;
    private static int DOWN_LIMIT_Y = 250;


    public BasementDoorStreet() {
        super(LEFT_LIMIT_X, RIGHT_LIMIT_X, UP_LIMIT_Y, DOWN_LIMIT_Y, 4);
    }

    public void changeState(Inventory inventory){

    }

    @Override
    public String toString() {
        return "IM A DOOR";
    }
}
