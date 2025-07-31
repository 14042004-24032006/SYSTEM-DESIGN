package factory_pattern;

public class EmailNotification implements Notification
{
	@Override
   public void sendNotification(String notification)
   {
	   System.out.println("Sending notification via Email"+notification);
   }
}
