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

    public String setName (String name) {
        return this.name;
    }

    public String setDescription (String description) {
        return this.description;
    }

    public double setPrice (double price) {
        return this.price;
    }

    public String setBrand (String brand) {
        return this.brand;
    }

    public String setCategories (String categories) {
        return this.categories;
    }

    public String setCreatedAt (String createdAt) {
        return this.createdAt;
    }

    public String setUpdatedAt (String updatedAt) {
        return this.updatedAt;
    }

    public double setDiscount (double discount) {
        return this.discount;
    }

//    public int[] setSetOfImages (int[] setOfImages) {
//        return this.setOfImages;
//    }
}
