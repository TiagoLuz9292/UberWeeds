import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Vaso extends GameObject{

    private boolean activated;

    private static int x = 600;
    private static int y = 325;

    private static String picturePath = "Resources/vaso.PNG";
    private static int LEFT_LIMIT_X = 485;
    private static int RIGHT_LIMIT_X = 665;
    private static int UP_LIMIT_Y = 210;
    private static int DOWN_LIMIT_Y = 260;

    public Vaso() {
        super(LEFT_LIMIT_X, RIGHT_LIMIT_X, UP_LIMIT_Y, DOWN_LIMIT_Y, x, y, picturePath);
        activated = false;

    }

    public boolean isActivated() {
        return activated;
    }


    @Override
    public void activate() {
        if(activated)  {
            return;
        }
        activated = true;
        super.setPicture(picturePath);
    }

    public int getX() {
        return x;
    }
    public int getY(){
        return y;
    }


}
