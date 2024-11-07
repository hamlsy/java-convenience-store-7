package store.model;

import java.util.List;

public class Store {
    List<Item> items;

    public Store(List<Item> items) {
        this.items = items;
    }

    public List<Item> getItems(){
        return items;
    }

}
