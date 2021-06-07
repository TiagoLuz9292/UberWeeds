package org.academiadecodigo.sshpecials;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Character {


    /**
     * For now, character will have initial position (x and y) and we can change them at starting x and y.
     */
    private static int STARTING_X = 400;      // Picture initial X
    private static int STARTING_Y = 230;      // Picture inicial Y
    private static int DISTANCE_PER_STEP = 20; // Character movement speed (how many pixels will change each time the key is pressed)

    private Picture picture;                  // Character model on the screen
    private ColisionDetector colisionDetector;// Character uses colisionDetector to check colision with scenery objects


    /**
     * Character receives a new colision detector in constructor
     */
    public Character(ColisionDetector colisionDetector) {
        this.colisionDetector = colisionDetector;
        picture = new Picture(STARTING_X, STARTING_Y, "Resources/catia2.PNG"); //Create Character model on the screen
    }

    /**
     *Checks all the path, if there is a colision in the middle, character will stop close to it
     * Each direction has its method
     */
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

        picture.translate(distance, 0); //at the end it will move character by the same amount of pixels
    }                                       //as the pixelCounter(distance) in the asked direction.
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
    }

    /**
     *Checks if this character is in range of interacting with some object using F key.
     */
    public boolean checkInRangeWithObject(GameObject[] gameObjects){
        return colisionDetector.checkColision(picture);
    }
    public void showPicture() {
        picture.delete();
        picture.draw();
    }
    public Picture getPicture() {
        return picture;
    }
}
