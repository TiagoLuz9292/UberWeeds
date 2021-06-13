package org.academiadecodigo.sshpecials.testing;

public enum ItemType {

    VASE(10, 1),
    WATER_CAN(10, 1),
    SHOVEL(10, 1),
    SCISSORS(10, 1),
    WEED_SEEDS(10, 10),
    WEED_BAGS(10, 10),
    WEED_FOR_SMOKE(0, 0),
    MONEY(0, 0);

    public int price;
    public int quantity;
    ItemType(int price, int quantity){
        this.price = price;
        this.quantity = quantity;
    }
}


