package org.academiadecodigo.sshpecials.scenery;

import org.academiadecodigo.sshpecials.gameObjects.GameObject;
import org.academiadecodigo.sshpecials.gameObjects.Wall.AlleyDown;
import org.academiadecodigo.sshpecials.gameObjects.Wall.AlleyLeft;
import org.academiadecodigo.sshpecials.gameObjects.Wall.AlleyRight;
import org.academiadecodigo.sshpecials.gameObjects.Wall.AlleyUp;

public class AlleyWay extends Scenery {

    private static String PICTURE = "Resources/Alley.PNG";                   //Picture path for Basement Background
    private static GameObject[] gameobjects = {new AlleyRight(),new AlleyUp(),
            new AlleyDown(), new AlleyLeft()}; //Array of objects that can colide with character in this scenery


    public AlleyWay() {
        super(PICTURE, gameobjects);    //Calling super class constructor with the background picture and the gameObjects array
    }
}
