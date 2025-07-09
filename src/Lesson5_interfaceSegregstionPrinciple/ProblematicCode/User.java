package Lesson5_interfaceSegregstionPrinciple.ProblematicCode;

public interface User {

    boolean canBuyProducts ();

    boolean canModifyProducts ();

    boolean canApproveProducts ();

    boolean canAddProducts ();

    void approveProducts ();
}
