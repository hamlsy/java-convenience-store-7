package store.controller;

import store.model.Item;
import store.model.Store;
import store.service.StoreService;

import java.io.IOException;
import java.util.List;

public class StoreController {
    private Store store;
    private StoreService service;

    public StoreController(StoreService service) {
        this.service = service;
    }

    public void run(){
        initializeStore();
    }

    public void initializeStore(){
        getStoreProducts();
    }

    public List<Item> getStoreProducts(){
        String filePath = "src/main/resources/products.md";
        return service.readItems(filePath);
    }

}
