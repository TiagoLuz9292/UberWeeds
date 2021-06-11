package org.academiadecodigo.sshpecials.testing;

import org.academiadecodigo.sshpecials.game.Character;
import org.academiadecodigo.sshpecials.game.ColisionDetector;
import org.academiadecodigo.sshpecials.gameObjects.Door.BasementDoorStreet;
import org.academiadecodigo.sshpecials.gameObjects.Door.Door;
import org.academiadecodigo.sshpecials.gameObjects.GameObject;
import org.academiadecodigo.sshpecials.scenery.Scenery;

public class Game {


    private Character character;

    private Scenery activeScenery;
    private Scenery[] sceneries;
    private UserInterface userInterface;
    private ColisionDetector colisionDetector;

    public Game(ColisionDetector colisionDetector, Character character, Scenery[] sceneries) {
        this.colisionDetector = colisionDetector;
        this.character = character;
        this.sceneries = sceneries;
/**
 * Primeiro cenario
 */
        activeScenery = sceneries[4];
        colisionDetector.setGameObjects(activeScenery.getGameObjects());
    }

    public void init() {
        activeScenery.show();

        colisionDetector.setGameObjects(activeScenery.getGameObjects()); //Setting the inicial Scenery GameObject array
        GameObject[] gameObjects = activeScenery.getGameObjects();
        for (int i = 0; i < gameObjects.length; i++) {
            gameObjects[i].show();
            System.out.println(gameObjects[i]);
        }
        character.showPicture();
        userInterface = new UserInterface(character.getInventory());
        start();
    }
    public void start() {
        while(true) {
            if(character.isInteractable() && character.checkInRangeWithObject()) {
                GameObject gameObject = character.getObjectInRange();
                if(gameObject instanceof Door) {
                    System.out.println(" entrei");
                    setActiveScenery(1);
                }
                if(gameObject instanceof Vase) {
                    System.out.println("im near vaseOne!");

                    character.interact(gameObject);
                    }
                }
            character.move();
            try{
                Thread.sleep(5);
            }catch(Exception e) {
                System.out.println(e);
            }
        }
    }

    public void setActiveScenery(int sceneryIndex) {

        activeScenery.hide();
        activeScenery = sceneries[sceneryIndex];
        activeScenery.show();

        character.showPicture();
        userInterface.update();
        colisionDetector.setGameObjects(activeScenery.getGameObjects());

    }
    /* for(GameObject gameObject : activeScenery.getGameObjects()) {

            if (charPicture.getY() < gameObject.getUpLimitY() && charPicture.getX() > gameObject.getLeftLimitX() &&
                    charPicture.getX() < gameObject.getRightLimitX()) {
                System.out.println("Player em cima");
                gameObject.getPicture().delete();
                gameObject.getPicture().draw();
                return;
            }
            if (charPicture.getY() > gameObject.getDownLimitY() && charPicture.getX() > gameObject.getLeftLimitX() &&
                    charPicture.getX() < gameObject.getRightLimitX()) {

                System.out.println("Player em baixo");
                charPicture.delete();
                charPicture.draw();
                return;

            }
            System.out.println("Player X: " + charPicture.getX() + "Player Y:" + charPicture.getY());
        }*/
}
