package store.model;

public class Item {
    private String name;
    private int price;
    private int quantity;
    private String promotionName;

    public Item(String name, int price, int quantity, String promotionName) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.promotionName = promotionName;
    }
}
