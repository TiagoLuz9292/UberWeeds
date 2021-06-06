package org.academiadecodigo.sshpecials;

public class sceneryTeste extends Scenery{
    private static String PICTURE = "Resources/gameBackGroundHouse.PNG";                   //Picture path for Basement Background
    private static GameObject[] gameobjects = {}; //Array of objects that can colide with character in this scenery
    //We are missing 2 walls XD

    public sceneryTeste() {
        super(PICTURE, gameobjects);    //Calling super class constructor with the background picture and the gameObjects array
    }
}
