package Lesson6.BetterCode.v3;

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

    Product (Builder b) {
        if (b.getPrice() > 0) {
            this.price = b.getPrice();
        }
        this.name = b.getName();
        this.price = b.getPrice();
        this.description = b.getDescription();
        this.categories = b.getCategories();
        this.discount = b.getDiscount();
        this.createdAt = b.getCreatedAt();
        this.updatedAt = b.getUpdatedAt();
        this.brand = b.getBrand();
    }
}

