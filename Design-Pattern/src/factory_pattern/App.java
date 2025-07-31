package factory_pattern;

public class App {
	
	public static void main(String args[])
	{
		Notification notification =NotificationFactory.createNotification("email");
		
		if (notification != null) {
            notification.sendNotification("HEloo!!!!!!!!");
        } else {
            System.out.println("No valid notification type provided.");
        }
	}

}
