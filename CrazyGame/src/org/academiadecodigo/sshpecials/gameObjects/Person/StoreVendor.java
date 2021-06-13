package org.academiadecodigo.sshpecials.gameObjects.Person;

import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.academiadecodigo.sshpecials.gameObjects.Interactable;
import org.academiadecodigo.sshpecials.scenery.WalkableScenery;
import org.academiadecodigo.sshpecials.testing.Inventory;
import org.academiadecodigo.sshpecials.testing.ItemType;

public class StoreVendor extends Person{
    private static int LEFT_LIMIT_X = 100;
    private static int RIGHT_LIMIT_X = 300;
    private static int UP_LIMIT_Y = 0;
    private static int DOWN_LIMIT_Y = 237;
    private static Picture menuPicture;
    private static String name = "Gustavo";



    public StoreVendor(){
        super(LEFT_LIMIT_X, RIGHT_LIMIT_X, UP_LIMIT_Y, DOWN_LIMIT_Y, 250, 320, "" , name);
        menuPicture = new Picture(430, 100, "Resources/StoreMenu.png");
    }



    public void sell(Inventory inventory, int option) {

        ItemType itemType = switch (option) {

            case 2 -> ItemType.WATER_CAN;
            case 3 -> ItemType.SHOVEL;
            case 4 -> ItemType.SCISSORS;
            case 5 -> ItemType.WEED_BAGS;
            default -> ItemType.VASE;
        };

        if(inventory.keyCount(ItemType.MONEY) >= itemType.price) {
            inventory.remove(ItemType.MONEY, itemType.price);
            inventory.add(itemType, itemType.quantity);
        }


    }

    @Override
    public boolean changeState(Inventory inventory, WalkableScenery activeScenery){
        if(!isActive()){
            activate();
            menuPicture.draw();
            return true;
        }else{
            deActivate();
            menuPicture.delete();
            return false;
        }

    }

}
