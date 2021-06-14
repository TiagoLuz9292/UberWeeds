package org.academiadecodigo.sshpecials.gameObjects.Person;

import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.academiadecodigo.sshpecials.gameObjects.Interactable;
import org.academiadecodigo.sshpecials.scenery.WalkableScenery;
import org.academiadecodigo.sshpecials.testing.Inventory;
import org.academiadecodigo.sshpecials.testing.ItemType;

public class SeedVendor extends Person implements Interactable {

    private static SeedVendorState SEEDVENDORSTATE = SeedVendorState.SEED_VENDOR_STATE_ONE;
    private static int LEFT_LIMIT_X = 660;
    private static int RIGHT_LIMIT_X = 1000;
    private static int UP_LIMIT_Y = 0;
    private static int DOWN_LIMIT_Y = 400;

    private static int SEEDS_PRICE = 50;

    private static Picture seedMenu = new Picture(100, 100, "Resources/SeedsMenu.png");
    private static String name = "Marco";


    public SeedVendor() {
        super(LEFT_LIMIT_X, RIGHT_LIMIT_X, UP_LIMIT_Y, DOWN_LIMIT_Y, SEEDVENDORSTATE.x,
                SEEDVENDORSTATE.y, SEEDVENDORSTATE.picturePath, name);

        //SEEDVENDORSTATE = SeedVendorState.SEED_VENDOR_STATE_ONE;
    }

    //inventory?

    public void sell(Inventory inventory) {

        if(inventory.keyCount(ItemType.MONEY) >= SeedVendor.SEEDS_PRICE) {
            inventory.remove(ItemType.MONEY, SeedVendor.SEEDS_PRICE);
            inventory.add(ItemType.WEED_SEEDS, 10);

            System.out.println(inventory.keyCount(ItemType.MONEY));
        }

    }

    @Override
    public boolean changeState(Inventory inventory, WalkableScenery activeScenery) {

        switch(SEEDVENDORSTATE) {
            case SEED_VENDOR_STATE_ONE:
                SEEDVENDORSTATE = SeedVendorState.SEED_VENDOR_STATE_TWO;
                super.changePicture(SEEDVENDORSTATE.x, SEEDVENDORSTATE.y, SEEDVENDORSTATE.picturePath);
                return true;
            case SEED_VENDOR_STATE_TWO:
                if(isActive()) {
                    System.out.println("TESTEEEEE");
                    super.deActivate();
                    seedMenu.delete();
                }else {
                    super.activate();
                    seedMenu.draw();
                }
        }

        return false;
    }
    @Override
    public String toString() {
        return "IM A SEED VENDOR";
    }
    public void setSeedVendorDefaultState() {
        SEEDVENDORSTATE = SeedVendorState.SEED_VENDOR_STATE_ONE;
        super.changePicture(SEEDVENDORSTATE.x, SEEDVENDORSTATE.y, SEEDVENDORSTATE.picturePath);
    }
    public boolean isActive() {
        return super.isActive();
    }
}