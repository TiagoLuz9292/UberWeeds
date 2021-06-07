package org.academiadecodigo.sshpecials;

import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.simplegraphics.pictures.Picture;

/**
 * This class will be our "game" class, with game logic, and also the responsability of listening to Keyboard key pressing
 * Each press on a key we have predefined, will call keyPressed(key pressed) method
 */

public class Controls implements KeyboardHandler {

    private Keyboard keyboard;
    private Character character;
    private Scenery activeScenery;
    //private Scenery[] sceneries;

    private ColisionDetector colisionDetector;


    public Controls(ColisionDetector colisionDetector, Character character, Scenery scenery) {
        this.colisionDetector = colisionDetector;
        this.character = character;
        this.activeScenery = scenery;
        colisionDetector.setGameObjects(activeScenery.getGameObjects());

    }


    public void init(){

        colisionDetector.setGameObjects(activeScenery.getGameObjects()); //Setting the inicial Scenery GameObject array
        this.keyboard = new Keyboard(this);

        /**
         * Here we create a KeyboardEvent type variable for each key we want be waiting for presses on.
         */
        KeyboardEvent pressUp = new KeyboardEvent();
        KeyboardEvent pressDown = new KeyboardEvent();
        KeyboardEvent pressRight = new KeyboardEvent();
        KeyboardEvent pressLeft = new KeyboardEvent();
        KeyboardEvent pressInteract = new KeyboardEvent();

        /**
         * Here we set the keys for each of our KeyboardEvents created
         */
        pressUp.setKey(KeyboardEvent.KEY_W);
        pressLeft.setKey(KeyboardEvent.KEY_A);
        pressDown.setKey(KeyboardEvent.KEY_S);
        pressRight.setKey(KeyboardEvent.KEY_D);
        pressInteract.setKey(KeyboardEvent.KEY_F);
        /**
        * Here we set the type of Event we want to wait for (if pressed or released, in our case we will only use Press.)
        */
        pressRight.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        pressLeft.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        pressDown.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        pressUp.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        pressInteract.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        /**
         * Here we add every Keyboard Event we created, to the Event Listener.
         */
        keyboard.addEventListener(pressRight);
        keyboard.addEventListener(pressLeft);
        keyboard.addEventListener(pressDown);
        keyboard.addEventListener(pressUp);
        keyboard.addEventListener(pressInteract);

    }

    /**
     *This method is called everytime one of our keys is pressed, and tell us what key has been pressed
     * So we can use a switch case, and chose different consequences for different key pressed.
     */
    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {

        Picture charPicture = character.getPicture();
        GameObject[] gameObjects = activeScenery.getGameObjects();

        /**
         * This part is about telling the program what to do when someone press the F key , which is out Interack key.
         * In progress!
         */
        if(keyboardEvent.getKey() == KeyboardEvent.KEY_F) {
            if(character.checkInRangeWithObject(gameObjects)){
                System.out.println("teste");
                gameObjects[0].changeState();

                character.getPicture().delete();
                character.getPicture().load("Resources/catia2.PNG");
                character.getPicture().draw();
                return;
            }

        }

        switch(keyboardEvent.getKey()) {

            case KeyboardEvent.KEY_D :
                //crossHair.moveRight();
                character.moveRight();
                break;
            case KeyboardEvent.KEY_A :
                //crossHair.moveLeft();
                character.moveLeft();
                break;
            case KeyboardEvent.KEY_W :
                //crossHair.moveUp();
                character.moveUp();
                break;
            case KeyboardEvent.KEY_S :
                //crossHair.moveDown();
                character.moveDown();
                break;
        }
        //character.checkColision(vaso);

        /**
         * This for now is our solution to make character apear behind an object if it is on t he other side, but in front
         * of that same object if the charect is in front of it
         */
        if(charPicture.getY() < gameObjects[0].getUpLimitY() && charPicture.getX() > gameObjects[0].getLeftLimitX() &&
                charPicture.getX() < gameObjects[0].getRightLimitX()) {
            gameObjects[0].getPicture().delete();
            gameObjects[0].getPicture().draw();
        }
        if(charPicture.getY() > gameObjects[0].getUpLimitY() && charPicture.getX() > gameObjects[0].getLeftLimitX() &&
                charPicture.getX() < gameObjects[0].getRightLimitX()) {
            charPicture.delete();
            charPicture.draw();



        }
        System.out.println("Player X: " + charPicture.getX() + "Player Y:" + charPicture.getY());

    }
    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }
}
