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


}
