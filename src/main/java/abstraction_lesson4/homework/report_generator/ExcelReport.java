package abstraction_lesson4.homework.report_generator;

public class ExcelReport implements ReportGenerator{
    @Override
    public void generate() {
        System.out.println("Fetching data for Excel...");
        System.out.println("Formatting data for Excel...");
        System.out.println("Generating Excel report...");
    }
}
