package org.academiadecodigo.sshpecials.scenery;


import org.academiadecodigo.sshpecials.gameObjects.Door.BasementDoorStreet;
import org.academiadecodigo.sshpecials.gameObjects.GameObject;
import org.academiadecodigo.sshpecials.gameObjects.VaseOne;
import org.academiadecodigo.sshpecials.gameObjects.VaseThree;
import org.academiadecodigo.sshpecials.gameObjects.VaseTwo;
import org.academiadecodigo.sshpecials.gameObjects.Wall.BasementDownWall;
import org.academiadecodigo.sshpecials.gameObjects.Wall.BasementLeftWall;
import org.academiadecodigo.sshpecials.gameObjects.Wall.BasementUpWall;

/**aa
 * Basement scenery (Place for planting and growing the Weed :D)
 */
public class BasementStoned extends WalkableScenery {

    private static String CHARACTER_PICTURE_PATH = "Resources/girlhigh";
    private static int CHARACTER_INITIAL_X = 855;
    private static int CHARACTER_INITIAL_Y = 211;

    private static String PICTURE = "Resources/basementHigh.PNG";                   //Picture path for Basement Background

    private static GameObject[] gameobjects = {new BasementLeftWall(), new BasementUpWall(),
            new BasementDownWall(), new BasementDoorStreet(), new VaseOne(), new VaseTwo(), new VaseThree()};

    public BasementStoned() {
        super(PICTURE,gameobjects, CHARACTER_INITIAL_X, CHARACTER_INITIAL_Y, CHARACTER_PICTURE_PATH);    //Calling super class constructor with the background picture and the gameObjects array
    }
    @Override
    public String toString() {
        return "IM IN A BASEMENT";
    }
}
