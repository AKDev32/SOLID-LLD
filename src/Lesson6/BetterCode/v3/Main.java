package Lesson6.BetterCode.v3;

public class Main {
    public static void main(String[] args) {
        Builder b = new Builder();
        b.setName("IPhone");
        b.setDescription("This is an iphone");
        b.setPrice(150000);
        b.setBrand("Apple");

        Product p = new Product(b);
    }
}
