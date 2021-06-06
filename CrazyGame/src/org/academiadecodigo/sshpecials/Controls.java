package org.academiadecodigo.sshpecials;

import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Controls implements KeyboardHandler {

    private Keyboard keyboard;
    private Character character;
    private Scenery activeScenery;

    private ColisionDetector colisionDetector;

    public Controls(ColisionDetector colisionDetector, Character character, Scenery scenery) {
        this.colisionDetector = colisionDetector;
        this.character = character;
        this.activeScenery = scenery;
        colisionDetector.setGameObjects(activeScenery.getGameObjects());

    }


    public void init(){

        colisionDetector.setGameObjects(activeScenery.getGameObjects());
        this.keyboard = new Keyboard(this);

        KeyboardEvent pressUp = new KeyboardEvent();
        KeyboardEvent pressDown = new KeyboardEvent();
        KeyboardEvent pressRight = new KeyboardEvent();
        KeyboardEvent pressLeft = new KeyboardEvent();
        KeyboardEvent pressInteract = new KeyboardEvent();

        pressUp.setKey(KeyboardEvent.KEY_W);
        pressLeft.setKey(KeyboardEvent.KEY_A);
        pressDown.setKey(KeyboardEvent.KEY_S);
        pressRight.setKey(KeyboardEvent.KEY_D);
        pressInteract.setKey(KeyboardEvent.KEY_F);

        pressRight.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        pressLeft.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        pressDown.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        pressUp.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        pressInteract.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        keyboard.addEventListener(pressRight);
        keyboard.addEventListener(pressLeft);
        keyboard.addEventListener(pressDown);
        keyboard.addEventListener(pressUp);
        keyboard.addEventListener(pressInteract);

    }


    public Character getChar() {
        return character;
    }


    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {

        Picture charPicture = character.getPicture();
        GameObject[] gameObjects = activeScenery.getGameObjects();

        if(keyboardEvent.getKey() == KeyboardEvent.KEY_F) {
            if(character.checkColision(gameObjects)){
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
