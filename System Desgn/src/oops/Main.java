package oops;

public class Main {
  public static void main(String[] args)
  {
//	  Employee emp=new Employee(101,"Poonguzhali");
//	  Inheritence in=new Inheritence("lakshe",101);
//	  
//	  System.out.println("EmployeeNmae"+emp.getName());
//	  emp.isLoggedIn();
//      emp.isLogOut();
	  Polymorphism p1 = new CreditCard();  // dynamic binding
      Polymorphism p2 = new BankTransfer();

      p1.processPayment();   
      p2.processPayment();
	  
	  
  }
}
