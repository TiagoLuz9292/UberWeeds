package org.academiadecodigo.sshpecials.testing;

import org.academiadecodigo.sshpecials.gameObjects.basementDoor;
import org.academiadecodigo.sshpecials.gameObjects.GameObject;
import org.academiadecodigo.sshpecials.gameObjects.rightWall;
import org.academiadecodigo.sshpecials.scenery.Scenery;

public class SceneryTeste extends Scenery {



    private static String PICTURE = "Resources/streetBackGround.png";                   //Picture path for Basement Background
    private static GameObject[] gameobjects = {new basementDoor(), new rightWall()}; //Array of objects that can colide with character in this scenery
    //We are missing 2 walls XD

    public SceneryTeste() {
        super(PICTURE, gameobjects);    //Calling super class constructor with the background picture and the gameObjects array
    }
    @Override
    public String toString() {
        return "IM IN A SCENERY TEST";
    }
}
