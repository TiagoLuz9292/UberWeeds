package org.academiadecodigo.sshpecials;


/**
 * Basement scenery (Place for planting and growing the Weed :D)
 */
public class Basement extends Scenery{


    private static String PICTURE = "Resources/gameBackGroundHouse.PNG";                   //Picture path for Basement Background
    private static GameObject[] gameobjects = {new Vase(), new upWall(), new rightWall()}; //Array of objects that can colide with character in this scenery
                                                                                           //We are missing 2 walls XD

    public Basement() {
        super(PICTURE, gameobjects);    //Calling super class constructor with the background picture and the gameObjects array
    }
}
