package abstraction_lesson4.homework.report_generator;

public class Main {
    public static void main(String[] args) {
        Generator generator = new Generator(ReportType.PDF);
        generator.generate();
    }
}
