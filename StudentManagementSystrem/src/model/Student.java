package model;

public class Student {
	private int id;
	private String name;
	private String rollNo;
	private String department;
	
	//Constructor
	public Student(int id, String name, String rollNo, String department) {
		super();
		//global  //local  
  		this.id = id;
		this.name = name;
		this.rollNo = rollNo;
		this.department = department;
	}
	
    //Getter &  Setteri
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRollNo() {
		return rollNo;
	}

	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", rollNo=" + rollNo + ", department=" + department + "]";
	}
	
	
	

}
