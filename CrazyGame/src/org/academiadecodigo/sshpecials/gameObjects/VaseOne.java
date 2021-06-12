package org.academiadecodigo.sshpecials.gameObjects;

import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.academiadecodigo.sshpecials.testing.Inventory;
import org.academiadecodigo.sshpecials.testing.ItemType;
import org.academiadecodigo.sshpecials.testing.Vase;
import org.academiadecodigo.sshpecials.gameObjects.vaseState.VaseOneStateType;
import java.util.Date;
public class VaseOne extends Vase implements Interactable{

    private static VaseOneStateType VASESTATE = VaseOneStateType.NO_VASE; //It has a type from VaseSatateType Enum, starts with the inicial state (with a slot where u can place vase)
    private static int LEFT_LIMIT_X = 343;
    private static int RIGHT_LIMIT_X = 431;
    private static int UP_LIMIT_Y = 0;
    private static int DOWN_LIMIT_Y = 205;

    private boolean active;
    private long vaseStartTime;

    private Picture picture;
    public VaseOne() {
        super(LEFT_LIMIT_X, RIGHT_LIMIT_X, UP_LIMIT_Y, DOWN_LIMIT_Y, VASESTATE.x, VASESTATE.y, VASESTATE.picturePath);
        VASESTATE = VaseOneStateType.NO_VASE;

        this.picture = super.getPicture();
    }

    /**
     * Vase has a vaseState from various states it can be, and each time we interact with vase, if it has the correct ingredients, it will
     * jump to the next state and change its model on the screen. When it reaches the last fase and we collect the weed, it will go back to state 2, where
     * the vase is ready to plant again.
     */
    @Override
    public boolean checkTimeUntilChange() {

        System.out.println((System.currentTimeMillis() - vaseStartTime) + " > " + VASESTATE.timerForChange);
        if(((System.currentTimeMillis() - vaseStartTime) / 1000) >= VASESTATE.timerForChange) {
            active = false;
            return true;
        }
        return false;
    }

     @Override
    public void changePicture(int x, int y, String picturePath) {

        System.out.println("changing pic of Vasee!");

    }

    @Override
    public boolean changeState(Inventory inventory) {
        if(vaseStartTime == 0) {
            super.active();
            vaseStartTime = System.currentTimeMillis();
        }
        switch(VASESTATE) {
            case  NO_VASE:
                if(inventory.hasItem(ItemType.VASE)) {
                    if(checkTimeUntilChange()) {
                        inventory.remove(ItemType.VASE, 1);
                        VASESTATE = VaseOneStateType.EMPTY_VASE;
                        super.changePicture(VASESTATE.x, VASESTATE.y, VASESTATE.picturePath);
                        vaseStartTime = 0;
                        return true;
                    }
                }
                break;
            case EMPTY_VASE:
                if(inventory.hasItem(ItemType.SHOVEL)) {
                    if(checkTimeUntilChange()) {
                        VASESTATE = VaseOneStateType.VASE_READY_FOR_SEEDS;
                        super.changePicture(VASESTATE.x, VASESTATE.y, VASESTATE.picturePath);
                        vaseStartTime = 0;
                        return true;
                    }
                }
                break;
            case VASE_READY_FOR_SEEDS:
                if(inventory.keyCount(ItemType.WEED_SEEDS) >= 10) {
                    if(checkTimeUntilChange()) {
                        inventory.remove(ItemType.WEED_SEEDS, 10);
                        VASESTATE = VaseOneStateType.VASE_HAS_SEEDS;
                        super.changePicture(VASESTATE.x, VASESTATE.y, VASESTATE.picturePath);
                        vaseStartTime = 0;
                        return true;
                    }
                }
                break;
            case VASE_HAS_SEEDS:
                if(inventory.hasItem(ItemType.WATER_CAN)) {
                    if(checkTimeUntilChange()) {
                        VASESTATE = VaseOneStateType.VASE_HAS_WATER;
                        super.changePicture(VASESTATE.x, VASESTATE.y, VASESTATE.picturePath);
                        vaseStartTime = 0;
                        return true;
                    }
                }
                break;
            case VASE_HAS_WATER:
                if(checkTimeUntilChange()) {
                    VASESTATE = VaseOneStateType.VASE_IS_COLLECTABLE;
                    super.changePicture(VASESTATE.x, VASESTATE.y, VASESTATE.picturePath);
                    vaseStartTime = 0;
                    return true;
                }
                break;
            default:
                if(inventory.hasItem(ItemType.SCISSORS)) {
                    if(checkTimeUntilChange()) {
                        inventory.add(ItemType.WEED_BAGS, 50);
                        VASESTATE = VaseOneStateType.EMPTY_VASE;
                        super.changePicture(VASESTATE.x, VASESTATE.y, VASESTATE.picturePath);
                        vaseStartTime = 0;
                        return true;
                    }
                }

                break;
        }
        return false;
    }

    public void setThread(Thread thread) {
       // this.thread = thread;
    }
    @Override
    public String toString() {
        return "IM A VASE!";
    }
    public VaseOneStateType getState() {
        return VASESTATE;
    }


}
