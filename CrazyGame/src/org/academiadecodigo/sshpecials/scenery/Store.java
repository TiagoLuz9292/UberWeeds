package org.academiadecodigo.sshpecials.scenery;


import org.academiadecodigo.sshpecials.gameObjects.Door.BasementDoorKitchen;
import org.academiadecodigo.sshpecials.gameObjects.Door.BasementDoorStreet;
import org.academiadecodigo.sshpecials.gameObjects.Door.StoreDoorStreet;
import org.academiadecodigo.sshpecials.gameObjects.Door.StreetDoorStore;
import org.academiadecodigo.sshpecials.gameObjects.GameObject;
import org.academiadecodigo.sshpecials.gameObjects.Wall.*;

/**
 * Basement scenery (Place for planting and growing the Weed :D)
 */
public class Store extends WalkableScenery {

    private static String CHARACTER_PICTURE_PATH = "Resources/girlpackStore.PNG";
    private static int CHARACTER_INITIAL_X = 700;
    private static int CHARACTER_INITIAL_Y = 240;
    private static String PICTURE = "Resources/Store2.PNG";                   //Picture path for Basement Background
    private static GameObject[] gameobjects = {new StoreUp(),new StoreDown(), new StoreDoorStreet(),
    new StoreLeft(), new StoreRight()}; //Array of objects that can colide with character in this scenery
                                                                                           //We are missing 2 walls XD

    public Store() {
        super(PICTURE, gameobjects, CHARACTER_INITIAL_X, CHARACTER_INITIAL_Y, CHARACTER_PICTURE_PATH);    //Calling super class constructor with the background picture and the gameObjects array
    }
}
