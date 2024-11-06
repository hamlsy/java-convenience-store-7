package store.service;

import store.Constants;
import store.utils.Utils;

import java.util.HashMap;
import java.util.List;

import static store.Constants.*;

public class InputParser {

    public static HashMap<String, Integer> getBuyMap(String input){
        HashMap<String, Integer> buyMap = new HashMap<>();
        List<String> inputBuyItems = List.of(input.split(PARSER_DELIMITER));
        for(String buyItem : inputBuyItems){
            validateInputBuyItemsFormat(buyItem);
            String[] parsed = parse(buyItem);
            buyMap.put(parsed[0], Utils.stringToInteger(parsed[1]));
        }
        return buyMap;
    }

    public static void validateInputBuyItemsFormat(String buyItem){
        if(buyItem.charAt(0) != '[' || buyItem.charAt(buyItem.length()-1) != ']'){
            throw new IllegalArgumentException();
        }
        if(!buyItem.contains("-")) {
            throw new IllegalArgumentException();
        }
    }

    public static String[] parse(String buyItem){
        return buyItem.substring(1, buyItem.length()-1).split("-");
    }
}
