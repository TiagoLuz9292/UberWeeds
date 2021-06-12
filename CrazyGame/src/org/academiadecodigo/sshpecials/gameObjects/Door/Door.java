package org.academiadecodigo.sshpecials.gameObjects.Door;

import org.academiadecodigo.sshpecials.gameObjects.GameObject;
import org.academiadecodigo.sshpecials.gameObjects.Interactable;
import org.academiadecodigo.sshpecials.testing.Inventory;

public class Door extends GameObject implements Interactable {

    private int nextSceneryIndex;

    public Door(int leftLimitX,int rightLimitX, int upLimitY, int downLimitY,int nextSceneryIndex){

        super(leftLimitX,rightLimitX,upLimitY,downLimitY);

        this.nextSceneryIndex = nextSceneryIndex;

    }

    public int getNextSceneryIndex() {
        return nextSceneryIndex;
    }

    @Override
    public boolean changeState(Inventory inventory) {
        return false;
    }

}
