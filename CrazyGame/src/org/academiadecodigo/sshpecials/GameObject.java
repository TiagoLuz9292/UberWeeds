package org.academiadecodigo.sshpecials;

import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.academiadecodigo.sshpecials.VaseStateType;

public abstract class GameObject {

    /**
     * Limits af the specific area of this object picture in the screen, used on colision check in person movement.
     */
    private int leftLimitX;
    private int rightLimitX;
    private int upLimitY;
    private int downLimitY;

    private Picture picture;

    public GameObject(int limitLeftX, int limitRightX, int limitUpY, int limitDownY, int x, int y, String picturePath) {
        this.leftLimitX = limitLeftX;
        this.rightLimitX = limitRightX;
        this.upLimitY = limitUpY;
        this.downLimitY = limitDownY;

        picture = new Picture (x, y, picturePath);
        picture.draw();
    }

    public GameObject(int limitLeftX, int limitRightX, int limitUpY, int limitDownY) {
        this.leftLimitX = limitLeftX;
        this.rightLimitX = limitRightX;
        this.upLimitY = limitUpY;
        this.downLimitY = limitDownY;

        picture = new Picture ();
    }

    public int getLeftLimitX() {
        return leftLimitX;
    }
    public int getRightLimitX() {
        return rightLimitX;
    }
    public int getUpLimitY() {
        return upLimitY;
    }
    public int getDownLimitY() {
        return downLimitY;
    }
    public void changePicture(VaseStateType vaseStateType) {

        System.out.println("changing pic of Vasee!");

        picture.delete();
        picture = new Picture(vaseStateType.x, vaseStateType.y, vaseStateType.picturePath);
        picture.draw();
    }
    public Picture getPicture() {
        return picture;
    }

    public abstract void changeState();

}
