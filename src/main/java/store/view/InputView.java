package store.view;

import static store.message.InputMessage.*;

import static camp.nextstep.edu.missionutils.Console.readLine;
import static store.utils.Utils.*;
public class InputView {
    public String readBuyItem(){
        print(INPUT_ITEM.getMessage());
        return readLine();
    }



}
