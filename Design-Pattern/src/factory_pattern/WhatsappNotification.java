package factory_pattern;

public class WhatsappNotification implements Notification {

	@Override
	public void sendNotification(String notification) {
		 System.out.println("Notification via Whatsapp");
		
	}

}
