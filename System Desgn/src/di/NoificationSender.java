package di;

import javax.management.Notification;

public class NoificationSender {
	private MessageService messageService;
	
	//constructor injection
	public NoificationSender(MessageService service)
	{
		this.messageService=service;
		
	}
	public void notifyUser(String msg)
	{
		messageService.sendMessage(msg);
	}

}
