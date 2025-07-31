package observer_pattern;

public class LaptopSubscriber implements Subscribers {
	
	private String Email;
	
	public LaptopSubscriber(String email) {
		super();
		Email = email;
	}

	@Override
	public void notifySubscriber(String msg) {
		System.out.println("email to : "+Email+" : "+msg);
		
	}

}
