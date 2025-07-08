package Lesson2_OpenClosedPrinciple.HomeWork.BetterCode.Solution1;

public abstract class Product {

    double price;

    public abstract double calculateDiscount ();

    double getPrice () {
        return price;
    }
}
