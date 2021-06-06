import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Character {


    private static int STARTING_X = 400;      // Picture initial X
    private static int STARTING_Y = 230;      // Picture inicial Y
    private static int DISTANCE_PER_STEP = 5; // Character movement speed

    private Picture picture;

    public Character() {
        picture = new Picture(STARTING_X, STARTING_Y, "Resources/catia2.PNG");
        picture.draw();
    }

    /**
     *Checks all the path, if there is a colision in the middle, character will stop close to it
     * Each d irection has its method
     */
    public void moveRight(GameObject gameObject) {
        int distance = 0;
        for(int j = 0; j <= DISTANCE_PER_STEP; j++) {
            if(checkColisionRight(gameObject, j)) {
                break;
            }else {
                distance++;
            }
        }
        picture.translate(distance, 0);
    }
    public void moveLeft(GameObject gameObject) {
        int distance = 0;
        for(int j = 1; j <= DISTANCE_PER_STEP; j++) {
            if(checkColisionLeft(gameObject, j)) {
                break;
            }else {
                distance++;
            }
        }
        picture.translate(-distance, 0);
    }
    public void moveDown(GameObject gameObject) {
        int distance = 0;
        for(int j = 1; j <= DISTANCE_PER_STEP; j++) {
            if(checkColisionDown(gameObject, j)) {
                break;
            }else {
                distance++;
            }
        }
        picture.translate(0 , distance);
    }
    public void moveUp(GameObject gameObject) {
        int distance = 0;
        for(int j = 1; j <= DISTANCE_PER_STEP; j++) {
            if(checkColisionUp(gameObject, j)) {
                break;
            }else {
                distance++;
            }
        }
        picture.translate(0, -distance);
    }

    /**
     * Methods for specific direction colision, to be transfered to ColisionDetector in the future. ####################
     */
    public boolean checkColisionUp(GameObject gameObject, int newStepPosition) {
        return (picture.getX() >= gameObject.getLeftLimitX() && picture.getX() <= gameObject.getRightLimitX() &&
           picture.getY() - newStepPosition - 1 <=  gameObject.getDownLimitY() && picture.getY() - newStepPosition - 1 >= gameObject.getUpLimitY());
    }
    public boolean checkColisionDown(GameObject gameObject, int newStepPosition) {
        return picture.getX() >= gameObject.getLeftLimitX() && picture.getX() <= gameObject.getRightLimitX() &&
                picture.getY() + newStepPosition + 1 >=  gameObject.getUpLimitY() && picture.getY() + newStepPosition + 1 <= gameObject.getDownLimitY();
    }
    public boolean checkColisionLeft(GameObject gameObject, int newStepPosition) {
        return picture.getX() - newStepPosition -1 <= gameObject.getRightLimitX() && picture.getX() - newStepPosition -1 >= gameObject.getLeftLimitX() &&
                picture.getY() <=  gameObject.getDownLimitY() && picture.getY() >= gameObject.getUpLimitY();
    }
    public boolean checkColisionRight(GameObject gameObject, int newStepPosition) {
        return picture.getX() + newStepPosition +1 >= gameObject.getLeftLimitX() && picture.getX() + newStepPosition +1 <= gameObject.getRightLimitX() &&
                picture.getY() <=  gameObject.getDownLimitY() && picture.getY() >= gameObject.getUpLimitY();
    }

    /**
     * Overload Methods below (Temporary solution) ---------------------------------------------------------------------
     */
    public boolean checkColisionUp(Vaso vaso) {
        return (picture.getX() >= vaso.getLeftLimitX() && picture.getX() <= vaso.getRightLimitX() &&
                picture.getY() - 1 <=  vaso.getDownLimitY() && picture.getY() - 1 >= vaso.getUpLimitY());
    }
    public boolean checkColisionDown(Vaso vaso) {
        return picture.getX() >= vaso.getLeftLimitX() && picture.getX() <= vaso.getRightLimitX() &&
                picture.getY() + 1 >=  vaso.getUpLimitY() && picture.getY() + 1 <= vaso.getDownLimitY();
    }
    public boolean checkColisionLeft(Vaso vaso) {
        return picture.getX() -1 <= vaso.getRightLimitX() && picture.getX() -1 >= vaso.getLeftLimitX() &&
                picture.getY() <=  vaso.getDownLimitY() && picture.getY() >= vaso.getUpLimitY();
    }
    public boolean checkColisionRight(Vaso vaso) {
        return picture.getX() +1 >= vaso.getLeftLimitX() && picture.getX() +1 <= vaso.getRightLimitX() &&
                picture.getY() <=  vaso.getDownLimitY() && picture.getY() >= vaso.getUpLimitY();
    }
    /**
     * End of Temporary ------------------------------------------------------------------------------------------------
     */

    public Picture getPicture() {
        return picture;
    }
}
