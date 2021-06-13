package org.academiadecodigo.sshpecials.testing;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Text;
import org.academiadecodigo.simplegraphics.pictures.Picture;

import static org.academiadecodigo.sshpecials.testing.ItemType.*;

public class UserInterface {

    public static int TEXT_X = 20;
    public static int GROW_X = 15;
    public static int GROW_Y = 3;
    private Picture picture;


    private boolean visible = false;

    private Inventory inventory;
    private Text[] itemsCounter;

    private Text moneyCounter;
    private Text vaseCounter;
    private Text waterCanCounter;
    private Text shovelCounter;
    private Text scissorsCounter;
    private Text weedSeedsCounter;
    private Text weedBagsCounter;

    private Text[] counters;



    public UserInterface(Inventory inventory) {

        this.picture = new Picture(10,10,"Resources/inventoryMenu.PNG");
        this.inventory = inventory;
        itemsCounter = new Text[ItemType.values().length];
        this.counters = new Text[7];

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
        counters[6] = moneyCounter;

        for(int i = 0; i < counters.length; i++) {
            counters[i].setColor(Color.WHITE);
            counters[i].grow(15, GROW_Y);
        }
        showInventoryInterface();

    }
    public void createMoneyCounter() {

        moneyCounter = new Text(100, 20, " x " + inventory.keyCount(MONEY));

    }

    public void createVaseCounter() {

        vaseCounter = new Text(TEXT_X, 20, " x " + inventory.keyCount(VASE));

    }
    public void createWaterCanCounter() {

        waterCanCounter = new Text(TEXT_X, 40, " x " + inventory.keyCount(WATER_CAN));

    }
    public void createShovelCounter() {

        shovelCounter = new Text(TEXT_X, 60, " x " + inventory.keyCount(SHOVEL));

    }
    public void createScissorsCounter() {

        scissorsCounter = new Text(TEXT_X, 80, " x " + inventory.keyCount(SCISSORS));

    }
    public void createWeedSeedsCounter() {

        weedSeedsCounter = new Text(TEXT_X, 100, " x " + inventory.keyCount(WEED_SEEDS));

    }
    public void createWeedBagsCounter() {

        weedBagsCounter = new Text(TEXT_X, 120, " x " + inventory.keyCount(WEED_BAGS));

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

        picture.draw();

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
        createMoneyCounter();

    }
    public void update() {
       vaseCounter.setText(" x " + inventory.keyCount(VASE));
       shovelCounter.setText(" x " + inventory.keyCount(SHOVEL));
       waterCanCounter.setText(" x " + inventory.keyCount(WATER_CAN));
       scissorsCounter.setText(" x " + inventory.keyCount(SCISSORS));
       weedSeedsCounter.setText(" x " + inventory.keyCount(WEED_SEEDS));
       weedBagsCounter.setText(" x " + inventory.keyCount(WEED_BAGS));
       moneyCounter.setText(" x " + inventory.keyCount(MONEY));

    }
    public boolean isVisible() {
        return visible;
    }


}
