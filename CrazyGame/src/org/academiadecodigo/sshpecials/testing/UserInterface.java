package org.academiadecodigo.sshpecials.testing;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Text;
import org.academiadecodigo.simplegraphics.pictures.Picture;

import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.academiadecodigo.sshpecials.gameObjects.Person.StonerFactory;

import static org.academiadecodigo.sshpecials.testing.ItemType.*;

public class UserInterface {

    public static int TEXT_X = 70;
    public static int GROW_X = 15;
    public static int GROW_Y = 3;


    private boolean visible = true;

    private Inventory inventory;
    private UberWeeds uberWeeds = StonerFactory.uberWeeds;


    private Picture inventoryBackground;
    private Picture uberRequestImage;


    private Text moneyCounter;
    private Text vaseCounter;
    private Text waterCanCounter;
    private Text shovelCounter;
    private Text scissorsCounter;
    private Text emptyBagsCounter;
    private Text weedSeedsCounter;
    private Text weedBagsCounter;

    private Text uberRequest;
    private Text uberRequestInfo;

    private Text[] counters;



    public UserInterface(Inventory inventory) {


        this.inventory = inventory;

        this.counters = new Text[8];

        init();
    }
    public void init() {
        inventoryBackground = new Picture(10,10,"Resources/InventoryMenu.png");
        uberRequestImage = new Picture(0,275, "Resources/UberWeeds.png");
        uberRequestImage.grow(-15, -10);
        createCounters();
        counters[0] = vaseCounter;
        counters[1] = waterCanCounter;
        counters[2] = shovelCounter;
        counters[3] = scissorsCounter;
        counters[4] = weedSeedsCounter;
        counters[5] = weedBagsCounter;
        counters[6] = moneyCounter;
        counters[7] = emptyBagsCounter;

        for(int i = 0; i < counters.length; i++) {
            counters[i].setColor(Color.BLACK);
            //counters[i].grow(15, GROW_Y);
        }
        showInventoryInterface();


    }

    public void hideInventoryInterface() {
        inventoryBackground.delete();
        for(int i = 0; i < counters.length; i++) {
            if(counters[i] != null) {
                counters[i].delete();
            }

        }
        visible = false;
    }
    public void showInventoryInterface() {
        uberRequestImage.delete();
        uberRequestImage.draw();
        uberRequest.delete();
        uberRequest.draw();
        uberRequestInfo.delete();
        uberRequestInfo.draw();
        inventoryBackground.draw();
        for(int i = 0; i < counters.length; i++) {
            System.out.println("teste, a pintar texto do inv ANTES DO IF");
            if(counters[i] != null) {
                System.out.println("teste, a pintar texto do inv");
                counters[i].delete();
                counters[i].draw();

            }
        }
        visible = true;

    }
    public void createCounters() {

        moneyCounter = new Text(TEXT_X, 45, " x " + inventory.keyCount(MONEY));
        vaseCounter = new Text(TEXT_X, 71, " x " + inventory.keyCount(VASE));
        scissorsCounter = new Text(TEXT_X, 96, " x " + inventory.keyCount(SCISSORS));
        shovelCounter = new Text(TEXT_X, 123, " x " + inventory.keyCount(SHOVEL));
        waterCanCounter = new Text(TEXT_X, 151, " x " + inventory.keyCount(WATER_CAN));
        emptyBagsCounter = new Text(TEXT_X, 179, " x " + inventory.keyCount(EMPTY_BAGS));
        weedBagsCounter = new Text(TEXT_X, 205, " x " + inventory.keyCount(WEED_BAGS));
        weedSeedsCounter = new Text(TEXT_X, 230, " x " + inventory.keyCount(WEED_SEEDS));


        uberRequest = new Text(75, 310, "");
        uberRequest.setColor(Color.BLACK);
        uberRequestInfo = new Text(75, 320, "");
        uberRequestInfo.setColor(Color.BLACK);

    }
    public void update() {
       vaseCounter.setText(" x " + inventory.keyCount(VASE));
       shovelCounter.setText(" x " + inventory.keyCount(SHOVEL));
       waterCanCounter.setText(" x " + inventory.keyCount(WATER_CAN));
       scissorsCounter.setText(" x " + inventory.keyCount(SCISSORS));
       emptyBagsCounter.setText(" x " + inventory.keyCount(EMPTY_BAGS));
       weedSeedsCounter.setText(" x " + inventory.keyCount(WEED_SEEDS));
       weedBagsCounter.setText(" x " + inventory.keyCount(WEED_BAGS));
       moneyCounter.setText(" x " + inventory.keyCount(MONEY));
    }
    public void updateUberRequests () {
        if(!uberWeeds.isEmpty()) {
            uberRequestImage.delete();
            uberRequestImage.draw();
            uberRequest.setText("New request from: ");
            uberRequestInfo.setText("Filipe - " + uberWeeds.getClientRequests().count("Filipe") + " Bags");
            uberRequestInfo.delete();
            uberRequestInfo.draw();
            uberRequest.delete();
            uberRequest.draw();
        } else{
            uberRequestImage.delete();
            uberRequestInfo.setText("");
            uberRequestInfo.delete();
            uberRequest.setText("");
            uberRequest.delete();
        }
    }
    public boolean isVisible() {
        return visible;
    }

}
