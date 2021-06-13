package org.academiadecodigo.sshpecials.scenery;

import org.academiadecodigo.sshpecials.gameObjects.Door.StreetDoorUberStreet;
import org.academiadecodigo.sshpecials.gameObjects.Door.UberDoorStreet;
import org.academiadecodigo.sshpecials.gameObjects.GameObject;
import org.academiadecodigo.sshpecials.gameObjects.Wall.*;

public class StreetUber extends WalkableScenery {

    private static String CHARACTER_PICTURE_PATH = "Resources/girlbikeStreetUber.PNG";
    private static int CHARACTER_INITIAL_X = 100;
    private static int CHARACTER_INITIAL_Y = 405;
    private static String PICTURE = "Resources/streetUber.PNG";                   //Picture path for Basement Background
    private static GameObject[] gameobjects = {new UberDoorStreet(), new StreetUberUp(), new StreetUberUpUpWall(), new StreetDoorUberStreet(), new StreetUberDown(), new StreetUberLeft(), new StreetUberRight(),
            new StreetUberLeft(), new StreetUberRight()}; //Array of objects that can colide with character in this scenery


    public StreetUber() {
        super(PICTURE, gameobjects, CHARACTER_INITIAL_X, CHARACTER_INITIAL_Y, CHARACTER_PICTURE_PATH);    //Calling super class constructor with the background picture and the gameObjects array
    }
}
