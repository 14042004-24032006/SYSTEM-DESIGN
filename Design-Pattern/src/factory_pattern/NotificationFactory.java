package factory_pattern;

public class NotificationFactory
{
	public static Notification createNotification(String type)
	{
		if(type==null || type.isEmpty())
		{
			return null;
		}
		switch(type .toLowerCase())
		{
		case "email":
			return new EmailNotification();
		case "whatsapp":
			return new WhatsappNotification();
		case "sms":
			return new SmsNotification();
		case "push":
			return new PushNotification();
		default:
			throw new IllegalArgumentException("unknown method");
		}
		
	}

}
