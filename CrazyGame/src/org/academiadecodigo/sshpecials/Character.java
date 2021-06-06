package org.academiadecodigo.sshpecials;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Character {


    private static int STARTING_X = 400;      // Picture initial X
    private static int STARTING_Y = 230;      // Picture inicial Y
    private static int DISTANCE_PER_STEP = 5; // org.academiadecodigo.sshpecials.Character movement speed

    private Picture picture;
    private ColisionDetector colisionDetector;

    public Character(ColisionDetector colisionDetector) {
        this.colisionDetector = colisionDetector;
        picture = new Picture(STARTING_X, STARTING_Y, "Resources/catia2.PNG");
        picture.draw();
    }

    /**
     *Checks all the path, if there is a colision in the middle, character will stop close to it
     * Each d irection has its method
     */
    public void moveRight() {
        int distance = 0;
        for(int j = 0; j <= DISTANCE_PER_STEP; j++) {
            if(colisionDetector.checkColisionRight(picture, j)) {
                break;
            }else {
                distance++;
            }
        }
        picture.translate(distance, 0);
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
    public boolean checkColision(GameObject[] gameObjects){
        return colisionDetector.checkColision(picture, gameObjects);
    }
    public Picture getPicture() {
        return picture;
    }
}
