package org.academiadecodigo.sshpecials.testing;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Text;
import static org.academiadecodigo.sshpecials.testing.ItemType.*;

public class UserInterface {

    public static int TEXT_X = 900;
    public static int GROW_X = 15;
    public static int GROW_Y = 3;


    private boolean visible = false;

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
        this.counters = new Text[6];

        init();
    }
    public void init() {

        createCounters();
        counters[0] = vaseCounter;
        counters[1] = waterCanCounter;
        counters[2] = shovelCounter;
        counters[3] = scissorsCounter;
        counters[4] = weedSeedsCounter;
        counters[5] = weedBagsCounter;

        for(int i = 0; i < counters.length; i++) {
            counters[i].setColor(Color.WHITE);
            counters[i].grow(15, GROW_Y);
        }
        //showInventoryInterface();

    }
    public void createVaseCounter() {

        vaseCounter = new Text(TEXT_X, 20, "Vase x " + inventory.keyCount(VASE));

    }
    public void createWaterCanCounter() {

        waterCanCounter = new Text(TEXT_X, 40, "Water x " + inventory.keyCount(WATER_CAN));

    }
    public void createShovelCounter() {

        shovelCounter = new Text(TEXT_X, 60, "Shovel x " + inventory.keyCount(SHOVEL));

    }
    public void createScissorsCounter() {

        scissorsCounter = new Text(TEXT_X, 80, "Scissors x " + inventory.keyCount(SCISSORS));

    }
    public void createWeedSeedsCounter() {

        weedSeedsCounter = new Text(TEXT_X, 100, "Weed Seeds x " + inventory.keyCount(WEED_SEEDS));

    }
    public void createWeedBagsCounter() {

        weedBagsCounter = new Text(TEXT_X, 120, "Weed Bags x " + inventory.keyCount(WEED_BAGS));

    }

    public void hideInventoryInterface() {

        for(int i = 0; i < counters.length; i++) {
            if(counters[i] != null) {
                counters[i].delete();
            }

        }
        visible = false;
    }
    public void showInventoryInterface() {

        for(int i = 0; i < counters.length; i++) {
            System.out.println("teste, a pintar texto do inv ANTES DO IF");
            if(counters[i] != null) {
                System.out.println("teste, a pintar texto do inv");

                counters[i].draw();

            }
        }
        visible = true;

    }
    public void createCounters() {
        createVaseCounter();
        createWaterCanCounter();
        createShovelCounter();
        createScissorsCounter();
        createWeedSeedsCounter();
        createWeedBagsCounter();

    }
    public void update() {
       vaseCounter.setText("Vase x " + inventory.keyCount(VASE));
       shovelCounter.setText("Shovel x " + inventory.keyCount(SHOVEL));
       waterCanCounter.setText("Water x " + inventory.keyCount(WATER_CAN));
       scissorsCounter.setText("Scissors x " + inventory.keyCount(SCISSORS));
       weedSeedsCounter.setText("Weed Seeds x " + inventory.keyCount(WEED_SEEDS));
       weedBagsCounter.setText("Weed Bags x " + inventory.keyCount(WEED_BAGS));

    }
    public boolean isVisible() {
        return visible;
    }

}
