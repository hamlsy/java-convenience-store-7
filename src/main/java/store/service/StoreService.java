package store.service;

import store.model.*;

import java.util.HashMap;
import java.util.List;

import static store.Constants.*;
public class StoreService {

    public Store initStore(){
        HashMap<String, Promotion> promotionMap = StoreFileReader.readPromotionsFromFile(PROMOTIONS_PATH);
        List<Item> items = StoreFileReader.readItemsFromFile(PRODUCTS_PATH, promotionMap);
        return new Store(items);
    }

    public void orderItems(Order order){

    }

}
