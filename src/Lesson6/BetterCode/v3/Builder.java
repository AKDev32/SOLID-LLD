package Lesson6.BetterCode.v3;

import java.util.List;

public class Builder {

    private String name;
    private String description;
    private double price;
    private String brand;
    private String categories;
    private String createdAt;
    private String updatedAt;
    private double discount;
    private List<String> images;

    Builder () {

    }

    public String getName () {
        return this.name;
    }

    public double getPrice () {
        return this.price;
    }

    public String getDescription () {
        return this.description;
    }

    public String getCategories () {
        return this.categories;
    }

    public String getBrand () {
        return this.brand;
    }

    public String getCreatedAt () {
        return this.createdAt;
    }

    public String getUpdatedAt () {
        return this.updatedAt;
    }

    public double getDiscount () {
        return this.discount;
    }

    public void setName (String name) {
        this.name = name;
    }

    public void setDescription (String description) {
        this.description = description;
    }

    public void setPrice (double price) {
        if (price < 0) return;
        this.price = price;
    }

    public void setBrand (String brand) {
        this.brand = brand;
    }

    public void setCategories (String categories) {
        this.categories = categories;
    }

    public void setCreatedAt (String createdAt) {
        this.createdAt = createdAt;
    }

    public void setUpdatedAt (String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public void setDiscount (double discount) {
        this.discount = discount;
    }

}

