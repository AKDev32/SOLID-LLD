package Lesson1_SingleResponisibilityPrinciple.Example3;

import Lesson1_SingleResponisibilityPrinciple.Example2.BetterCode.Employee;

public class EmployeePerformanceGenerator {

    public String generateReport(String reportType, Employee employee) {
        if (reportType.equals("PDF")) {
            return "Generating PDF report.";
        } else if (reportType.equals("Word")) {
            return "Generating Word report.";
        }
        return "Report type not supported.";
    }
}

// There is no issue in SRP in this Block Code
