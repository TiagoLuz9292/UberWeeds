package org.academiadecodigo.sshpecials.scenery;

import org.academiadecodigo.sshpecials.gameObjects.GameObject;

public class MainMenuInstructionsOption extends Scenery {

    private static String PICTURE = "InstructionsOptionMenu.png";

    public MainMenuInstructionsOption() {
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