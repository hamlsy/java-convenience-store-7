package store.utils;

import store.validation.GlobalValidation;

public class Utils {
    public static void print(String message){
        System.out.println(message);
    }

    public static int stringToInteger(String input){
        GlobalValidation.validateStringToInteger(input);
        return Integer.parseInt(input);
    }



}
