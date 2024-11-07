package store.model;

import java.util.ArrayList;
import java.util.List;

public class Buyer {
    private List<Order> orders = new ArrayList<>();
    private List<Item> promotionItems = new ArrayList<>();

    public List<Order> getOrders() {
        return orders;
    }

    public List<Item> getPromotionItems() {
        return promotionItems;
    }

    public void addPromotionItem(Item item){
        promotionItems.add(item);
    }

}
