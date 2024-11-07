package store.service;

import store.model.Item;
import store.model.Promotion;
import store.model.Store;

import java.util.List;

import static store.Constants.*;
public class StoreService {

    public Store initStore(){
        List<Item> items = StoreFileReader.readItemsFromFile(PRODUCTS_PATH);
        List<Promotion> promotions = StoreFileReader.readPromotionsFromFile(PROMOTIONS_PATH);
        return new Store(items, promotions);
    }

    public void buyStoreProduct(Store store){

    }

}
