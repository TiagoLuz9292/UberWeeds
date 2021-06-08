package org.academiadecodigo.sshpecials.scenery;

import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.academiadecodigo.sshpecials.gameObjects.GameObject;

public class Scenery {

    private Picture picture;
    private GameObject[] gameObjects;
    private boolean available;

    /**
     *
     * Scenery receives the list of objects in that scenery for check colision with character in the future, and a path for its model on screen
     */
    public Scenery(String picturePath, GameObject[] gameObjects) {
        picture = new Picture(10, 10, picturePath);
        available = true;
        this.gameObjects = gameObjects;


        gameObjects[0].getPicture().delete();
        gameObjects[0].getPicture().draw();
    }

    public GameObject[] getGameObjects() {
        return gameObjects;
    }
    public void showPicture() {

        picture.draw();
    }
    public void hidePicture() {
        picture.delete();
    }
    @Override
    public String toString() {
        return "IM SCENERY";
    }
}
