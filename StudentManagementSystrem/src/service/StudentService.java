package service;

import java.util.List;

import dao.StudentDAO;
import model.Student;

public class StudentService {
	
	private StudentDAO studentDAO;
	
	//default constructor
	public StudentService()
	{
		this.studentDAO=new StudentDAO();
	}
	
	public void addStudent(int id,String name,String rollNo,String department)
	{
		Student student= new Student(id,name,rollNo,department);
		
		studentDAO.saveStudent(student);
	}
	
	public List<Student>getAllStudent()
	{
		return studentDAO.getAll();
	}

}
