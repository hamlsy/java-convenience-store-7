package store.message;

import store.model.Item;

public enum OutputMessage {
    OUTPUT_CURRENT_ITEMS_INFO("안녕하세요. W편의점입니다.\n현재 보유하고 있는 상품입니다."),
    OUTPUT_CURRENT_ITEMS("- %s %d원 %d개 %s");
    private String message;

    OutputMessage(String message) {
        this.message = message;
    }

    public String getMessage(){
        return message;
    }

    public String getItemFormatMessage(Item item){
        String name = item.getName();
        int price = item.getPrice();
        String quantity = item.getQuantityToString();
        String promotionName = item.getPromotionName();
        return String.format(message, name, price,
                quantity, promotionName);
    }

}
