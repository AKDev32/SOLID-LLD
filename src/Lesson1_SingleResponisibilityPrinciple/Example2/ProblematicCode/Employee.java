package Lesson1_SingleResponisibilityPrinciple.Example2.ProblematicCode;

public class Employee {

    public int id;

    public int getId () {
        return 0;
    }

    public String fetchBioData () {
        return "Some Bio Data";
    }

    public double calculateSalary () {
        return 0;
    }

    public void printPerformanceData () {
        System.out.println("Some performance related data");
    }
}
