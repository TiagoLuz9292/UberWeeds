package org.academiadecodigo.sshpecials.gameObjects.SeedVendorState;

public enum SeedVendorState {

    SEED_VENDOR_STATE_ONE(400,400,"Resources/SeedvendorStateOne.PNG");


    public int x;
    public int y;

    public String picturePath;

    SeedVendorState(int x, int y, String picturePath) {
        this.x = x;
        this.y = y;
        this.picturePath = picturePath;
    }

}
