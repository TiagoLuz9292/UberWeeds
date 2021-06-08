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

        add(VASE,  0);
        add(WATER_CAN,  0);
        add(SHOVEL, 0);
        add(SCISSORS, 0);
        add(WEED_SEEDS, 0);
        add(WEED_BAGS, 0);
        add(WEED_FOR_SMOKE, 0);
    }
}