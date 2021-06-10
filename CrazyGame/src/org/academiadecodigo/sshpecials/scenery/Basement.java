package org.academiadecodigo.sshpecials.scenery;


import org.academiadecodigo.sshpecials.gameObjects.*;
import org.academiadecodigo.sshpecials.gameObjects.Wall.DownWall;
import org.academiadecodigo.sshpecials.gameObjects.Wall.LeftWall;
import org.academiadecodigo.sshpecials.gameObjects.Wall.RightWall;
import org.academiadecodigo.sshpecials.gameObjects.Wall.UpWall;

/**
 * Basement scenery (Place for planting and growing the Weed :D)
 */
public class Basement extends Scenery {


    private static String PICTURE = "Resources/basementFinal.PNG";                   //Picture path for Basement Background
    private static GameObject[] gameobjects = { new UpWall(), new RightWall(),new LeftWall(), new DownWall()}; //Array of objects that can colide with character in this scenery
                                                                                           //We are missing 2 walls XD

    public Basement() {
        super(PICTURE, gameobjects);    //Calling super class constructor with the background picture and the gameObjects array
    }
    @Override
    public String toString() {
        return "IM IN A BASEMENT";
    }
}
