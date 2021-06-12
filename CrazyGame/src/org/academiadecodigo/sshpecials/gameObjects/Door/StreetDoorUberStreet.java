package org.academiadecodigo.sshpecials.gameObjects.Door;

import org.academiadecodigo.sshpecials.gameObjects.Wall.Wall;

public class StreetDoorUberStreet extends Door{

    private static int LEFT_LIMIT_X = 835;
    private static int RIGHT_LIMIT_X = 870;
    private static int UP_LIMIT_Y = 2;
    private static int DOWN_LIMIT_Y = 362;

    public StreetDoorUberStreet(){

        super(LEFT_LIMIT_X, RIGHT_LIMIT_X, UP_LIMIT_Y, DOWN_LIMIT_Y, 7);
    }
}
