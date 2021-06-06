package org.academiadecodigo.sshpecials;

import org.academiadecodigo.sshpecials.GameObject;
import org.academiadecodigo.sshpecials.VaseStateType;

public class Vase extends GameObject {

    private boolean activated;



    private static VaseStateType vaseState = VaseStateType.NO_VASE;
    private static int LEFT_LIMIT_X = 485;
    private static int RIGHT_LIMIT_X = 665;
    private static int UP_LIMIT_Y = 210;
    private static int DOWN_LIMIT_Y = 260;



    public Vase() {
        super(LEFT_LIMIT_X, RIGHT_LIMIT_X, UP_LIMIT_Y, DOWN_LIMIT_Y, vaseState.x, vaseState.y, vaseState.picturePath);
        vaseState = VaseStateType.NO_VASE;

    }

    /**
     * colocar os estados diferentes(plantaçao, rega, etc) com um numero maximo de estados, voltando ao 0 após um ciclo de colheita
     */


    public void changeState() {
        switch(vaseState) {
            case  NO_VASE:
                vaseState = VaseStateType.EMPTY_VASE;
                super.changePicture(vaseState);
                break;
        }
    }
}
