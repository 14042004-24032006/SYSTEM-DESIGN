package factory_pattern;

public class PushNotification implements Notification{

	@Override
	public void sendNotification(String notification) {
		 System.out.println("Notification via Push");
		
	}

}
