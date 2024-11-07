package store.service;

import store.utils.Utils;

import java.util.HashMap;
import java.util.List;

import static store.Constants.*;

public class InputParser {

    public static HashMap<String, Integer> getOrderMap(String input){
        HashMap<String, Integer> orderMap = new HashMap<>();
        List<String> inputBuyItems = List.of(input.split(PARSER_DELIMITER));
        for(String buyItem : inputBuyItems){
            validateInputOrderItemsFormat(buyItem);
            String[] parsed = parse(buyItem);
            orderMap.put(parsed[0], Utils.stringToInteger(parsed[1]));
        }
        return orderMap;
    }

    public static void validateInputOrderItemsFormat(String orderItem){
        if(orderItem.charAt(0) != '[' || orderItem.charAt(orderItem.length()-1) != ']'){
            throw new IllegalArgumentException();
        }
        if(!orderItem.contains("-")) {
            throw new IllegalArgumentException();
        }
    }

    private static String[] parse(String orderItem){
        return orderItem.substring(1, orderItem.length()-1).split("-");
    }
}
