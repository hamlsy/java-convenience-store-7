package store.service;

import store.model.FileReader;
import store.model.Item;
import store.utils.Utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StoreService {

    public List<Item> readItems(String filePath){
        return FileReader.readItemsFromProductsFile(filePath);
    }


}
