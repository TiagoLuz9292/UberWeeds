package org.academiadecodigo.sshpecials;

public enum VaseStateType {

    /**
     * Each state of Vase has its diferent model (empty vase, vase with seeds, with plant grown, etc), and their own coordinates
     * to show on the screen at the correct place.
     */
    NO_VASE(600, 350, "Resources/vasoSlot.PNG"),
    EMPTY_VASE(600, 300,  "Resources/vaso.PNG");
    //VASE_READY_FOR_SEEDS(600, 300, "Resources/catiadistrit.PNG");
    //VASE_HAS_SEEDS,
    //VASE_HAS_WATER,
    //VASE_IS_COLLECTABLE;

    public int x;
    public int y;

    public String picturePath;

    VaseStateType(int x, int y, String picturePath) {
        this.x = x;
        this.y = y;
        this.picturePath = picturePath;
    }

}
