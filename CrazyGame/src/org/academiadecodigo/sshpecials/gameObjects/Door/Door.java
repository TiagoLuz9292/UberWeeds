package org.academiadecodigo.sshpecials.gameObjects.Door;

import org.academiadecodigo.sshpecials.gameObjects.GameObject;
import org.academiadecodigo.sshpecials.testing.Inventory;

public class Door extends GameObject {

    private int nextSceneryIndex;

    public Door(int leftLimitX,int rightLimitX, int upLimitY, int downLimitY,int nextSceneryIndex){

        super(leftLimitX,rightLimitX,upLimitY,downLimitY);

        this.nextSceneryIndex = nextSceneryIndex;

    }

    public int getNextSceneryIndex() {
        return nextSceneryIndex;
    }

    @Override
    public void changeState(Inventory inventory) {

    }

}
