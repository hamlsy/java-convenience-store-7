package store.view;

import store.model.Item;
import store.model.Store;
import store.utils.Utils;

import static store.message.OutputMessage.*;

public class OutputView {
    public static void printCurrentItems(Store store){
        Utils.print(OUTPUT_CURRENT_ITEMS_INFO.getMessage());
        for(Item item : store.getItems()){
            Utils.print(OUTPUT_CURRENT_ITEMS.getItemFormatMessage(item));
        }
    }
}
