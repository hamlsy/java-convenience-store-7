package store.model;

import java.util.List;

public class Store {
    List<Item> items;
    List<Promotion> promotions;

    public Store(List<Item> items, List<Promotion> promotions) {
        this.items = items;
        this.promotions = promotions;
    }

    public List<Item> getItems(){
        return items;
    }
}
