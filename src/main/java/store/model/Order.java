package store.model;

import java.util.HashMap;

public class Order {
    private HashMap<Item, Integer> orderItems = new HashMap<>();
    private Buyer buyer;
    private Store store;

    public Order(Buyer buyer, Store store) {
        this.store = store;
        this.buyer = buyer;
    }

    public void orderItem(Item item, int quantity){
        orderItems.put(item, quantity);
    }

    public HashMap<Item, Integer> getOrderItems(){
        return orderItems;
    }

}
