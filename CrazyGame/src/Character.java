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
            if(ColisionDetector.checkColisionRight(picture, gameObject, j)) {
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
            if(ColisionDetector.checkColisionLeft(picture, gameObject, j)) {
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
            if(ColisionDetector.checkColisionDown(picture, gameObject, j)) {
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
            if(ColisionDetector.checkColisionUp(picture, gameObject, j)) {
                break;
            }else {
                distance++;
            }
        }
        picture.translate(0, -distance);
    }
    public boolean checkColision(GameObject[] gameObjects){
        return ColisionDetector.checkColision(picture, gameObjects);
    }
    public Picture getPicture() {
        return picture;
    }
    public int getDistancePerStep() {
        return DISTANCE_PER_STEP;
    }
}
