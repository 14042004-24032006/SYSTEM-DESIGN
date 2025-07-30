package di;

import javax.sound.midi.VoiceStatus;

public class Email  implements MessageService{
	@Override
	
	public void sendMessage(String msg)
	{
		System.out.println("Email Sent :"+msg);
	}

}
