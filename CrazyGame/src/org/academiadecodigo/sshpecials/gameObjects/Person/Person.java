package org.academiadecodigo.sshpecials.gameObjects.Person;

import org.academiadecodigo.sshpecials.gameObjects.GameObject;
import org.academiadecodigo.sshpecials.gameObjects.Interactable;
import org.academiadecodigo.sshpecials.scenery.WalkableScenery;
import org.academiadecodigo.sshpecials.testing.Inventory;

public class Person extends GameObject implements Interactable {

    private String name;
    private boolean active;

    public Person(int limitLeftX, int limitRightX, int limitUpY, int limitDownY, int x, int y, String picturePath, String name) {
        super(limitLeftX, limitRightX, limitUpY, limitDownY, x, y, picturePath);
        this.name = name;
        this.active = false;
    }

    @Override
    public boolean changeState(Inventory inventory, WalkableScenery activeScenery) {
        return false;
    }
    public void activate() {
        active = true;
    }

    public void deActivate() {
        active = false;
    }
    public boolean isActive() {
        return active;
    }

}
