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
    private Scenery[] sceneries;

    private ColisionDetector colisionDetector;


    public Controls(ColisionDetector colisionDetector, Character character, Scenery[] sceneries) {
        this.colisionDetector = colisionDetector;
        this.character = character;
        this.sceneries = sceneries;
        activeScenery = sceneries[0];
        colisionDetector.setGameObjects(activeScenery.getGameObjects());
    }


    public void init(){
        activeScenery.showPicture();
        System.out.println(activeScenery);
        colisionDetector.setGameObjects(activeScenery.getGameObjects()); //Setting the inicial Scenery GameObject array

        GameObject[] gameObjects = activeScenery.getGameObjects();

        for(int i = 0; i < gameObjects.length; i++) {
            gameObjects[i].showPicture();
            System.out.println(gameObjects[i]);
        }

        character.showPicture();

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
     * So we can use a switch case, and chose diferent consequences for diferent key pressed.
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
                GameObject gameObject = colisionDetector.getObjectInRange(character.getPicture());
                if(gameObject instanceof  VaseOne) {
                    gameObjects[0].changeState();
                    return;
                }
                if(gameObject instanceof  VaseTwo) {
                    gameObjects[1].changeState();
                    return;
                }
                if(gameObject instanceof Door) {
                    System.out.println("Test, im a door!");
                    if(activeScenery.toString().equals(sceneries[1].toString())) {
                        setActiveScenery(0);
                        return;
                    }
                    setActiveScenery(1);
                    return;
                }
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
        for(GameObject gameObject : activeScenery.getGameObjects()) {

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

        for(GameObject gameObject : activeScenery.getGameObjects()) {
            gameObject.hidePicture();
        }

        activeScenery.hidePicture();
        activeScenery = sceneries[sceneryIndex];
        activeScenery.hidePicture();
        activeScenery.showPicture();
        for (GameObject gameObject : activeScenery.getGameObjects()) {
            gameObject.hidePicture();
            gameObject.showPicture();
        }
        character.showPicture();
        colisionDetector.setGameObjects(activeScenery.getGameObjects());

    }
    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }
}
