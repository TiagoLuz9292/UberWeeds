package org.academiadecodigo.sshpecials.game;

import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.academiadecodigo.sshpecials.gameObjects.GameObject;
import org.academiadecodigo.sshpecials.gameObjects.upWall;

public class ColisionDetector {


    private static int INTERACTION_HIT_BOX = 24; //this variable defines the outside "bubble" range  inside which the player can interact with an object
    private GameObject[] gameObjects;

    public ColisionDetector() {
    }

    /**
     * Checks if
     */
    public GameObject getObjectInRange(Picture picture) {
        for (GameObject gameObject : gameObjects) {
            if(gameObject instanceof upWall) {
                continue;
            }
            if (picture.getX() >= gameObject.getLeftLimitX() - INTERACTION_HIT_BOX && picture.getX() <= gameObject.getRightLimitX() + INTERACTION_HIT_BOX &&
                    picture.getY() >= gameObject.getUpLimitY() - INTERACTION_HIT_BOX && picture.getY() <= gameObject.getDownLimitY() + INTERACTION_HIT_BOX) {
                System.out.println(gameObject);
                System.out.println("im inside an object!");
                return gameObject;
            }
        }
        return null;
    }
    public boolean checkColision(Picture picture) {

        for (GameObject gameObject : gameObjects) {
            if (picture.getX() >= gameObject.getLeftLimitX() - INTERACTION_HIT_BOX && picture.getX() <= gameObject.getRightLimitX() + INTERACTION_HIT_BOX &&
                    picture.getY() >= gameObject.getUpLimitY() - INTERACTION_HIT_BOX && picture.getY() <= gameObject.getDownLimitY() + INTERACTION_HIT_BOX) {
                System.out.println("im inside an object!");
                return true;
            }
        }
         return false;
    }

    public boolean checkColisionUp(Picture picture, int newStepPosition) {

        for(GameObject gameObject : gameObjects){
            System.out.println("object down Y limit: " + gameObject.getDownLimitY());
            if(picture.getX() >= gameObject.getLeftLimitX() && picture.getX() <= gameObject.getRightLimitX() &&
                    picture.getY() - newStepPosition - 1 <=  gameObject.getDownLimitY() && picture.getY() - newStepPosition - 1 >= gameObject.getUpLimitY()) {
                return true;
            }
        }
        return false;
    }
    public boolean checkColisionDown(Picture picture, int newStepPosition) {

        for(GameObject gameObject : gameObjects){
            if(picture.getX() >= gameObject.getLeftLimitX() && picture.getX() <= gameObject.getRightLimitX() &&
                    picture.getY() + newStepPosition + 1 <=  gameObject.getDownLimitY() && picture.getY() + newStepPosition + 1 >= gameObject.getUpLimitY()) {
                return true;
            }
        }
        return false;
    }
    public boolean checkColisionLeft(Picture picture, int newStepPosition) {

        for(GameObject gameObject : gameObjects){
            if(picture.getX() - newStepPosition -1 <= gameObject.getRightLimitX() && picture.getX() - newStepPosition -1 >= gameObject.getLeftLimitX() &&
                    picture.getY() <=  gameObject.getDownLimitY() && picture.getY() >= gameObject.getUpLimitY()) {
                return true;
            }
        }
        return false;
    }
    public boolean checkColisionRight(Picture picture, int newStepPosition) {

        System.out.println("going right!");

        for(GameObject gameObject : gameObjects){

            if(picture.getX() + newStepPosition + 1 >= gameObject.getLeftLimitX() && picture.getX() + newStepPosition +1 <= gameObject.getRightLimitX() &&
                    picture.getY() <=  gameObject.getDownLimitY() && picture.getY() >= gameObject.getUpLimitY()) {

                return true;

            }

        }

        return false;
    }

    /*
    public boolean checkColisionUp(Picture picture, GameObject gameObject, int newStepPosition) {
        return (picture.getX() >= gameObject.getLeftLimitX() && picture.getX() <= gameObject.getRightLimitX() &&
                picture.getY() - newStepPosition - 1 <=  gameObject.getDownLimitY() && picture.getY() - newStepPosition - 1 >= gameObject.getUpLimitY());
    }
    public boolean checkColisionDown(Picture picture, GameObject gameObject, int newStepPosition) {
        return picture.getX() >= gameObject.getLeftLimitX() && picture.getX() <= gameObject.getRightLimitX() &&
                picture.getY() + newStepPosition + 1 >=  gameObject.getUpLimitY() && picture.getY() + newStepPosition + 1 <= gameObject.getDownLimitY();
    }
    public boolean checkColisionLeft(Picture picture, GameObject gameObject, int newStepPosition) {
        return picture.getX() - newStepPosition -1 <= gameObject.getRightLimitX() && picture.getX() - newStepPosition -1 >= gameObject.getLeftLimitX() &&
                picture.getY() <=  gameObject.getDownLimitY() && picture.getY() >= gameObject.getUpLimitY();
    }
    public boolean checkColisionRight(Picture picture, GameObject gameObject, int newStepPosition) {
        return picture.getX() + newStepPosition +1 >= gameObject.getLeftLimitX() && picture.getX() + newStepPosition +1 <= gameObject.getRightLimitX() &&
                picture.getY() <=  gameObject.getDownLimitY() && picture.getY() >= gameObject.getUpLimitY();
    }
    */
    public void setGameObjects(GameObject[] gameObjects) {
        this.gameObjects = gameObjects;
    }
}
