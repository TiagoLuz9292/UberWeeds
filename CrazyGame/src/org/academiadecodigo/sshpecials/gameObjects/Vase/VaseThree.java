package org.academiadecodigo.sshpecials.gameObjects.Vase;

import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.academiadecodigo.sshpecials.scenery.WalkableScenery;
import org.academiadecodigo.sshpecials.testing.Inventory;
import org.academiadecodigo.sshpecials.testing.ItemType;

public class VaseThree extends Vase {
    private static VaseThreeStateType VASESTATE = VaseThreeStateType.NO_VASE; //It has a type from VaseSatateType Enum, starts with the inicial state (with a slot where u can place vase)
    private static int LEFT_LIMIT_X = 649;
    private static int RIGHT_LIMIT_X = 706;
    private static int UP_LIMIT_Y = 0;
    private static int DOWN_LIMIT_Y = 172;


    private boolean active;
    private long vaseStartTime;

    private Picture picture;
    public VaseThree() {
        super(LEFT_LIMIT_X, RIGHT_LIMIT_X, UP_LIMIT_Y, DOWN_LIMIT_Y, VASESTATE.x, VASESTATE.y, VASESTATE.picturePath);
        VASESTATE = VaseThreeStateType.NO_VASE;

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
            deActive();
            setReadyToChange(true);
            return true;
        }
        return false;
    }
    @Override
    public void changePicture(int x, int y, String picturePath) {

        System.out.println("changing pic of Vasee!");

    }

    @Override
    public boolean changeState(Inventory inventory, WalkableScenery activeScenery) {

        switch(VASESTATE) {
            case  NO_VASE:
                if(inventory.hasItem(ItemType.VASE)) {
                    if(vaseStartTime == 0) {
                        super.active();
                        vaseStartTime = System.currentTimeMillis();
                    }
                    if(isReadyToChange()) {
                        inventory.remove(ItemType.VASE, 1);
                        VASESTATE = VaseThreeStateType.EMPTY_VASE;
                        super.changePicture(VASESTATE.x, VASESTATE.y, VASESTATE.picturePath);
                        vaseStartTime = 0;
                        return true;
                    }
                }
                break;
            case EMPTY_VASE:
                if(inventory.hasItem(ItemType.SHOVEL)) {
                    if(vaseStartTime == 0) {
                        super.active();
                        vaseStartTime = System.currentTimeMillis();
                    }
                    if(isReadyToChange()) {
                        VASESTATE = VaseThreeStateType.VASE_READY_FOR_SEEDS;
                        super.changePicture(VASESTATE.x, VASESTATE.y, VASESTATE.picturePath);
                        vaseStartTime = 0;
                        return true;
                    }
                }
                break;
            case VASE_READY_FOR_SEEDS:
                if(inventory.keyCount(ItemType.WEED_SEEDS) >= 10) {
                    if(vaseStartTime == 0) {
                        super.active();
                        vaseStartTime = System.currentTimeMillis();
                    }
                    if(isReadyToChange()) {
                        inventory.remove(ItemType.WEED_SEEDS, 10);
                        VASESTATE = VaseThreeStateType.VASE_HAS_SEEDS;
                        super.changePicture(VASESTATE.x, VASESTATE.y, VASESTATE.picturePath);
                        vaseStartTime = 0;
                        return true;
                    }
                }
                break;
            case VASE_HAS_SEEDS:
                if(inventory.hasItem(ItemType.WATER_CAN)) {
                    if(vaseStartTime == 0) {
                        super.active();
                        vaseStartTime = System.currentTimeMillis();
                    }
                    if(isReadyToChange()) {
                        VASESTATE = VaseThreeStateType.VASE_HAS_WATER;
                        super.changePicture(VASESTATE.x, VASESTATE.y, VASESTATE.picturePath);
                        vaseStartTime = 0;
                        return true;
                    }
                }
                break;
            case VASE_HAS_WATER:
                if(vaseStartTime == 0) {
                    super.active();
                    vaseStartTime = System.currentTimeMillis();
                }
                if(isReadyToChange()) {

                    VASESTATE = VaseThreeStateType.VASE_IS_GROWING;
                    super.changePicture(VASESTATE.x, VASESTATE.y, VASESTATE.picturePath);
                    vaseStartTime = 0;
                    return true;
                }
                break;

            case VASE_IS_GROWING:
                if(vaseStartTime == 0) {
                    super.active();
                    vaseStartTime = System.currentTimeMillis();
                }
                if(isReadyToChange()) {

                    VASESTATE = VaseThreeStateType.VASE_IS_COLLECTABLE;
                    super.changePicture(VASESTATE.x, VASESTATE.y, VASESTATE.picturePath);
                    vaseStartTime = 0;
                    return true;
                }
                break;
            case VASE_IS_COLLECTABLE:
                if(inventory.hasItem(ItemType.SCISSORS)) {
                    if(vaseStartTime == 0) {
                        super.active();
                        vaseStartTime = System.currentTimeMillis();
                    }
                    if (isReadyToChange()) {
                        if(inventory.keyCount(ItemType.EMPTY_BAGS) >= 30){
                            inventory.add(ItemType.WEED_BAGS, 30);
                            inventory.remove(ItemType.EMPTY_BAGS, 30);
                            VASESTATE = VaseThreeStateType.EMPTY_VASE;
                            super.changePicture(VASESTATE.x, VASESTATE.y, VASESTATE.picturePath);
                            vaseStartTime = 0;
                            return true;
                        }
                    }
                }
                break;
        }
        return false;
    }

    @Override
    public String toString() {
        return "IM A VASE!";
    }
}
