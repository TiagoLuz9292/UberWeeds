package org.academiadecodigo.sshpecials.gameObjects;

import org.academiadecodigo.sshpecials.scenery.WalkableScenery;
import org.academiadecodigo.sshpecials.testing.Inventory;

public interface Interactable {

    public abstract boolean changeState(Inventory inventory, WalkableScenery activeScenery);
}
