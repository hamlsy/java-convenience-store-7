package store.service;

import store.model.Item;
import store.model.Promotion;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import static store.message.ErrorMessage.*;
import static store.Constants.*;
public class StoreFileWriter {

    public static void updateItemFile(List<Item> items, String filePath){
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(PRODUCTS_FILE_FIRST_LINE);
            writer.newLine();

            for (Item item : items) {
                String promotion = item.getPromotionName() == null ? "null" : item.getPromotionName();
                String line = item.getName() + "," + item.getPrice() + "," + item.getQuantity() + "," + promotion;
                writer.write(line);
                writer.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(FILE_UPDATE_ERROR.getMessage());
        }
    }

    public static void updatePromotionFile(List<Promotion> promotions, String filePath){
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(PROMOTIONS_FILE_FIRST_LINE);
            writer.newLine();

            for (Promotion promotion : promotions) {
                String line = promotion.getName() + "," + promotion.getBuyAmount() + "," + promotion.getGetAmount() + "," + promotion.getStartDate() + "," + promotion.getEndDate();
                writer.write(line);
                writer.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(FILE_UPDATE_ERROR.getMessage());
        }
    }

}
