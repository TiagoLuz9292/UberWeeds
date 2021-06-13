package org.academiadecodigo.sshpecials.game;

import static org.academiadecodigo.sshpecials.testing.DirectionType.*;

import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.sshpecials.testing.Game;
import org.academiadecodigo.sshpecials.testing.UserInterface;

import java.security.Key;

/**
 * This class will be our "game" class, with game logic, and also the responsability of listening to Keyboard key pressing
 * Each press on a key we have predefined, will call keyPressed(key pressed) method
 */

public class Controls implements KeyboardHandler {

    private Keyboard keyboard;
    private Character character;
    private Game game;



    public Controls(Character character, Game game) {

        this.character = character;
        this.game = game;

    }

    public void init(){

        this.keyboard = new Keyboard(this);

        /**
         * Here we create a KeyboardEvent type variable for each key we want be waiting for presses on.
         */
        KeyboardEvent chooseMainMenuOption = new KeyboardEvent();
        KeyboardEvent menuUp = new KeyboardEvent();
        KeyboardEvent menuDown = new KeyboardEvent();
        KeyboardEvent showInventory = new KeyboardEvent();
        KeyboardEvent pressUp = new KeyboardEvent();
        KeyboardEvent pressDown = new KeyboardEvent();
        KeyboardEvent pressRight = new KeyboardEvent();
        KeyboardEvent pressLeft = new KeyboardEvent();
        KeyboardEvent pressInteract = new KeyboardEvent();
        KeyboardEvent realeaseUp = new KeyboardEvent();
        KeyboardEvent realeaseDown = new KeyboardEvent();
        KeyboardEvent realeaseRight = new KeyboardEvent();
        KeyboardEvent realeaseLeft = new KeyboardEvent();
        KeyboardEvent realeaseInteract = new KeyboardEvent();
        KeyboardEvent mainMenuBack = new KeyboardEvent();
        KeyboardEvent buyOptionOne = new KeyboardEvent();
        KeyboardEvent buyOptionTwo = new KeyboardEvent();
        KeyboardEvent buyOptionThree = new KeyboardEvent();
        KeyboardEvent buyOptionFour = new KeyboardEvent();
        KeyboardEvent buyOptionFive = new KeyboardEvent();


        /**
         * Here we set the keys for each of our KeyboardEvents created
         */

        chooseMainMenuOption.setKey(KeyboardEvent.KEY_ENTER);
        menuUp.setKey(KeyboardEvent.KEY_UP);
        menuDown.setKey(KeyboardEvent.KEY_DOWN);
        showInventory.setKey(KeyboardEvent.KEY_I);
        pressUp.setKey(KeyboardEvent.KEY_W);
        pressLeft.setKey(KeyboardEvent.KEY_A);
        pressDown.setKey(KeyboardEvent.KEY_S);
        pressRight.setKey(KeyboardEvent.KEY_D);
        pressInteract.setKey(KeyboardEvent.KEY_F);
        realeaseUp.setKey(KeyboardEvent.KEY_W);
        realeaseLeft.setKey(KeyboardEvent.KEY_A);
        realeaseDown.setKey(KeyboardEvent.KEY_S);
        realeaseRight.setKey(KeyboardEvent.KEY_D);
        realeaseInteract.setKey(KeyboardEvent.KEY_F);
        mainMenuBack.setKey(KeyboardEvent.KEY_ESC);
        buyOptionOne.setKey(KeyboardEvent.KEY_1);
        buyOptionTwo.setKey(KeyboardEvent.KEY_2);
        buyOptionThree.setKey(KeyboardEvent.KEY_3);
        buyOptionFour.setKey(KeyboardEvent.KEY_4);
        buyOptionFive.setKey(KeyboardEvent.KEY_5);


        /**
        * Here we set the type of Event we want to wait for (if pressed or released, in our case we will only use Press.)
        */

        chooseMainMenuOption.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        menuUp.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        menuDown.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        showInventory.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        pressRight.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        pressLeft.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        pressDown.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        pressUp.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        pressInteract.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        realeaseRight.setKeyboardEventType(KeyboardEventType.KEY_RELEASED);
        realeaseLeft.setKeyboardEventType(KeyboardEventType.KEY_RELEASED);
        realeaseDown.setKeyboardEventType(KeyboardEventType.KEY_RELEASED);
        realeaseUp.setKeyboardEventType(KeyboardEventType.KEY_RELEASED);
        realeaseInteract.setKeyboardEventType(KeyboardEventType.KEY_RELEASED);
        mainMenuBack.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        buyOptionOne.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        buyOptionTwo.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        buyOptionThree.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        buyOptionFour.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        buyOptionFive.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        /**
         * Here we add every Keyboard Event we created, to the Event Listener.
         */

        keyboard.addEventListener(chooseMainMenuOption);
        keyboard.addEventListener(menuUp);
        keyboard.addEventListener(menuDown);
        keyboard.addEventListener(showInventory);
        keyboard.addEventListener(pressRight);
        keyboard.addEventListener(pressLeft);
        keyboard.addEventListener(pressDown);
        keyboard.addEventListener(pressUp);
        keyboard.addEventListener(pressInteract);
        keyboard.addEventListener(realeaseRight);
        keyboard.addEventListener(realeaseLeft);
        keyboard.addEventListener(realeaseDown);
        keyboard.addEventListener(realeaseUp);
        keyboard.addEventListener(realeaseInteract);
        keyboard.addEventListener(mainMenuBack);
        keyboard.addEventListener(buyOptionOne);
        keyboard.addEventListener(buyOptionTwo);
        keyboard.addEventListener(buyOptionThree);
        keyboard.addEventListener(buyOptionFour);
        keyboard.addEventListener(buyOptionFive);

    }

    /**
     *This method is called everytime one of our keys is pressed, and tell us what key has been pressed
     * So we can use a switch case, and chose diferent consequences for diferent key pressed.
     */
    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {

        switch (keyboardEvent.getKey()) {
            case KeyboardEvent.KEY_1: {
                game.buyItem(1);
                break;
            }
            case KeyboardEvent.KEY_2: {
                game.buyItem(2);
                break;
            }
            case KeyboardEvent.KEY_3: {
                game.buyItem(3);
                break;
            }
            case KeyboardEvent.KEY_4: {
                game.buyItem(4);
                break;
            }
            case KeyboardEvent.KEY_5: {
                game.buyItem(5);
                break;
            }
            case KeyboardEvent.KEY_ESC:
                game.mainMenuBack();
                break;
            case KeyboardEvent.KEY_ENTER:
                game.chooseMainMenuOption();
                break;
            case KeyboardEvent.KEY_UP:
                game.menuInteraction();
                break;
            case KeyboardEvent.KEY_DOWN:
                game.menuInteraction();
                break;
            case KeyboardEvent.KEY_I:
                game.showInventory();
                break;
            case KeyboardEvent.KEY_F:
                character.setInteractable();
                break;

            case KeyboardEvent.KEY_D:
                //crossHair.moveRight();
                character.setDirection(RIGHT);
                break;
            case KeyboardEvent.KEY_A:
                //crossHair.moveLeft();
                character.setDirection(LEFT);
                break;
            case KeyboardEvent.KEY_W:
                //crossHair.moveUp();
                character.setDirection(UP);
                break;
            case KeyboardEvent.KEY_S:
                //crossHair.moveDown();
                character.setDirection(DOWN);
                break;
        }
    }
        @Override
        public void keyReleased (KeyboardEvent keyboardEvent){
            switch (keyboardEvent.getKey()) {

                case KeyboardEvent.KEY_D:
                    //crossHair.moveRight();
                    character.setDirection(NONE);
                    break;
                case KeyboardEvent.KEY_A:
                    //crossHair.moveLeft();
                    character.setDirection(NONE);
                    break;
                case KeyboardEvent.KEY_W:
                    //crossHair.moveUp();
                    character.setDirection(NONE);
                    break;
                case KeyboardEvent.KEY_S:
                    //crossHair.moveDown();
                    character.setDirection(NONE);
                    break;
            }
        }

        /**
         * This for now is our solution to make character apear behind an object if it is on t he other side, but in front
         * of that same object if the charect is in front of it
         */
        /*for(GameObject gameObject : activeScenery.getGameObjects()) {

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
