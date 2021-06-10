package org.academiadecodigo.sshpecials.gameObjects;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public abstract class GameObject{

    /**
     * Limits af the specific area of this object picture in the screen, used on colision check in person movement.
     */
    private int leftLimitX;
    private int rightLimitX;
    private int upLimitY;
    private int downLimitY;



    private Picture picture; //Model of this gameobject on the screen

    /**
     *Constructer for gameobjects that are visible on the screen, that draw a picture in the screen.
     */
    public GameObject(int limitLeftX, int limitRightX, int limitUpY, int limitDownY, int x, int y, String picturePath) {
        this.leftLimitX = limitLeftX;
        this.rightLimitX = limitRightX;
        this.upLimitY = limitUpY;
        this.downLimitY = limitDownY;

        picture = new Picture (x, y, picturePath);
    }
    /**
     *Constructer for gameobjects that are visible on the screen, but may have colision limits to block character in certan ways
     * (For example, not going out of the map)
     */
    public GameObject(int limitLeftX, int limitRightX, int limitUpY, int limitDownY) {

        this.leftLimitX = limitLeftX;
        this.rightLimitX = limitRightX;
        this.upLimitY = limitUpY;
        this.downLimitY = limitDownY;

        picture = new Picture ();
    }

    public  GameObject() {

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


    /**
     *Change the model of the vase when he goes to a diferent state
     */
    public void changePicture(int x, int y, String picturePath) {

        System.out.println("changing pic of Vasee!");

        picture.delete();
        picture = new Picture(x, y, picturePath);
        picture.draw();
    }
    public Picture getPicture() {
        return picture;
    }
    public void show() {
        //picture.delete();
        picture.draw();
    }
    public void hide() {
        picture.delete();
    }


    public abstract void changeState();

    public String toString() {
        return "Im an object";
    }
}
