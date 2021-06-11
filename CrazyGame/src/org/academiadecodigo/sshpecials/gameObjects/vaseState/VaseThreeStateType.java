package org.academiadecodigo.sshpecials.gameObjects.vaseState;

public enum VaseThreeStateType {


        /**
         * Each state of Vase has its diferent model (empty vase, vase with seeds, with plant grown, etc), and their own coordinates
         * to show on the screen at the correct place.
         */
        NO_VASE(687, 272, "Resources/vasoSlot2.PNG"),
        EMPTY_VASE(687, 212,  "Resources/EmptyVase.PNG"),
        VASE_READY_FOR_SEEDS(687, 192, "Resources/VaseReadyForSeeds.PNG"),
        VASE_HAS_SEEDS(687, 192, "Resources/VaseHasSeeds.png"),
        VASE_HAS_WATER(687, 160, "Resources/VaseHasWater.png"),
        VASE_IS_COLLECTABLE(687, 156, "Resources/VaseIsCollectable.png");

        public int x;
        public int y;

        public String picturePath;

        VaseThreeStateType(int x, int y, String picturePath) {
            this.x = x;
            this.y = y;
            this.picturePath = picturePath;
        }


}
