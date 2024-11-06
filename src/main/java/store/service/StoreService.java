package store.service;

import store.model.Item;
import store.model.Promotion;
import store.model.Store;

import java.util.List;

public class StoreService {

    public Store initStore(){
        String itemFilePath = "src/main/resources/products.md";
        String promotionFilePath = "src/main/resources/products.md";
        List<Item> items = StoreFileReader.readItemsFromFile(itemFilePath);
        List<Promotion> promotions = StoreFileReader.readPromotionsFromFile(promotionFilePath);
        return new Store(items, promotions);
    }



}
