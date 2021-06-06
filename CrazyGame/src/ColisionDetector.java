import org.academiadecodigo.simplegraphics.pictures.Picture;

public class ColisionDetector {

    private static int INTERACTION_HIT_BOX = 30;

    public static boolean checkColision(Picture picture, GameObject[] gameObjects) {

        for (GameObject gameObject : gameObjects) {
            if (picture.getX() >= gameObject.getLeftLimitX() - INTERACTION_HIT_BOX && picture.getX() <= gameObject.getRightLimitX() + INTERACTION_HIT_BOX &&
                    picture.getY() >= gameObject.getUpLimitY() - INTERACTION_HIT_BOX && picture.getY() <= gameObject.getDownLimitY() + INTERACTION_HIT_BOX) {
                System.out.println("im inside an object!");
                return true;
            }
        }
         return false;
    }
    public static boolean checkColisionUp(Picture picture, GameObject gameObject, int newStepPosition) {
        return (picture.getX() >= gameObject.getLeftLimitX() && picture.getX() <= gameObject.getRightLimitX() &&
                picture.getY() - newStepPosition - 1 <=  gameObject.getDownLimitY() && picture.getY() - newStepPosition - 1 >= gameObject.getUpLimitY());
    }
    public static boolean checkColisionDown(Picture picture, GameObject gameObject, int newStepPosition) {
        return picture.getX() >= gameObject.getLeftLimitX() && picture.getX() <= gameObject.getRightLimitX() &&
                picture.getY() + newStepPosition + 1 >=  gameObject.getUpLimitY() && picture.getY() + newStepPosition + 1 <= gameObject.getDownLimitY();
    }
    public static boolean checkColisionLeft(Picture picture, GameObject gameObject, int newStepPosition) {
        return picture.getX() - newStepPosition -1 <= gameObject.getRightLimitX() && picture.getX() - newStepPosition -1 >= gameObject.getLeftLimitX() &&
                picture.getY() <=  gameObject.getDownLimitY() && picture.getY() >= gameObject.getUpLimitY();
    }
    public static boolean checkColisionRight(Picture picture, GameObject gameObject, int newStepPosition) {
        return picture.getX() + newStepPosition +1 >= gameObject.getLeftLimitX() && picture.getX() + newStepPosition +1 <= gameObject.getRightLimitX() &&
                picture.getY() <=  gameObject.getDownLimitY() && picture.getY() >= gameObject.getUpLimitY();
    }

}
