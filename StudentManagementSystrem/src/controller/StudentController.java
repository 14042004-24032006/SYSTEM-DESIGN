package controller;

import java.util.List;

import model.Student;
import service.StudentService;

//presentationLayer
public class StudentController {
	
	private StudentService studentService;
	
	public StudentController()
	{
		this.studentService =new StudentService();
	}
	
	public void createStudent(int id,String name,String rollNo,String department)
	{
        studentService.addStudent(id, name, rollNo, department);
        
        System.out.println("Student Created Successfully !");
        
	}
	
	public void displayAllStudent()
	{
		List<Student> students =studentService.getAllStudent();
		
		System.out.println("Here is the list of all Student");
		
		for(Student student :students)
		{
			System.out.println(student);
		}
	}

}
