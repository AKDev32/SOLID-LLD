package Lesson6.BetterCode.v1;

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

        Product () {

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
