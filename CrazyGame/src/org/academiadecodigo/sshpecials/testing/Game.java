package org.academiadecodigo.sshpecials.testing;

import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.academiadecodigo.sshpecials.game.Character;
import org.academiadecodigo.sshpecials.game.ColisionDetector;
import org.academiadecodigo.sshpecials.gameObjects.Door.BasementDoorStreet;
import org.academiadecodigo.sshpecials.gameObjects.Door.Door;
import org.academiadecodigo.sshpecials.gameObjects.GameObject;
import org.academiadecodigo.sshpecials.gameObjects.Interactable;
import org.academiadecodigo.sshpecials.gameObjects.VaseOne;
import org.academiadecodigo.sshpecials.scenery.Scenery;
import org.academiadecodigo.sshpecials.scenery.WalkableScenery;

import java.util.LinkedHashSet;

public class Game {

    private boolean inventoryVisible;
    private Character character;

    private boolean gameStarted = false;

    private Scenery activeScenery;
    private Scenery[] sceneries;
    private UserInterface userInterface;
    private ColisionDetector colisionDetector;

    private Timer timer;

    private LinkedHashSet<Vase> vases;

    public Game(ColisionDetector colisionDetector, Character character, Scenery[] sceneries, Timer timer) {
        vases = new LinkedHashSet();
        this.timer = timer;
        this.inventoryVisible = true;
        this.colisionDetector = colisionDetector;
        this.character = character;
        this.sceneries = sceneries;

/**
 * Primeiro cenario
 */

    }

    public void init() {
        setActiveScenery(0);
        activeScenery.show();

        userInterface = new UserInterface(character.getInventory());
        //character.showPicture();
        start();
    }
    public void checkVases() {

        for(Vase vase : vases) {
            if(vase.isActive()) {
                if (vase.checkTimeUntilChange()) {
                    System.out.println("before interact in game loop");
                    if(character.interact(vase)) {
                        vase.notActive();
                    }
                }
            }
        }
    }
    public void start() {
        while(true) {
            while(!gameStarted) {
                System.out.println("waiting for gme to start");
            }

            if(!vases.isEmpty()) {
                checkVases();
            }

            if(!inventoryVisible && userInterface.isVisible()) {
                userInterface.hideInventoryInterface();
            } else if(inventoryVisible && !userInterface.isVisible()){
                userInterface.showInventoryInterface();
            }
            character.showPicture();
            if(character.isInteractable() && character.checkInRangeWithObject()) {
                GameObject gameObject = character.getObjectInRange();
                if(gameObject instanceof Door) {

                    setActiveScenery(((Door) gameObject).getNextSceneryIndex());

                }
                if(gameObject instanceof Interactable) {
                    Interactable interactable = (Interactable) gameObject;
                    if (gameObject instanceof Vase && !vases.contains(interactable)) {
                        vases.add((Vase)interactable);
                    }
                    character.interact((Interactable) gameObject);
                }
            }
            userInterface.update();
            character.setInteractable(false);
            character.move();
            updatePlacementsAfterMovement();
            try{
                Thread.sleep(5);
            }catch(Exception e) {
                System.out.println(e);
            }
        activeScenery.show();
        }
    }
    public void updatePlacementsAfterMovement() {
        Picture charPicture = character.getPicture();
        for (GameObject gameObject : activeScenery.getGameObjects()) {

            if (charPicture.getY() < gameObject.getUpLimitY() && charPicture.getX() > gameObject.getLeftLimitX() &&
                    charPicture.getX() < gameObject.getRightLimitX()) {
                //System.out.println("Player em cima");
                gameObject.getPicture().delete();
                gameObject.getPicture().draw();
                return;
            }
            if (charPicture.getY() > gameObject.getDownLimitY() && charPicture.getX() > gameObject.getLeftLimitX() &&
                    charPicture.getX() < gameObject.getRightLimitX()) {

                //System.out.println("Player em baixo");
                charPicture.delete();
                charPicture.draw();
                return;

            }
            //System.out.println("Player X: " + charPicture.getX() + "Player Y:" + charPicture.getY());
        }
    }
    public void setActiveScenery(int sceneryIndex) {

        if (activeScenery != null) {

            activeScenery.hide();
        }
        activeScenery = sceneries[sceneryIndex];
        if(!(activeScenery instanceof WalkableScenery)) {
            activeScenery.show();
            return;
        }

        WalkableScenery scenery = (WalkableScenery) activeScenery;
        character.setInitialPosition(scenery.getCharacterInitialX(), scenery.getCharacterInitialY(), scenery.getPicturePath());
        colisionDetector.setGameObjects(activeScenery.getGameObjects());
        scenery.show();

    }
    public void mainMenuBack() {
        if(activeScenery == sceneries[2]) {
            setActiveScenery(0);
        }
    }
    public void chooseMainMenuOption() {
        if(activeScenery == sceneries[0]) {

            activeScenery.hide();
            activeScenery.getPicture().grow(-500, -500);
            setActiveScenery(3);
            gameStarted = true;
        } else if(activeScenery == sceneries[1]) {
            setActiveScenery(2);
        }
    }
    public void menuInteraction() {
        if(activeScenery == sceneries[0]) {
            setActiveScenery(1);
        } else if(activeScenery == sceneries[1]) {
            setActiveScenery(0);
        }
    }
    public void showInventory() {
       inventoryVisible = !inventoryVisible;
        //System.out.println("Visible is " + inventoryVisible);

    }
}
