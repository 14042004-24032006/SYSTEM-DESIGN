package dip;

public class Main {
	public static void main(String args[])
	{
		ReportSaver saver1 =new FileReportSaver();
		ReportSaver saver2 =new PDFReportSaver();
		
		ReportService service1=new ReportService(saver1);
		ReportService service2=new ReportService(saver2);
		
		service1.saveReport(
				"This one is saving the report as text file");
		service2.saveReport(
				"This one saving the report as PDF file");
		
	}

}
