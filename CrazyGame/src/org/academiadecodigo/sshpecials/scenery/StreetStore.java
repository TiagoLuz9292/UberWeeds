package org.academiadecodigo.sshpecials.scenery;

import org.academiadecodigo.sshpecials.gameObjects.Door.StoreStreedDoorBasement;
import org.academiadecodigo.sshpecials.gameObjects.GameObject;
import org.academiadecodigo.sshpecials.gameObjects.Wall.StreetStoreUpWall;

public class StreetStore extends WalkableScenery {

    private static String PICTURE = "Resources/streetStore.PNG";                   //Picture path for Basement Background
    private static GameObject[] gameobjects = { new StreetStoreUpWall(), new StoreStreedDoorBasement()};

    private static String CHARACTER_PICTURE_PATH = "Resources/catiaStreetStore.PNG";
    private static int CHARACTER_INITIAL_X = 213;
    private static int CHARACTER_INITIAL_Y = 294;

    //Array of objects that can colide with character in this scenery


    public StreetStore() {
        super(PICTURE, gameobjects, CHARACTER_INITIAL_X, CHARACTER_INITIAL_Y, CHARACTER_PICTURE_PATH);    //Calling super class constructor with the background pictu
    }
}
