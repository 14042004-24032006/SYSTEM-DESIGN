package factory_pattern;

public class SmsNotification implements Notification 
{
	@Override
	public void sendNotification(String notification)
	{
		System.out.println("Notification via SMS");
	}
	

}
