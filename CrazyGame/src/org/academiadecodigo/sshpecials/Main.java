package org.academiadecodigo.sshpecials;

public class Main {

    public static void main(String[] args) {

        ColisionDetector colisionDetector = new ColisionDetector();
        Basement basement = new Basement();
        Character character = new Character(colisionDetector);
        Controls controls = new Controls(colisionDetector, character, basement);
        controls.init();





        //controls.getChar().getCircle().delete();
        //controls.setCharacter(new org.academiadecodigo.sshpecials.Character());



    }

}
