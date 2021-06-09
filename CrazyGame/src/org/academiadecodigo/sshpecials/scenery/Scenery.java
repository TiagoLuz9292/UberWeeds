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
    }


    public GameObject[] getGameObjects() {
        return gameObjects;
    }

    public void show() {
        picture.draw();
        for (GameObject gameObject : gameObjects) {
            gameObject.show();
        }
    }

    public void hide() {
        picture.delete();
        for (GameObject gameObject : gameObjects) {
            gameObject.hide();
        }
    }
    @Override
    public String toString() {
        return "IM SCENERY";
    }
}
