package org.academiadecodigo.sshpecials.scenery;

import org.academiadecodigo.sshpecials.gameObjects.GameObject;

public class AlleyWay extends Scenery {

    private static String PICTURE = "Resources/Alley.PNG";                   //Picture path for Basement Background
    private static GameObject[] gameobjects = {}; //Array of objects that can colide with character in this scenery


    public AlleyWay() {
        super(PICTURE, gameobjects);    //Calling super class constructor with the background picture and the gameObjects array
    }
}
