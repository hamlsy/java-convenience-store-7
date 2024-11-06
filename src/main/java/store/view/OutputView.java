package store.view;

import store.model.Item;
import store.model.Store;
import store.utils.Utils;

import static store.message.OutputMessage.*;
import static store.utils.Utils.*;

public class OutputView {
    public static void printCurrentItems(Store store){
        print(OUTPUT_CURRENT_ITEMS_INFO.getMessage());
        for(Item item : store.getItems()){
            print(OUTPUT_CURRENT_ITEMS.getItemFormatMessage(item));
        }
    }
}
