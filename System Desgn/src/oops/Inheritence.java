//inheritance ->Extends
package oops;

public class Inheritence {
	//data member
	String Name;
	int age;
	
	public Inheritence(String name, int age) {
		super();
		Name = name;
		this.age = age;
	}
	
	
	//behavior
	void isEating()
	{
		System.out.println("Eating");
	}
	void isSleeping()
	{
		System.out.println("Sleeping");
	}

}

class program extends Inheritence{
	String companyName;

	public program(String name, int age, String companyName) {
		super(name, age);
		this.companyName = companyName;
	}	
	
}
class dancer extends Inheritence{
	String danceStyle;

	public dancer(String name, int age, String danceStyle) {
		super(name, age);
		this.danceStyle = danceStyle;
	}
}
