package org.academiadecodigo.sshpecials;

import org.academiadecodigo.sshpecials.GameObject;
import org.academiadecodigo.sshpecials.VaseStateType;

public class Vase extends GameObject {


    /**
     * This are the limits related to any vase object from Vase class, to check colision with character, it is passed always to the super constructer
     */
    private static VaseStateType vaseState = VaseStateType.NO_VASE; //It has a type from VaseSatateType Enum, starts with the inicial state (with a slot where u can place vase)
    private static int LEFT_LIMIT_X = 485;
    private static int RIGHT_LIMIT_X = 665;
    private static int UP_LIMIT_Y = 210;
    private static int DOWN_LIMIT_Y = 260;

    public Vase() {
        super(LEFT_LIMIT_X, RIGHT_LIMIT_X, UP_LIMIT_Y, DOWN_LIMIT_Y, vaseState.x, vaseState.y, vaseState.picturePath);
        vaseState = VaseStateType.NO_VASE;
    }

    /**
     * Vase has a vaseState from various states it can be, and each time we interact with vase, if it has the correct ingredients, it will
     * jump to the next state and change its model on the screen. When it reaches the last fase and we collect the weed, it will go back to state 2, where
     * the vase is ready to plant again.
     */
    public void changeState() {
        switch(vaseState) {
            case  NO_VASE:
                vaseState = VaseStateType.EMPTY_VASE;
                super.changePicture(vaseState);
                break;
        }
    }

    @Override
    public String toString() {
        return "IM A VASE!";
    }
}
