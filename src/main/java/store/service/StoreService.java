package store.service;

import store.model.Buyer;
import store.model.Item;
import store.model.Promotion;
import store.model.Store;

import java.util.HashMap;
import java.util.List;

import static store.Constants.*;
public class StoreService {

    public Store initStore(){
        HashMap<String, Promotion> promotionMap = StoreFileReader.readPromotionsFromFile(PROMOTIONS_PATH);
        List<Item> items = StoreFileReader.readItemsFromFile(PRODUCTS_PATH, promotionMap);
        return new Store(items);
    }

    public void orderItems(Store store, Buyer buyer, HashMap<String, Integer> orderMap){

    }

}
