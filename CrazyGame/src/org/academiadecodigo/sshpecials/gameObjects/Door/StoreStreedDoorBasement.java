package org.academiadecodigo.sshpecials.gameObjects.Door;

public class StoreStreedDoorBasement extends Door{

    private static int LEFT_LIMIT_X = 171;
    private static int RIGHT_LIMIT_X = 240;
    private static int UP_LIMIT_Y = 0;
    private static int DOWN_LIMIT_Y = 292;


    public StoreStreedDoorBasement() {
        super(LEFT_LIMIT_X, RIGHT_LIMIT_X, UP_LIMIT_Y, DOWN_LIMIT_Y, 3);
    }

    public void changeState(){

    }
    @Override
    public String toString() {
        return "IM A DOOR";
    }
}
