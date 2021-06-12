package org.academiadecodigo.sshpecials.gameObjects.vaseState;

public enum VaseOneStateType {

    /**
     * Each state of Vase has its diferent model (empty vase, vase with seeds, with plant grown, etc), and their own coordinates
     * to show on the screen at the correct place.
     */
    NO_VASE(400, 290, "Resources/vasoSlot2.PNG", 1),
    EMPTY_VASE(400, 290,  "Resources/EmptyVase.PNG", 5),
    VASE_READY_FOR_SEEDS(400, 290, "Resources/VaseReadyForSeeds.PNG", 5),
    VASE_HAS_SEEDS(400, 290, "Resources/VaseHasSeeds.png", 5),
    VASE_HAS_WATER(400, 290, "Resources/VaseHasWater.png", 5),
    VASE_IS_GROWING(400, 263, "Resources/VasePlantGrowing.png", 5),
    VASE_IS_COLLECTABLE(400, 219, "Resources/VaseIsCollectable.png", 5);

    public int x;
    public int y;

    public long timerForChange;

    public String picturePath;

    VaseOneStateType(int x, int y, String picturePath, long timerForChange) {
        this.x = x;
        this.y = y;
        this.timerForChange = timerForChange;
        this.picturePath = picturePath;
    }

}
