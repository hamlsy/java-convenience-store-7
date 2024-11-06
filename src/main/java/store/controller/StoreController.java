package store.controller;

import store.model.Store;
import store.service.StoreService;
import store.view.OutputView;

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
        store = service.initStore();
        OutputView.printCurrentItems(store);
    }


}
