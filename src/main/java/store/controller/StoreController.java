package store.controller;

import store.model.Buyer;
import store.model.Order;
import store.model.Store;
import store.service.InputParser;
import store.service.StoreService;
import store.view.InputView;
import store.view.OutputView;

import java.util.HashMap;

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
        String inputOrder = InputView.readOrderItem();
        HashMap<String, Integer> orderMap = InputParser.getOrderMap(inputOrder);
        service.orderItems(new Order(store, buyer, orderMap));
    }

    public void afterBuyProduct(){

    }

}
