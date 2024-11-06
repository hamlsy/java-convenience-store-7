package store.model;

import java.util.ArrayList;
import java.util.List;

public class Buyer {
    private List<Item> buyItems = new ArrayList<>();
    private List<Item> promotionItems = new ArrayList<>();

    public List<Item> getBuyItems() {
        return buyItems;
    }

    public List<Item> getPromotionItems() {
        return promotionItems;
    }

    public void addBuyItem(Item item){
        buyItems.add(item);
    }

    public void addPromotionItem(Item item){
        promotionItems.add(item);   re
    }

}
