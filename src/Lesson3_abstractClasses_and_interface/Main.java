package Lesson3_abstractClasses_and_interface;

public class Main {
    public static void main(String[] args) {
        //    Product p = new Product();
        Product p = new MacBook();
        Product l = new LenovoLaptop();
        l.termAndCondition();
        p.termAndCondition();
    }
}
