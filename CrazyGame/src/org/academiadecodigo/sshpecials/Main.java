package org.academiadecodigo.sshpecials;

import org.academiadecodigo.sshpecials.game.Character;
import org.academiadecodigo.sshpecials.game.ColisionDetector;
import org.academiadecodigo.sshpecials.game.Controls;
import org.academiadecodigo.sshpecials.scenery.Basement;
import org.academiadecodigo.sshpecials.scenery.Scenery;
import org.academiadecodigo.sshpecials.testing.SceneryTeste;

public class Main {

    public static void main(String[] args) {


        ColisionDetector colisionDetector = new ColisionDetector();

        Scenery[] sceneries = {new Basement(), new SceneryTeste()};
        Character character = new Character(colisionDetector);
        Controls controls = new Controls(colisionDetector, character, sceneries);
        controls.init();





        //controls.getChar().getCircle().delete();
        //controls.setCharacter(new org.academiadecodigo.sshpecials.game.Character());



    }

}
