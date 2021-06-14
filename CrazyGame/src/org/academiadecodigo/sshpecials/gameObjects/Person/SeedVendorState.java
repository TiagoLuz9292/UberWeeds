package org.academiadecodigo.sshpecials.gameObjects.Person;

public enum SeedVendorState {

    SEED_VENDOR_STATE_ONE(800,215,"Resources/SeedVendorStateOne1.png"),
    SEED_VENDOR_STATE_TWO(800,215,"Resources/SeedVendorStateTwo2.png");



    public int x;
    public int y;

    public String picturePath;

    SeedVendorState(int x, int y, String picturePath) {
        this.x = x;
        this.y = y;
        this.picturePath = picturePath;
    }

}
