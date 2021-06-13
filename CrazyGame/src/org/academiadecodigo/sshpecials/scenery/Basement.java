package org.academiadecodigo.sshpecials.scenery;


import org.academiadecodigo.sshpecials.gameObjects.*;
import org.academiadecodigo.sshpecials.gameObjects.Door.BasementDoorStreet;
import org.academiadecodigo.sshpecials.gameObjects.Wall.BasementDownWall;
import org.academiadecodigo.sshpecials.gameObjects.Wall.BasementLeftWall;
import org.academiadecodigo.sshpecials.gameObjects.Wall.BasementUpWall;

/**aa
 * Basement scenery (Place for planting and growing the Weed :D)
 */
public class Basement extends WalkableScenery {

    private static String CHARACTER_PICTURE_PATH = "Resources/girl.PNG";
    private static int CHARACTER_INITIAL_X = 157;
    private static int CHARACTER_INITIAL_Y = 181;

    private static String PICTURE = "Resources/basementFinal.PNG";                   //Picture path for Basement Background
    private static GameObject[] gameobjects = {new BasementDownWall(), new BasementDoorStreet(), new VaseOne(), new VaseTwo(), new VaseThree(), new BasementLeftWall(), new BasementUpWall()}; //Array of objects that can colide with character in this scenery


    public Basement() {
        super(PICTURE, gameobjects, CHARACTER_INITIAL_X, CHARACTER_INITIAL_Y, CHARACTER_PICTURE_PATH);    //Calling super class constructor with the background picture and the gameObjects array
    }
    @Override
    public String toString() {
        return "IM IN A BASEMENT";
    }
}
