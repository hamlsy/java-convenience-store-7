package store.service;

import store.model.Item;
import store.model.Promotion;
import store.utils.Utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static store.Constants.*;
import static store.message.ErrorMessage.*;
public class StoreFileReader {

    public static List<Item> readItemsFromFile(String filePath){
        List<Item> items = new ArrayList<>();
        try{
            items = Files.lines(Paths.get(filePath)).skip(1)
                    .map(line -> {
                        String[] parts = line.split(PARSER_DELIMITER);
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
            throw new RuntimeException(FILE_READ_ERROR.getMessage());
        }
        return items;

    }

    public static List<Promotion> readPromotionsFromFile(String filePath){
        List<Promotion> promotions = new ArrayList<>();
        try{
            promotions = Files.lines(Paths.get(filePath)).skip(1)
                    .map(line -> {
                        String[] parts = line.split(PARSER_DELIMITER);
                        if (parts.length >= 5) {
                            String name = parts[0];
                            int buy = Utils.stringToInteger(parts[1]);
                            int get = Utils.stringToInteger(parts[2]);
                            String startDate = parts[3];
                            String endDate = parts[4];
                            return new Promotion(name, buy, get, startDate, endDate);
                        }
                        return null;
                    })
                    .collect(Collectors.toList());
        }catch (IOException e){
            throw new RuntimeException(FILE_READ_ERROR.getMessage());
        }
        return promotions;

    }
}
