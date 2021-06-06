package org.academiadecodigo.sshpecials;

public class Basement extends Scenery{

    private static String PICTURE = "Resources/gameBackGroundHouse.PNG";
    private static GameObject[] gameobjects = {new Vase(), new upWall(), new rightWall()};

    public Basement() {
        super(PICTURE, gameobjects);
    }
}
