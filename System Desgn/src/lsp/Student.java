package lsp;
//Liskov subsitution

public abstract class Student {
protected String name;

public Student (String name) {
	this.name=name;	
}
public  abstract double getFees();


}
////violation of lsp
//public class ScholarshipStudent extends Student{
//	public ScholarshipStudent(String name) {
//		super(name);
//	}
//	@Override
//	public double getFees() {
//		throw new UnsupportedOperationException("Scholarship student don't pay fees");
//		
//}
