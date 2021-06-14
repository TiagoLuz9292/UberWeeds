package org.academiadecodigo.sshpecials.scenery;

import org.academiadecodigo.sshpecials.gameObjects.Door.StreetDoorUberStreet;
import org.academiadecodigo.sshpecials.gameObjects.Door.UberDoorStreet;
import org.academiadecodigo.sshpecials.gameObjects.GameObject;
import org.academiadecodigo.sshpecials.gameObjects.Person.Stoner;
import org.academiadecodigo.sshpecials.gameObjects.Person.StonerFactory;
import org.academiadecodigo.sshpecials.gameObjects.Person.StonerInfo;
import org.academiadecodigo.sshpecials.gameObjects.Wall.*;

public class StreetUber extends WalkableScenery {

    private static String CHARACTER_PICTURE_PATH = "Resources/girlbikeStreetUber.png";
    private static int CHARACTER_INITIAL_X = 100;
    private static int CHARACTER_INITIAL_Y = 395;
    private static int CHARACTER_SPEED = 2;
    private static String PICTURE = "Resources/streetUber.png";                   //Picture path for Basement Background


    private static GameObject[] gameobjects = {new UberDoorStreet(), new StreetUberUp(), new StreetUberUpUpWall(), new StreetDoorUberStreet(), new StreetUberDown(), new StreetUberLeft(), new StreetUberRight(),
            new StreetUberLeft(), new StreetUberRight(), StonerFactory.createStoner()};


    public StreetUber() {
        super(PICTURE, gameobjects, CHARACTER_INITIAL_X, CHARACTER_INITIAL_Y, CHARACTER_PICTURE_PATH, CHARACTER_SPEED);    //Calling super class constructor with the background picture and the gameObjects array
    }
}
