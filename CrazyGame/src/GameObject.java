import org.academiadecodigo.simplegraphics.pictures.Picture;

public abstract class GameObject {


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

        picture = new Picture (x, y, "Resources/vasoSlot.PNG");
        picture.draw();
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
    public void setPicture(String picturePath) {
        System.out.println("changing pic of Vasee!");
        picture.delete();
        picture.load(picturePath);
        picture.draw();
    }
    public Picture getPicture() {
        return picture;
    }

    public abstract void activate();
}
