package abstraction_lesson4.homework.report_generator;

public enum ReportType {
    PDF{
        public ReportGenerator getGenerateMethod(){
            return new PdfReport();
        }
    },
    EXCEL{
        public ReportGenerator getGenerateMethod(){
            return new ExcelReport();
        }
    };

    public abstract ReportGenerator getGenerateMethod();
}
