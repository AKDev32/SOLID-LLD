package Lesson2_OpenClosedPrinciple.Example3.BetterCode;

public class PDFReport implements ReportGenerator  {

    @Override
    public String generateReport() {
        return "Report in PDF";
    }
}
