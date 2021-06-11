package org.academiadecodigo.sshpecials.testing;

import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.academiadecodigo.sshpecials.game.Character;
import org.academiadecodigo.sshpecials.game.ColisionDetector;
import org.academiadecodigo.sshpecials.gameObjects.Door.BasementDoorStreet;
import org.academiadecodigo.sshpecials.gameObjects.Door.Door;
import org.academiadecodigo.sshpecials.gameObjects.GameObject;
import org.academiadecodigo.sshpecials.scenery.Scenery;

public class Game {

    private boolean inventoryVisible;
    private Character character;

    private Scenery activeScenery;
    private Scenery[] sceneries;
    private UserInterface userInterface;
    private ColisionDetector colisionDetector;

    public Game(ColisionDetector colisionDetector, Character character, Scenery[] sceneries) {
        this.inventoryVisible = true;
        this.colisionDetector = colisionDetector;
        this.character = character;
        this.sceneries = sceneries;
/**
 * Primeiro cenario
 */
        activeScenery = sceneries[1];
        colisionDetector.setGameObjects(activeScenery.getGameObjects());
    }

    public void init() {

        colisionDetector.setGameObjects(activeScenery.getGameObjects()); //Setting the inicial Scenery GameObject array
        activeScenery.show();

        character.showPicture();
        userInterface = new UserInterface(character.getInventory());
        start();
    }
    public void start() {
        while(true) {
            if(!inventoryVisible && userInterface.isVisible()) {
                userInterface.hideInventoryInterface();
            } else if(inventoryVisible && !userInterface.isVisible()){
                userInterface.showInventoryInterface();
            }
            character.showPicture();
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

            character.setInteractable(false);
            character.move();
            try{
                Thread.sleep(20);
            }catch(Exception e) {
                System.out.println(e);
            }
            //userInterface.update();
        }
    }
    public void updatePlacementsAfterMovement() {
        Picture charPicture = character.getPicture();
        for (GameObject gameObject : activeScenery.getGameObjects()) {

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
    public void showInventory() {
       inventoryVisible = !inventoryVisible;
        System.out.println("Visible is " + inventoryVisible);

    }
}
