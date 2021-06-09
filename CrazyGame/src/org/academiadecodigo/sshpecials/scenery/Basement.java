package org.academiadecodigo.sshpecials.scenery;


import org.academiadecodigo.sshpecials.gameObjects.*;

/**
 * Basement scenery (Place for planting and growing the Weed :D)
 */
public class Basement extends Scenery {


    private static String PICTURE = "Resources/gameBackGroundHouse.PNG";                   //Picture path for Basement Background
    private static GameObject[] gameobjects = {new VaseOne(), new VaseTwo(), new upWall(), new rightWall(), new basementDoor()}; //Array of objects that can colide with character in this scenery
                                                                                           //We are missing 2 walls XD

    public Basement() {
        super(PICTURE, gameobjects);    //Calling super class constructor with the background picture and the gameObjects array
    }
    @Override
    public String toString() {
        return "IM IN A BASEMENT";
    }
}
