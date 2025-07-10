package Lesson6.BetterCode.v2;

import java.util.HashMap;
import java.util.List;

public class Product {

    private String name;
    private String description;
    private double price;
    private String brand;
    private String categories;
    private String createdAt;
    private String updatedAt;
    private double discount;
    private List<String> images;

    Product (HashMap<String, Object> mp) {
        if (mp.get("price").equals(0)) {
//            this.price = mp.get("price");
        }
    }
}
