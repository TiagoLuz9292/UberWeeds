package org.academiadecodigo.sshpecials.scenery;

import org.academiadecodigo.sshpecials.gameObjects.GameObject;

public class MainMenuStartOption extends Scenery {

    private static String PICTURE = "Resources/StartGameOptionMenu.png";

    public MainMenuStartOption() {
        super(PICTURE);
    }

    @Override
    public String toString() {
        return "IM IN A MAINMENU";

    }

    @Override
    public GameObject[] getGameObjects() {
        return null;
    }
}
