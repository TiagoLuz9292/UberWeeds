import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Character {


    private static int HEIGHT = 50;
    private static int WIDTH = 50;

    private static int DISTANCE_PER_STEP = 5;

    private int HIT_BOX ;
    private Picture picture;
    private Rectangle[] rects;

    public Character() {


        //circle = new Ellipse(50, 50, 50, 50);
        HIT_BOX = 30;
         picture = new Picture(400, 230, "Resources/catia2.PNG");

         //vaso = new Picture (600, 325, "Resources/vaso.PNG");



         picture.draw();

        //circle.setColor(Color.GREEN);
        //circle.fill();

        //rects = createRectangles();


    }
    public Rectangle[] createRectangles() {
        Rectangle[] rects = new Rectangle[10];

        for (int i = 0; i < rects.length; i++) {
            rects[i] = new Rectangle(Math.random() * 600, Math.random() * 600, HEIGHT, WIDTH);
            rects[i].setColor(Color.RED);
            rects[i].fill();
        }
        return rects;
    }
    public Picture getPic() {
        return picture;
    }
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
        /*if(checkColision(vaso)) {
            circle.translate(vaso.getLeftLimitX() - getCircle().getX() - 5, 0);
        }*/

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
        /*circle.translate(-SPEED, 0);
        if(checkColision(vaso)) {
            circle.translate(getCircle().getX() - vaso.getRightLimitX() + 5, 0);
        }*/

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
        /*circle.translate(0, SPEED);
        if(checkColision(vaso)) {
            circle.translate(0, getCircle().getY() - vaso.getUpLimitY() - 5);
        }*/

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
        /*
        circle.translate(0, -SPEED);
        if(checkColision(vaso)) {
            circle.translate(0,getCircle().getY() - vaso.getDownLimitY() + 5);
        }*/
    }

    public boolean checkColision(Vaso vaso) {
        System.out.println("Circle X: " + picture.getX() + " * Vaso X: " + vaso.getX());
        System.out.println("Circle Y: " + picture.getY() + " * Vaso Y: " + vaso.getY());
        System.out.println();
        System.out.println();

        /* if(circle.getY() + hitBox > vaso.getUpLimitY() && circle.getY() + hitBox < vaso.getDownLimitY() &&
                 circle.getX() + hitBox > vaso.getLeftLimitX() && circle.getX() + hitBox < vaso.getRightLimitX()) {*/

        if(picture.getX()  >= vaso.getLeftLimitX() - HIT_BOX && picture.getX() <= vaso.getRightLimitX() + HIT_BOX &&
            picture.getY() >= vaso.getUpLimitY()  - HIT_BOX && picture.getY() <= vaso.getDownLimitY() + HIT_BOX) {
            System.out.println("im inside an object!");
             return true;
         }
         return false;
    }


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
     * Overload Methods below
     * @param vaso
     * @return
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






    public void checkColision() {

        System.out.println("Circle X: " + picture.getX());
        System.out.println("Circle Y: " + picture.getY());
        //System.out.println("Rectangle X: " + rect.getX());
        //System.out.println("Rectangle Y: " + rect.getY());

        /* for (int i = 0; i < rects.length; i++) {
            System.out.println(rects[i].getX());
            System.out.println(rects[i].getY());
            if (circle.getY() >= rects[i].getY() - 30 && circle.getY() <= rects[i].getY() + 30 &&
                    circle.getX() >= rects[i].getX() - 30 && circle.getX() <= rects[i].getX() + 30) {


                rects[i].delete();

            }
        }*/
    }
    public static int getDistancePerStep() {
        return DISTANCE_PER_STEP;
    }


    public Picture getPicture() {
        return picture;
    }

}
