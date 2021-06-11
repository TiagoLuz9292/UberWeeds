package org.academiadecodigo.sshpecials.testing;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Text;
import static org.academiadecodigo.sshpecials.testing.ItemType.*;

public class UserInterface {

    public static int TEXT_X = 920;
    public static int GROW_X = 15;
    public static int GROW_Y = 3;

    private Inventory inventory;
    private Text[] itemsCounter;

    private Text vaseCounter;
    private Text waterCanCounter;
    private Text shovelCounter;
    private Text scissorsCounter;
    private Text weedSeedsCounter;
    private Text weedBagsCounter;

    private Text[] counters;


    public UserInterface(Inventory inventory) {
        this.inventory = inventory;
        itemsCounter = new Text[ItemType.values().length];

        init();
    }
    public void init() {
        counters = new Text[6];
        counters[0] = vaseCounter;
        counters[1] = waterCanCounter;
        counters[2] = shovelCounter;
        counters[3] = scissorsCounter;
        counters[4] = weedSeedsCounter;
        counters[5] = weedBagsCounter;

        update();
        hideInventoryInterface();

    }
    public void createVaseCounter() {
        if(vaseCounter != null) {
            vaseCounter.delete();
        }

        vaseCounter = new Text(TEXT_X, 20, "Vase x " + inventory.keyCount(VASE));
        vaseCounter.delete();
        vaseCounter.grow(15, GROW_Y);
        vaseCounter.setColor(Color.WHITE);
        vaseCounter.draw();
    }
    public void createWaterCanCounter() {
        if(waterCanCounter != null) {
            waterCanCounter.delete();
        }
        waterCanCounter = new Text(TEXT_X, 40, "Water x " + inventory.keyCount(WATER_CAN));
        waterCanCounter.delete();
        waterCanCounter.grow(15, GROW_Y);
        waterCanCounter.setColor(Color.WHITE);
        waterCanCounter.draw();

    }
    public void createShovelCounter() {
        if(shovelCounter != null) {
            shovelCounter.delete();
        }
        shovelCounter = new Text(TEXT_X, 60, "Shovel x " + inventory.keyCount(SHOVEL));
        shovelCounter.delete();
        shovelCounter.grow(15, GROW_Y);
        shovelCounter.setColor(Color.WHITE);
        shovelCounter.draw();
    }
    public void createScissorsCounter() {
        if(scissorsCounter != null) {
            scissorsCounter.delete();
        }

        scissorsCounter = new Text(TEXT_X, 80, "Scissors x " + inventory.keyCount(SCISSORS));
        scissorsCounter.delete();
        scissorsCounter.grow(15, GROW_Y);
        scissorsCounter.setColor(Color.WHITE);
        scissorsCounter.draw();
    }
    public void createWeedSeedsCounter() {
        if(weedSeedsCounter != null) {
            weedSeedsCounter.delete();
        }
        weedSeedsCounter = new Text(TEXT_X, 100, "Weed Seeds x " + inventory.keyCount(WEED_SEEDS));
        weedSeedsCounter.delete();
        weedSeedsCounter.grow(15, GROW_Y);
        weedSeedsCounter.setColor(Color.WHITE);
        weedSeedsCounter.draw();
    }
    public void createWeedBagsCounter() {
        if(weedBagsCounter != null) {
            weedBagsCounter.delete();
        }

        weedBagsCounter = new Text(TEXT_X, 120, "Weed Bags x " + inventory.keyCount(WEED_BAGS));
        weedBagsCounter.delete();
        weedBagsCounter.grow(15, GROW_Y);
        weedBagsCounter.setColor(Color.WHITE);
        weedBagsCounter.draw();
    }

    public void hideInventoryInterface() {

        for(Text text : counters) {
            text.delete();
        }
    }
    public void showInventoryInterface() {
        shovelCounter = new Text(TEXT_X, 60, "Shovel x " + inventory.keyCount(SHOVEL));

        for(Text text : counters) {

            text.grow(15, GROW_Y);
            text.setColor(Color.WHITE);
            text.draw();
        }
        vaseCounter.draw();
        shovelCounter.draw();
        waterCanCounter.draw();
        scissorsCounter.draw();
        weedSeedsCounter.draw();
        weedBagsCounter.draw();
    }

    public void update() {
        createVaseCounter();
        createWaterCanCounter();
        createShovelCounter();
        createScissorsCounter();
        createWeedSeedsCounter();
        createWeedBagsCounter();
    }


}
