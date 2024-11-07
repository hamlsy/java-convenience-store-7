package store.model;

public class Item {
    private String name;
    private int price;
    private int quantity;
    private Promotion promotion;

    public Item(String name, int price, int quantity, Promotion promotion) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.promotion = promotion;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getPromotionName() {
        return promotion.getName();
    }

    public void buyItem(int amount){

    }

    public String getQuantityToString(){
        if(hasNotQuantity()){
            return "재고 없음";
        }
        return Integer.toString(quantity);
    }

    private boolean hasNotQuantity(){
        return quantity == 0;
    }
}
