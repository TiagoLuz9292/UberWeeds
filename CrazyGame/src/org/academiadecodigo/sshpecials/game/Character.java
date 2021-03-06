package org.academiadecodigo.sshpecials.game;

import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.academiadecodigo.sshpecials.gameObjects.GameObject;
import org.academiadecodigo.sshpecials.gameObjects.Interactable;
import org.academiadecodigo.sshpecials.gameObjects.Person.Person;
import org.academiadecodigo.sshpecials.gameObjects.Person.SeedVendor;
import org.academiadecodigo.sshpecials.gameObjects.Person.StoreVendor;
import org.academiadecodigo.sshpecials.scenery.WalkableScenery;
import org.academiadecodigo.sshpecials.testing.DirectionType;
import org.academiadecodigo.sshpecials.testing.Inventory;

import static org.academiadecodigo.sshpecials.testing.DirectionType.*;

public class Character {


    /**
     * For now, character will have initial position (x and y) and we can change them at starting x and y.
     */

       // Picture inicial Y
    private int speed = 2; // Character movement speed (how many pixels will change each time the key is pressed)

    private boolean interactable;

    private boolean onBike;

    private boolean stoned;

    private DirectionType direction;
    private WalkableScenery activeScenery;
    private Inventory inventory;
    private Picture picture;                  // Character model on the screen
    private ColisionDetector colisionDetector;// Character uses colisionDetector to check colision with scenery objects


    /**
     * Character receives a new colision detector in constructor
     */
    public Character(ColisionDetector colisionDetector) {
        onBike = false;
        stoned = false;
        interactable = false;
        direction = NONE;
        inventory = new Inventory();
        this.colisionDetector = colisionDetector;
        //picture = new Picture(STARTING_X, STARTING_Y, "Resources/catiaStreetStore.PNG"); //Create Character model on the screen
    }

    /**
     * Checks all the path, if there is a colision in the middle, character will stop close to it
     * Each direction has its method
     */


    public void buyItem(Person person, int option) {

        if(person instanceof SeedVendor) {
            ((SeedVendor) person).sell(inventory);
        }

        if (person instanceof StoreVendor) {
            ((StoreVendor) person).sell(inventory, option);
        }


    }


    public boolean interact(Interactable interactableObject) {
        interactable = false;
        return interactableObject.changeState(inventory, activeScenery);

    }

    public void move() {

        switch(direction) {
            case LEFT:
                moveLeft();
                break;
            case RIGHT:
                moveRight();
                break;
            case UP:
                moveUp();
                break;
            case DOWN:
                moveDown();
                break;
            case NONE:
                break;
        }

    }
    public void moveRight() {
        int distance = 0;
        for(int j = 0; j <= speed; j++) {
            if(colisionDetector.checkColisionRight(picture, j)) {  //We will check pixel by pixel, from character position until destination pixel, and will count each
                                                                   //pixel with a pixelCounter(distance) until colision or until the DISTANCE_PER_STEP.
                break;
            }else {
                distance++;
            }
        }
        //at the end it will move character by the same amount of pixels
        //as the pixelCounter(distance) in the asked direction.
        picture.translate(distance, 0);

    }

    public void moveLeft() {
        int distance = 0;
        for(int j = 1; j <= speed; j++) {
            if(colisionDetector.checkColisionLeft(picture, j)) {
                break;
            }else {
                distance++;
            }
        }
        picture.translate(-distance, 0);

    }

    public void moveDown() {
        int distance = 0;
        for(int j = 1; j <= speed; j++) {
            if(colisionDetector.checkColisionDown(picture, j)) {
                break;
            }else {
                distance++;
            }
        }
        picture.translate(0 , distance);


    }
    public void moveUp() {
        int distance = 0;
        for(int j = 1; j <= speed; j++) {
            if(colisionDetector.checkColisionUp(picture, j)) {
                break;
            }else {
                distance++;
            }
        }
        picture.translate(0, -distance);

    }

    /**
     *Checks if this character is in range of interacting with some object using F key.
     */
    public void smoke() {
        setPicture("Resources/girlStoned.png");
        stoned = true;
    }
    public void stopSmoking() {
        setPicture("Resources/girl.png");
        stoned = false;
    }
    public boolean checkInRangeWithObject(){
        return colisionDetector.checkColision(picture);
    }
    public GameObject getObjectInRange() {
        return colisionDetector.getObjectInRange(picture);
    }
    public void showPicture() {
        picture.delete();
        picture.draw();
    }
    public void setDirection(DirectionType direction) {
        this.direction = direction;
    }
    public Picture getPicture() {
        return picture;
    }
    public void setPicture(String picturePath) {
        picture.delete();
        picture.load(picturePath);
    }
    public void setInitialPosition(int x, int y, String picturePath, int speed) {

        if(picture != null) {
            picture.delete();
        }
        this.speed = speed;
        picture = new Picture(x, y, picturePath);
        picture.draw();
    }
    public Inventory getInventory() {
        return inventory;
    }
    public void setInteractable(boolean interactable) {
        this.interactable = interactable;
    }
    public void setInteractable() {
        this.interactable = true;
    }
    public boolean isInteractable() {
        return interactable;
    }

}
