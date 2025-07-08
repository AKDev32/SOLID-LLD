package Lesson3_abstractClasses_and_interface;

public class MacBook extends Product{
    @Override
    public double calculateDiscount() {
        return 0;
    }

    @Override
    public void termAndCondition() {
        System.out.println("Terms of MAcBook");
    }
}
