package org.academiadecodigo.sshpecials.gameObjects.vaseState;

public enum VaseOneStateType {

    /**
     * Each state of Vase has its diferent model (empty vase, vase with seeds, with plant grown, etc), and their own coordinates
     * to show on the screen at the correct place.
     */
    NO_VASE(400, 272, "Resources/vasoSlot.PNG",1),
    EMPTY_VASE(400, 280,  "Resources/vasoTeste2.PNG" , 5),
    VASE_READY_FOR_SEEDS(400, 280, "Resources/vasoComSementes.png", 5),
    VASE_HAS_SEEDS(400, 192, "Resources/VaseHasSeeds.png", 3),
    VASE_HAS_WATER(400, 160, "Resources/VaseHasWater.png", 1),
    VASE_IS_COLLECTABLE(400, 156, "Resources/VaseIsCollectable.png", 10);

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
