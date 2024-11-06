package store.service;

import store.model.Item;
import store.model.Promotion;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class StoreFileWriter {

    public static void updateItemFile(List<Item> items, String filePath){
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write("name,price,quantity,promotion");
            writer.newLine();

            for (Item item : items) {
                String promotion = item.getPromotionName() == null ? "null" : item.getPromotionName();
                String line = item.getName() + "," + item.getPrice() + "," + item.getQuantity() + "," + promotion;
                writer.write(line);
                writer.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException("파일 저장 중 오류가 발생했습니다.", e);
        }
    }

    public static void updatePromotionFile(List<Promotion> promotions, String filePath){
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write("name,buy,get,start_date,end_date");
            writer.newLine();

            for (Promotion promotion : promotions) {
                String line = promotion.getName() + "," + promotion.getBuyAmount() + "," + promotion.getGetAmount() + "," + promotion.getStartDate() + "," + promotion.getEndDate();
                writer.write(line);
                writer.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException("파일 저장 중 오류가 발생했습니다.", e);
        }
    }

}
