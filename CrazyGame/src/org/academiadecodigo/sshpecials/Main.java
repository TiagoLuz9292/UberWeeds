package org.academiadecodigo.sshpecials;

public class Main {

    public static void main(String[] args) {


        ColisionDetector colisionDetector = new ColisionDetector();

        Scenery [] sceneries = {new Basement(), new SceneryTeste()};
        Character character = new Character(colisionDetector);
        Controls controls = new Controls(colisionDetector, character, sceneries);
        controls.init();





        //controls.getChar().getCircle().delete();
        //controls.setCharacter(new org.academiadecodigo.sshpecials.Character());



    }

}
