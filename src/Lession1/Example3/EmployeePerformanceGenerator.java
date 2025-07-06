package Lession1.Example3;

import Lession1.Example2.BetterCode.Employee;

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
