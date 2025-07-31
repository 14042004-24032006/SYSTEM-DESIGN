package observer_pattern;

public class MobileSubscriber implements Subscribers {
	
	private String phoneNumber;
	
	public MobileSubscriber(String phoneNumber) {
		super();
		this.phoneNumber = phoneNumber;
	}




	@Override
	public void notifySubscriber(String msg) {
		 System.out.println("SMS to "+phoneNumber+": "+msg);
		
	}

}
