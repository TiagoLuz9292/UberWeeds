package org.academiadecodigo.sshpecials.gameObjects.Vase;

public enum VaseThreeStateType {


        /**
         * Each state of Vase has its diferent model (empty vase, vase with seeds, with plant grown, etc), and their own coordinates
         * to show on the screen at the correct place.
         */
        NO_VASE(687, 290, "vasoSlot2.PNG", 1),
    EMPTY_VASE(687, 290,  "EmptyVase.PNG", 5),
    VASE_READY_FOR_SEEDS(687, 290, "VaseReadyForSeeds.PNG", 5),
    VASE_HAS_SEEDS(687, 290, "VaseHasSeeds.png", 5),
    VASE_HAS_WATER(687, 290, "VaseHasWater.png", 5),
    VASE_IS_GROWING(687, 263, "VasePlantGrowing.png", 5),
    VASE_IS_COLLECTABLE(687, 219, "VaseIsCollectable.png", 5);



    public int x;
    public int y;
    public long timerForChange;
    public String picturePath;

    VaseThreeStateType(int x, int y, String picturePath, long timerForChange) {
        this.x = x;
        this.y = y;
        this.picturePath = picturePath;
        this.timerForChange = timerForChange;
    }


}
