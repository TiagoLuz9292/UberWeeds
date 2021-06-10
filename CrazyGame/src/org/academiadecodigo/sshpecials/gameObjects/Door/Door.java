package org.academiadecodigo.sshpecials.gameObjects.Door;

import org.academiadecodigo.sshpecials.gameObjects.GameObject;

public class Door extends GameObject {

    private int nextSceneryIndex;

    public Door(int leftLimitX,int rightLimitX, int upLimitY, int downLimitY,int nextSceneryIndex){

        super(leftLimitX,rightLimitX,upLimitY,downLimitY);

    }

    public int getNextSceneryIndex() {
        return nextSceneryIndex;
    }

    @Override
    public void changeState() {

    }

}
