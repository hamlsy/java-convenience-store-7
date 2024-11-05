package store.validation;

import static store.message.ErrorMessage.*;

public class GlobalValidation {

    public static void validateStringToInteger(String input){
        if(isNotNumeric(input)){
            throw new IllegalArgumentException(INVALID_INPUT_ERROR.getMessage());
        }
    }

    private static boolean isNotNumeric(String target){
        return !target.chars().allMatch(Character::isDigit);
    }

}
