package org.academiadecodigo.sshpecials.gameObjects.Person;

import org.academiadecodigo.sshpecials.scenery.WalkableScenery;
import org.academiadecodigo.sshpecials.testing.Inventory;
import org.academiadecodigo.sshpecials.testing.ItemType;
import org.academiadecodigo.sshpecials.testing.UberWeeds;

public class Stoner extends Person{

    private UberWeeds uberWeeds;

    public Stoner(int limitLeftX, int limitRightX, int limitUpY, int limitDownY, int x, int y, String picturePath, String name, UberWeeds uberweeds) {
        super(limitLeftX, limitRightX, limitUpY, limitDownY, x, y, picturePath, name);

        this.uberWeeds = uberweeds;

    }

    public void makeRequestToUber() {
        if(isActive()) {
            return;
        }
        double requestProbability = 0.08;

        if((Math.random() * 100) >= requestProbability) {
            return;
        }
        uberWeeds.makeRequest(getName(), (int)(Math.random() * 10) + 10);
        activate();
    }

    @Override
    public boolean changeState(Inventory inventory, WalkableScenery activeScenery) {

        if(!isActive()) {
            return false;
        }
        int quantity = uberWeeds.getRequestQuantity(getName());
        if(inventory.keyCount(ItemType.WEED_BAGS) >= quantity) {

            inventory.add(ItemType.MONEY, 10);
            inventory.remove(ItemType.WEED_BAGS, quantity);
            uberWeeds.removeRequest(getName(), quantity);
            deActivate();
            return true;
        }
        return false;
    }
}
