package org.academiadecodigo.sshpecials.scenery;

import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.academiadecodigo.sshpecials.gameObjects.GameObject;

public class WalkableScenery extends Scenery{


    private GameObject[] gameObjects;

    private String characterPicturePath;
    private int characterInitialX;
    private int characterInitialY;
    private int characterSpeed;

    /**
     *
     * Scenery receives the list of objects in that scenery for check colision with character in the future, and a path for its model on screen
     */
    public WalkableScenery(String picturePath, GameObject[] gameObjects, int characterInitialX,
                           int characterInitialY, String characterPicturePath, int characterSpeed) {
        super(picturePath);

        this.characterSpeed = characterSpeed;
        this.gameObjects = gameObjects;
        this.characterInitialX = characterInitialX;
        this.characterInitialY = characterInitialY;
        this.characterPicturePath = characterPicturePath;
    }


    public GameObject[] getGameObjects() {
        return gameObjects;
    }




    @Override
    public String toString() {
        return "IM SCENERY";
    }

    @Override
    public void show() {
        super.show();
        for(GameObject gameObject : gameObjects) {

            gameObject.hide();
            gameObject.show();
        }
    }
    @Override
    public void hide() {
        super.hide();
        for(GameObject gameObject : gameObjects) {
            System.out.println(gameObject);
            gameObject.hide();
        }
    }
    public void setPicture(String picturePath) {
        getPicture().load(picturePath);
        hide();
        show();
    }
    public int getCharacterInitialX() {
        return characterInitialX;
    }

    public int getCharacterInitialY() {
        return characterInitialY;
    }

    public String getPicturePath() {
        return characterPicturePath;
    }

    public int getCharacterSpeed() {
        return characterSpeed;
    }

}
