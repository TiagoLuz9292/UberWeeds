package org.academiadecodigo.sshpecials;

import org.academiadecodigo.sshpecials.game.Character;
import org.academiadecodigo.sshpecials.game.ColisionDetector;
import org.academiadecodigo.sshpecials.game.Controls;
import org.academiadecodigo.sshpecials.scenery.*;
import org.academiadecodigo.sshpecials.testing.Game;


public class Main {

    public static void main(String[] args) {


        ColisionDetector colisionDetector = new ColisionDetector();

        Scenery[] sceneries = {new MainMenuStartOption(), new MainMenuInstructionsOption(), new MainMenuInstructions(), new Basement(),new StreetStore()};
        Character character = new Character(colisionDetector);

        Game game = new Game(colisionDetector,character, sceneries);
        Controls controls = new Controls(character, game);
        controls.init();
        game.init();





        //controls.getChar().getCircle().delete();
        //controls.setCharacter(new org.academiadecodigo.sshpecials.game.Character());



    }

}
