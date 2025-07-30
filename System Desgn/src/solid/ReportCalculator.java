package solid;

// Buisness Logic
public class ReportCalculator {
    public double calculatePercentage(SrpFixed student){
        int total = 0;
        for(int mark : student.getMarks()){
            total+=mark;
        }
        return total/student.getMarks().length;

    }
//	
//	public String gradeCalculator(double percentage) {
//		if(percentage >=90)return "A";
//		else if(percentage >=80) return "B";
//		
//	}
}