package Lesson6.ProblematicCode;

public class Product {

    private String name;
    private String description;
    private double price;
    private String brand;
    private String categories;
    private String createdAt;
    private String updatedAt;
    private double discount;
    private int[] setOfImages;

    Product (String name, String description, double price, String brand, String categories, String createdAt, String updatedAt, double discount) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.brand = brand;
        this.categories = categories;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.discount = discount;
//        this.setOfImages = setOfImages;
    }

    Product (String name, String description) {

    }

    Product (String name, String description, double price) {
        
    }

//    Product (String name, String brand, double price) {
//
//    }
}
