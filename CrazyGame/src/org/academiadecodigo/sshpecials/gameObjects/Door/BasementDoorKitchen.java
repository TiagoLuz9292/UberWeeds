package org.academiadecodigo.sshpecials.gameObjects.Door;

public class BasementDoorKitchen extends Door {

    private static int LEFT_LIMIT_X = -30;
    private static int RIGHT_LIMIT_X = 128;
    private static int UP_LIMIT_Y = 0;
    private static int DOWN_LIMIT_Y = 275;


    public BasementDoorKitchen() {
        super(LEFT_LIMIT_X,RIGHT_LIMIT_X , UP_LIMIT_Y , DOWN_LIMIT_Y,5);
    }

    public void changeState(){

    }
    public int getNextSceneryIndex() {
        return 1;
    }
    @Override
    public String toString() {
        return "IM A DOOR";
    }
}


