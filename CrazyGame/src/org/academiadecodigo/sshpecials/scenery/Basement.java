package org.academiadecodigo.sshpecials.scenery;


import org.academiadecodigo.sshpecials.gameObjects.*;
import org.academiadecodigo.sshpecials.gameObjects.Door.BasementDoorKitchen;
import org.academiadecodigo.sshpecials.gameObjects.Door.BasementDoorStreet;
import org.academiadecodigo.sshpecials.gameObjects.Wall.BasementDownWall;
import org.academiadecodigo.sshpecials.gameObjects.Wall.BasementLeftWall;
import org.academiadecodigo.sshpecials.gameObjects.Wall.BasementRightWall;
import org.academiadecodigo.sshpecials.gameObjects.Wall.BasementUpWall;

/**
 * Basement scenery (Place for planting and growing the Weed :D)
 */
public class Basement extends Scenery {


    private static String PICTURE = "Resources/basementFinal.PNG";                   //Picture path for Basement Background
    private static GameObject[] gameobjects = { new BasementUpWall(),new BasementLeftWall(), new BasementRightWall(), new BasementDownWall(),
            new BasementDoorStreet(), new BasementDoorKitchen()}; //Array of objects that can colide with character in this scenery
                                                                                           //We are missing 2 walls XD

    public Basement() {
        super(PICTURE, gameobjects);    //Calling super class constructor with the background picture and the gameObjects array
    }
    @Override
    public String toString() {
        return "IM IN A BASEMENT";
    }
}
