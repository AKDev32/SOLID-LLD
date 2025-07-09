package Lesson5_interfaceSegregstionPrinciple.ProblematicCode;

public class Admin implements User{
    @Override
    public boolean canBuyProducts() {
        return false;
    }

    @Override
    public boolean canModifyProducts() {
        return false;
    }

    @Override
    public boolean canApproveProducts() {
        return false;
    }

    @Override
    public boolean canAddProducts() {
        return false;
    }

    @Override
    public void approveProducts() {

    }
}
