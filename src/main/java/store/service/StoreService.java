package store.service;

import store.model.FileReader;
import store.model.Item;
import store.model.Promotion;
import store.model.Store;

import java.util.List;

public class StoreService {

    public Store createStore(){
        String itemFilePath = "src/main/resources/products.md";
        String promotionFilePath = "src/main/resources/products.md";
        List<Item> items = FileReader.readItemsFromFile(itemFilePath);
        List<Promotion> promotions = FileReader.readPromotionsFromFile(promotionFilePath);
        return new Store(items, promotions);
    }



}
