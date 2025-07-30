package solid;

// Presenation Logic
public class ReportPrinter {
    public void printReport(SrpFixed student, double percentage){
        System.out.println("Name: " + student.getName());
        System.out.println("Percentage: " + percentage);
    }
}