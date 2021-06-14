package org.academiadecodigo.sshpecials.scenery;

import org.academiadecodigo.sshpecials.gameObjects.Door.AlleyDoorStreet;
import org.academiadecodigo.sshpecials.gameObjects.GameObject;
import org.academiadecodigo.sshpecials.gameObjects.Person.SeedVendor;
import org.academiadecodigo.sshpecials.gameObjects.Wall.AlleyDown;
import org.academiadecodigo.sshpecials.gameObjects.Wall.AlleyLeft;
import org.academiadecodigo.sshpecials.gameObjects.Wall.AlleyRight;
import org.academiadecodigo.sshpecials.gameObjects.Wall.AlleyUp;

public class AlleyWay extends WalkableScenery {

    private static String CHARACTER_PICTURE_PATH = "Resources/girlpackAlley2.png";
    private static int CHARACTER_INITIAL_X = 35;
    private static int CHARACTER_INITIAL_Y = 211;
    private static int CHARACTER_SPEED = 7;
    private static String PICTURE = "Resources/Alley.png";                   //Picture path for Basement Background
    private static GameObject[] gameobjects = {new AlleyDoorStreet(), new AlleyRight(),new AlleyUp(),
            new AlleyDown(), new AlleyLeft(), new SeedVendor()}; //Array of objects that can colide with character in this scenery



    public AlleyWay() {
        super(PICTURE, gameobjects, CHARACTER_INITIAL_X, CHARACTER_INITIAL_Y, CHARACTER_PICTURE_PATH, CHARACTER_SPEED);    //Calling super class constructor with the background picture and the gameObjects array
    }

    public SeedVendor getSeedVendor() {
        for(GameObject gameObject : gameobjects) {
            if(gameObject instanceof SeedVendor) {
                return (SeedVendor) gameObject;
            }
        }
        return null;
    }

    public boolean seedVendorIsActive() {

        for(GameObject gameObject : gameobjects) {
            if(gameObject instanceof SeedVendor) {
                return ((SeedVendor) gameObject).isActive();
            }
        }
        return false;
    }
}
