package lsp;

public class SchollarshipStudent extends Student{
	
	public SchollarshipStudent(String name) {
		super(name);
	}
	@Override
	public double getFees()
	{
		return 0;
	}

}
