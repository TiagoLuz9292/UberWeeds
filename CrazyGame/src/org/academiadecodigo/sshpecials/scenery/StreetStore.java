package org.academiadecodigo.sshpecials.scenery;

import org.academiadecodigo.sshpecials.gameObjects.GameObject;
import org.academiadecodigo.sshpecials.gameObjects.Wall.*;

public class StreetStore extends Scenery{

    private static String PICTURE = "Resources/streetStore.PNG";                   //Picture path for Basement Background
    private static GameObject[] gameobjects = { new StreetStoreDownWall(), new StreetStoreUpWall(),
            new StreetStoreLeftWall(), new StreetStoreRightWall()};
    //Array of objects that can colide with character in this scenery


    public StreetStore() {
        super(PICTURE, gameobjects);    //Calling super class constructor with the background pictu
    }
}
