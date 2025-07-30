//package isp;
//
//public interface StudentActions {
//   void attendClass();
//   void submitAssignment();
//   void joinClub();
//   void participateInCompetiton();
//}
//
////Violation of ISP
//class AcademicStudent implements StudentActions{
//
//	@Override
//	public void attendClass() {
//		System.out.println("Attending class");
//		
//	}
//
//	@Override
//	public void submitAssignment() {
//		System.out.println("Submitting Assignment");
//		
//	}
//
//	@Override
//	public void joinClub() {
//		 throw new UnsupportedOperationException(
//				 "Not Interesting in joining club");
//		
//	}
//
//	@Override
//	public void participateInCompetiton() {
//		throw new UnsupportedOperationException(
//				"Not Interesting in Paricipation");
//		
//	}
//	
//}