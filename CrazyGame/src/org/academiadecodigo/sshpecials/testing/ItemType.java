package org.academiadecodigo.sshpecials.testing;

public enum ItemType {

    VASE(25, 1),
    WATER_CAN(30, 1),
    SHOVEL(30, 1),
    SCISSORS(20, 1),
    WEED_SEEDS(100, 10),
    EMPTY_BAGS(10, 10),
    WEED_BAGS(0, 0),
    WEED_FOR_SMOKE(0, 0),
    MONEY(0, 0);

    public int price;
    public int quantity;
    ItemType(int price, int quantity){
        this.price = price;
        this.quantity = quantity;
    }
}


