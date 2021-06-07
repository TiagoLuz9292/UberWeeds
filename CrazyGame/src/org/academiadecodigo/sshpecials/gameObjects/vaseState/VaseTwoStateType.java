package org.academiadecodigo.sshpecials.gameObjects.vaseState;

public enum VaseTwoStateType {

    /**
     * Each state of Vase has its diferent model (empty vase, vase with seeds, with plant grown, etc), and their own coordinates
     * to show on the screen at the correct place.
     */
    NO_VASE(250, 350, "Resources/vasoSlot.PNG"),
    EMPTY_VASE(250, 301,  "Resources/EmptyVase.PNG"),
    VASE_READY_FOR_SEEDS(250, 280, "Resources/VaseReadyForSeeds.PNG"),
    VASE_HAS_SEEDS(250, 280, "Resources/VaseHasSeeds.png"),
    VASE_HAS_WATER(250, 247, "Resources/VaseHasWater.png"),
    VASE_IS_COLLECTABLE(250, 245, "Resources/VaseIsCollectable.png");

    public int x;
    public int y;

    public String picturePath;

    VaseTwoStateType(int x, int y, String picturePath) {
        this.x = x;
        this.y = y;
        this.picturePath = picturePath;
    }


}
