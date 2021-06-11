package org.academiadecodigo.sshpecials.testing;

import org.academiadecodigo.sshpecials.gameObjects.GameObject;

public class Vase extends GameObject {


    /**
     * This are the limits related to any vase object from Vase class, to check colision with character, it is passed always to the super constructer
     */

    public Vase(int limitLeftX, int limitRightX, int limitUpY, int limitDownY, int x, int y, String picturePath) {
        super(limitLeftX, limitRightX, limitUpY, limitDownY, x, y, picturePath);
    }


    /**
     * Vase has a vaseState from various states it can be, and each time we interact with vase, if it has the correct ingredients, it will
     * jump to the next state and change its model on the screen. When it reaches the last fase and we collect the weed, it will go back to state 2, where
     * the vase is ready to plant again.
     */
    @Override
    public void changeState(Inventory inventory) {

    }

    @Override
    public String toString() {
        return "IM A VASE!";
    }
}
