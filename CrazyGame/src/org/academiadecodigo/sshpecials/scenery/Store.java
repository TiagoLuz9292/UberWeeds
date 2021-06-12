package org.academiadecodigo.sshpecials.scenery;


import org.academiadecodigo.sshpecials.gameObjects.Door.BasementDoorKitchen;
import org.academiadecodigo.sshpecials.gameObjects.Door.BasementDoorStreet;
import org.academiadecodigo.sshpecials.gameObjects.GameObject;
import org.academiadecodigo.sshpecials.gameObjects.Wall.*;

/**
 * Basement scenery (Place for planting and growing the Weed :D)
 */
public class Store extends Scenery {


    private static String PICTURE = "Resources/Store2.PNG";                   //Picture path for Basement Background
    private static GameObject[] gameobjects = {new StoreUp(),new StoreDown(),
    new StoreLeft(), new StoreRight()}; //Array of objects that can colide with character in this scenery
                                                                                           //We are missing 2 walls XD

    public Store() {
        super(PICTURE, gameobjects);    //Calling super class constructor with the background picture and the gameObjects array
    }
}
