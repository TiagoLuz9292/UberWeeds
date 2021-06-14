package org.academiadecodigo.sshpecials.scenery;

        import org.academiadecodigo.sshpecials.gameObjects.GameObject;

public class MainMenuInstructions extends Scenery {

    private static String PICTURE = "Resources/InstructionsMenu.png";

    public MainMenuInstructions() {
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
