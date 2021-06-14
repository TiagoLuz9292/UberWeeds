package org.academiadecodigo.sshpecials.gameObjects.Person;

public enum SeedVendorState {

    SEED_VENDOR_STATE_ONE(800,215,"SeedvendorStateOne1.PNG"),
    SEED_VENDOR_STATE_TWO(800,215,"SeedvendorStateTwo2.PNG");



    public int x;
    public int y;

    public String picturePath;

    SeedVendorState(int x, int y, String picturePath) {
        this.x = x;
        this.y = y;
        this.picturePath = picturePath;
    }

}
