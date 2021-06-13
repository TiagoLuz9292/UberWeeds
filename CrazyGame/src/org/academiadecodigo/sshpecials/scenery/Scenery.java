package org.academiadecodigo.sshpecials.scenery;

import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.academiadecodigo.sshpecials.gameObjects.GameObject;

public abstract class Scenery {

    private Picture picture;

    public Scenery (String picturePath) {
        this.picture = new Picture(10, 10, picturePath);
    }



    public void show() {

        picture.draw();

    }

    public void hide() {
        picture.delete();
    }

    public Picture getPicture() {
        return picture;
    }
    public abstract GameObject[] getGameObjects();
}
