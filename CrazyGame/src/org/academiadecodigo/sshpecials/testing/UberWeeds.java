package org.academiadecodigo.sshpecials.testing;

import com.google.common.collect.ConcurrentHashMultiset;
import com.google.common.collect.Multiset;

public class UberWeeds {

    private final Multiset<String> clientRequests;

    public UberWeeds() {
        clientRequests = ConcurrentHashMultiset.create();
    }

    public void removeRequest(String name, int quantity) {
        clientRequests.remove(name, quantity);
    }
    public void makeRequest(String name, int quantity) {
        clientRequests.add(name, quantity);
    }

    public int getRequestQuantity(String name) {
        return clientRequests.count(name);
    }

    public  boolean isEmpty() {
        return clientRequests.isEmpty();
    }
    public Multiset<String> getClientRequests() {
        return clientRequests;
    }
}
