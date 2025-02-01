package abstraction_lesson4.homework.report_generator;

public class PdfReport implements ReportGenerator{
    @Override
    public void generate() {
        System.out.println("Fetching data for PDF...");
        System.out.println("Formatting data for PDF...");
        System.out.println("Generating PDF report...");
    }
}
