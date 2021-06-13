package org.academiadecodigo.sshpecials.gameObjects;

import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.academiadecodigo.sshpecials.gameObjects.SeedVendorState.SeedVendorState;
import org.academiadecodigo.sshpecials.gameObjects.vaseState.VaseOneStateType;
import org.academiadecodigo.sshpecials.testing.Inventory;
import org.academiadecodigo.sshpecials.testing.ItemType;
import org.academiadecodigo.sshpecials.testing.Vase;

public class SeedVendor extends GameObject implements Interactable {

    private static SeedVendorState SEEDVENDORSTATE = SeedVendorState.SEED_VENDOR_STATE_ONE;
    private static int LEFT_LIMIT_X = 660;
    private static int RIGHT_LIMIT_X = 1000;
    private static int UP_LIMIT_Y = 0;
    private static int DOWN_LIMIT_Y = 400;


    public SeedVendor() {
        super(LEFT_LIMIT_X, RIGHT_LIMIT_X, UP_LIMIT_Y, DOWN_LIMIT_Y, SEEDVENDORSTATE.x,
                SEEDVENDORSTATE.y, SEEDVENDORSTATE.picturePath);
        //SEEDVENDORSTATE = SeedVendorState.SEED_VENDOR_STATE_ONE;
    }

    //inventory?
    @Override
    public boolean changeState(Inventory inventory) {

        switch(SEEDVENDORSTATE) {
            case  SEED_VENDOR_STATE_ONE:

                SEEDVENDORSTATE = SeedVendorState.SEED_VENDOR_STATE_TWO;
                super.changePicture(SEEDVENDORSTATE.x, SEEDVENDORSTATE.y, SEEDVENDORSTATE.picturePath);

             return true;

        }

        return false;
    }
    @Override
    public String toString() {
        return "IM A SEED VENDOR";
    }
}