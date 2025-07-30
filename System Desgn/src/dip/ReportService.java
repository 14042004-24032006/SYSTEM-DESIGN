//package dip;
////DIP - Dependency  Inversion Principle
//
//import java.io.FileWriter;
//import java.io.IOException;
//
////Violation
////report service directly depends on filSystem
////Hard to change/test to other file type due dependency on low level module
//public class ReportService {
////	public void saveReport(String data) {
////		FileWriter writer;
////		try {
////			writer=new FileWriter("report.pdf");
////			writer.write(data);
////			writer.close();
////		}catch(IOException io)
////		{
////			io.printStackTrace();
////		}
////	}
//
//}

package dip;
//Dip Solution
public class ReportService
{
	private ReportSaver saver;
	
	public ReportService(ReportSaver saver) {
	this.saver=saver;
	}
	public void saveReport(String data) {
		saver.save(data);
	}
}