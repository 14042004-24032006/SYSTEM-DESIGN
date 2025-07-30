package isp;

public class AcademicStudent implements AssignmentSubmitter,ClassAttendee {

	@Override
	public void attendClasses() {
		 System.out.println("Attending classes");
		
	}

	@Override
	public void SubmitAssignment() {
		// TODO Auto-generated method stub
		System.out.println("Submiting AssignmentS");
		
	}
  
}
