package oops;

//Encapsulation

public class Employee {
	//data member
	 private long empid;
	private String Name;
	
	public Employee(long empId, String name) {
        this.empid = empId;
        this.Name = name;
    }
	 
	 void isLoggedIn()
	 {
		 System.out.println("Employee is loggedIn");
	 }
	 void isLogOut()
	 {
		 System.out.println("Employee is loggedOut");
	 }
	 
 //Getter & setter
	    public long getEmpid() {
			return empid;
		}
		public void setEmpid(long empid) {
			this.empid = empid;
		}
		public String getName() {
			return Name;
		}
		public void setName(String name) {
			Name = name;
		}
    

}

