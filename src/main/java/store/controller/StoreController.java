package store.controller;

import store.model.Buyer;
import store.model.Store;
import store.service.StoreService;
import store.view.OutputView;

public class StoreController {
    private Store store;
    private Buyer buyer;

    private StoreService service;

    public StoreController() {
        this.service = new StoreService();
        this.buyer = new Buyer();
    }

    public void run(){
        initializeStore();
        buyStoreProduct();
        afterBuyProduct();
    }

    public void initializeStore(){
        store = service.initStore();
        OutputView.printCurrentItems(store);
    }

    public void buyStoreProduct(){
        //service.buyStoreProduct
    }

    public void afterBuyProduct(){

    }

}
