package org.academiadecodigo.sshpecials.scenery;

import org.academiadecodigo.sshpecials.gameObjects.GameObject;
import org.academiadecodigo.sshpecials.gameObjects.Wall.StreetUberDown;
import org.academiadecodigo.sshpecials.gameObjects.Wall.StreetUberLeft;
import org.academiadecodigo.sshpecials.gameObjects.Wall.StreetUberRight;
import org.academiadecodigo.sshpecials.gameObjects.Wall.StreetUberUp;

public class StreetUber extends Scenery {

    private static String PICTURE = "Resources/streetUber.PNG";                   //Picture path for Basement Background
    private static GameObject[] gameobjects = {new StreetUberUp(), new StreetUberDown(),
            new StreetUberLeft(), new StreetUberRight()}; //Array of objects that can colide with character in this scenery


    public StreetUber() {
        super(PICTURE, gameobjects);    //Calling super class constructor with the background picture and the gameObjects array
    }
}
