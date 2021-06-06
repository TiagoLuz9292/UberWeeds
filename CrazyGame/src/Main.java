import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Main {

    public static void main(String[] args) {

        Farm farm = new Farm();
        Controls controls = new Controls();
        controls.init();
        Character character = new Character();

        controls.setCharacter(character);
        controls.setActiveScenery(farm);

        //controls.getChar().getCircle().delete();
        //controls.setCharacter(new Character());



    }

}
