package store.model;

import java.util.HashMap;

public class Order {
    private HashMap<String, Integer> orderItems = new HashMap<>();
    private Buyer buyer;
    private Store store;

    public Order(Store store, Buyer buyer, HashMap<String, Integer> orderItems) {
        this.store = store;
        this.buyer = buyer;
        this.orderItems = orderItems;
    }

}
