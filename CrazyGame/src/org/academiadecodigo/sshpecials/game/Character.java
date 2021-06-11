package org.academiadecodigo.sshpecials.game;

import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.academiadecodigo.sshpecials.gameObjects.GameObject;
import org.academiadecodigo.sshpecials.gameObjects.VaseOne;
import org.academiadecodigo.sshpecials.testing.DirectionType;
import org.academiadecodigo.sshpecials.testing.Inventory;
import org.academiadecodigo.sshpecials.testing.ItemType;

import static org.academiadecodigo.sshpecials.testing.DirectionType.*;

public class Character {


    /**
     * For now, character will have initial position (x and y) and we can change them at starting x and y.
     */

    private static int STARTING_X = 100;      // Picture initial X
    private static int STARTING_Y = 370;      // Picture inicial Y
    private static int DISTANCE_PER_STEP = 1; // Character movement speed (how many pixels will change each time the key is pressed)

    private boolean interactable;

    private DirectionType direction;

    private Inventory inventory;
    private Picture picture;                  // Character model on the screen
    private ColisionDetector colisionDetector;// Character uses colisionDetector to check colision with scenery objects


    /**
     * Character receives a new colision detector in constructor
     */
    public Character(ColisionDetector colisionDetector) {
        interactable = false;
        direction = NONE;
        inventory = new Inventory();
        this.colisionDetector = colisionDetector;
        picture = new Picture(STARTING_X, STARTING_Y, "Resources/catiaStreetStore.PNG"); //Create Character model on the screen
    }

    /**
     *Checks all the path, if there is a colision in the middle, character will stop close to it
     * Each direction has its method
     */

    public void interact(GameObject gameObject) {
        interactable = false;
        gameObject.changeState();

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
        for(int j = 0; j <= DISTANCE_PER_STEP; j++) {
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

        System.out.println("x is: " + picture.getX() + " and y is: " + picture.getY() );

    }

    public void moveLeft() {
        int distance = 0;
        for(int j = 1; j <= DISTANCE_PER_STEP; j++) {
            if(colisionDetector.checkColisionLeft(picture, j)) {
                break;
            }else {
                distance++;
            }
        }
        picture.translate(-distance, 0);

        System.out.println("x is: " + picture.getX() + " and y is: " + picture.getY() );
    }

    public void moveDown() {
        int distance = 0;
        for(int j = 1; j <= DISTANCE_PER_STEP; j++) {
            if(colisionDetector.checkColisionDown(picture, j)) {
                break;
            }else {
                distance++;
            }
        }
        picture.translate(0 , distance);

        System.out.println("x is: " + picture.getX() + " and y is: " + picture.getY() );
    }
    public void moveUp() {
        int distance = 0;
        for(int j = 1; j <= DISTANCE_PER_STEP; j++) {
            if(colisionDetector.checkColisionUp(picture, j)) {
                break;
            }else {
                distance++;
            }
        }
        picture.translate(0, -distance);

        System.out.println("x is: " + picture.getX() + " and y is: " + picture.getY() );
    }

    /**
     *Checks if this character is in range of interacting with some object using F key.
     */

    public void addToInventory(ItemType key, int value) {
        inventory.add(key, value);
    }
    public void removeFromInventory(ItemType key, int value) {
        inventory.remove(key, value);
    }
    public int countItem(ItemType key) {
        return inventory.keyCount(key);
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
    public Inventory getInventory() {
        return inventory;
    }
    public void setInteractable() {
        interactable = true;
    }
    public boolean isInteractable() {
        return interactable;
    }

}
