package org.academiadecodigo.sshpecials.sceneryPackage;


import org.academiadecodigo.sshpecials.*;
import org.academiadecodigo.sshpecials.gameObjectsPackage.RightWall;
import org.academiadecodigo.sshpecials.gameObjectsPackage.UpWall;

/**
 * Basement scenery (Place for planting and growing the Weed :D)
 */
public class Basement extends Scenery {

    //Picture path for Basement Background
    private static String PICTURE = "Resources/gameBackGroundHouse.PNG";

    //Array of objects that can colide with character in this scenery
    //We are missing 2 walls XD
    private static GameObject[] gameobjects = {new Vase(), new UpWall(), new RightWall()};

    public Basement() {
        //Calling super class constructor with the background picture and the gameObjects array
        super(PICTURE, gameobjects);
    }
}
