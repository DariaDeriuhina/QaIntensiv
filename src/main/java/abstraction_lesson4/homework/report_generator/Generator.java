package abstraction_lesson4.homework.report_generator;

public class Generator {
    private ReportGenerator reportGenerator;

    public Generator(ReportType reportType){
        reportGenerator = reportType.getGenerateMethod();
    }

    public void generate(){
        if (reportGenerator == null) {
            System.out.println("Unknown report type.");
            return;
        }
        reportGenerator.generate();
    }
}
