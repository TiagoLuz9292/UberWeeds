package org.academiadecodigo.sshpecials.scenery;

import org.academiadecodigo.sshpecials.gameObjects.Door.AlleyDoorStreet;
import org.academiadecodigo.sshpecials.gameObjects.GameObject;
import org.academiadecodigo.sshpecials.gameObjects.SeedVendor;
import org.academiadecodigo.sshpecials.gameObjects.Wall.AlleyDown;
import org.academiadecodigo.sshpecials.gameObjects.Wall.AlleyLeft;
import org.academiadecodigo.sshpecials.gameObjects.Wall.AlleyRight;
import org.academiadecodigo.sshpecials.gameObjects.Wall.AlleyUp;

public class AlleyWay extends WalkableScenery {

    private static String CHARACTER_PICTURE_PATH = "Resources/catiaBasement.PNG";
    private static int CHARACTER_INITIAL_X = 35;
    private static int CHARACTER_INITIAL_Y = 371;
    private static String PICTURE = "Resources/Alley.PNG";                   //Picture path for Basement Background
    private static GameObject[] gameobjects = {new AlleyDoorStreet(), new AlleyRight(),new AlleyUp(),
            new AlleyDown(), new AlleyLeft(), new SeedVendor()}; //Array of objects that can colide with character in this scenery


    public AlleyWay() {
        super(PICTURE, gameobjects, CHARACTER_INITIAL_X, CHARACTER_INITIAL_Y, CHARACTER_PICTURE_PATH);    //Calling super class constructor with the background picture and the gameObjects array
    }
}
