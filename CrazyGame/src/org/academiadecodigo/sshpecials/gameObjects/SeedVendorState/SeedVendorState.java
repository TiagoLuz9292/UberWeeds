package org.academiadecodigo.sshpecials.gameObjects.SeedVendorState;

public enum SeedVendorState {

    SEED_VENDOR_STATE_ONE(40,100,"Resources/SeedvendorStateOne.PNG"),
    SEED_VENDOR_STATE_TWO(40,100,"Resources/SeedvendorStateTwo.PNG");


    public int x;
    public int y;

    public String picturePath;

    SeedVendorState(int x, int y, String picturePath) {
        this.x = x;
        this.y = y;
        this.picturePath = picturePath;
    }

}
