package store.service;

import store.model.Item;
import store.utils.Utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class StoreService {

    public List<Item> readItemsFromProductsFile(String filePath) throws IOException {
        List<Item> items = new ArrayList<>();
        List<String> lines = Files.readAllLines(Paths.get(filePath));

        for (String line : lines) {
            String[] parts = line.split(",");
            if (parts.length >= 4) {
                String name = parts[0];
                int price = Utils.stringToInteger(parts[1]);
                int quantity = Utils.stringToInteger(parts[2]);
                String promotionName = parts[3];
                items.add(new Item(name, price, quantity, promotionName));
            }
        }
        return items;
    }
}
