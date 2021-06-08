package org.academiadecodigo.sshpecials.testing;
import org.academiadecodigo.simplegraphics.graphics.Text;
import static org.academiadecodigo.sshpecials.testing.ItemType.*;

public class UserInterface {

    private Inventory inventory;
    private Text[] itemsCounter;
    private Text vaseCounter;

    public UserInterface(Inventory inventory) {
        this.inventory = inventory;
        itemsCounter = new Text[ItemType.values().length];

        init();
    }

    public void init() {
        vaseCounter = new Text(840, 20, "Vase x " + inventory.keyCount(VASE));
        vaseCounter.delete();
        vaseCounter.grow(15, 8);
        vaseCounter.draw();

    }
    public void update() {
        vaseCounter.delete();
        vaseCounter = new Text(840, 20, "Vase x " + inventory.keyCount(VASE));
        vaseCounter.grow(15, 8);
        vaseCounter.draw();
    }
}
