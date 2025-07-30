package dip;

import java.io.FileWriter;
import java.io.IOException;

public class PDFReportSaver implements ReportSaver {
	@Override
	public void save(String data) {
		FileWriter writer;		
		try {
			writer=new FileWriter("report.pdf");
		writer.write(data);
		 System.out.println("✅ Saved report to report.txt");
		writer.close();
	}catch(IOException io)
		{
		io.printStackTrace();
	}
		}


}
