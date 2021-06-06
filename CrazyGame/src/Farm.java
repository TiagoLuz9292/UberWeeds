import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Farm extends Scenery{

    private static String PICTURE = "Resources/gameBackGroundHouse.PNG";
    private static GameObject[] gameobjects = {new Vaso() };

    public Farm() {
        super(PICTURE, gameobjects);
    }
}
