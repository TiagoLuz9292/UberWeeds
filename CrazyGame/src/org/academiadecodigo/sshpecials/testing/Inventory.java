package org.academiadecodigo.sshpecials.testing;

import com.google.common.collect.ConcurrentHashMultiset;
import com.google.common.collect.Multiset;

import static org.academiadecodigo.sshpecials.testing.ItemType.*;

public class Inventory {
    private final Multiset<ItemType> countingSet;

    public Inventory() {

        countingSet = ConcurrentHashMultiset.create();
        init();
    }
    public void add(ItemType key, int count) {
        countingSet.add(key, count);
    }
    public void remove(ItemType key, int count) {
        countingSet.remove(key, count);
    }
    public boolean hasItem(ItemType key) {
        return keyCount(key) > 0;
    }

    public int keyCount(ItemType key) {
        return countingSet.count(key);
    }

    public void init() {

        add(VASE,  5 );
        add(WATER_CAN,  1);
        add(SHOVEL, 1);
        add(SCISSORS, 1);
        add(WEED_SEEDS, 0);
        add(WEED_BAGS, 1000);
        add(WEED_FOR_SMOKE, 0);
        add(MONEY, 500);
    }
}