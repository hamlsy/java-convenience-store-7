package store.service;

import store.model.Item;
import store.utils.Utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StoreService {

    public List<Item> readItemsFromProductsFile(String filePath){
        List<Item> items = new ArrayList<>();
        try{
            items = Files.lines(Paths.get(filePath)).skip(1)
                    .map(line -> {
                        String[] parts = line.split(",");
                        if (parts.length >= 4) {
                            String name = parts[0];
                            int price = Utils.stringToInteger(parts[1]);
                            int quantity = Utils.stringToInteger(parts[2]);
                            String promotionName = parts[3].equals("null") ? null : parts[3];
                            return new Item(name, price, quantity, promotionName);
                        }
                        return null;
                    })
                    .collect(Collectors.toList());
        }catch (IOException e){
            System.out.println(e);
        }
        return items;

    }


}
