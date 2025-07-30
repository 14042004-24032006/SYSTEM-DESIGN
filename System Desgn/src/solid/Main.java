package solid;

public class Main {
    public static void main(String args[]) {

        // Each class has a single responsibility
        // Code is easier to maintain
        // Data modeling
        SrpFixed student1 = new SrpFixed("Poova", new int[] { 30, 20, 40 });

        // Business Logic
        ReportCalculator reportCalculator = new ReportCalculator();
        double percentage = reportCalculator.calculatePercentage(student1);

        GradeStrategy letterStrategy = new LetterGradeSystem();
        GradeStrategy cgpaStrategy = new CGPASystem();

        GradeService gradeServiceLetter = new GradeService(letterStrategy);
        GradeService gradeServiceCGPA = new GradeService(cgpaStrategy);

        String gradeCGPA = gradeServiceCGPA.getGrade(percentage);
        String gradeLetterString = gradeServiceLetter.getGrade(percentage); // ✅ Fixed typo

        // Presentation Logic
        ReportPrinter reportPrinter = new ReportPrinter();
        reportPrinter.printReport(student1, percentage);
        System.out.println("CGPA:"+gradeCGPA);
        System.out.println("Grader:"+gradeLetterString);

        // Persistence
        ReportSaver reportSaver = new ReportSaver();
        reportSaver.saveToFile(student1, percentage);
    }
}
