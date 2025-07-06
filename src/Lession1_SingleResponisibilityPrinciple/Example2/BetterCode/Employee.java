package Lession1_SingleResponisibilityPrinciple.Example2.BetterCode;

public class Employee {

    private final int employeeID;

    public Employee (int id) {
        this.employeeID = id;
    }

    public int getEmployeeID () {
        return this.employeeID;
    }
}
