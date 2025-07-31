package observer_pattern;

import java.util.ArrayList;
import java.util.List;

public class YoutubeChannel {
	
	private List<Subscribers>subscribers =new ArrayList<>();
	
	public void subscribe(Subscribers subscriber)
	{
		subscribers.add(subscriber);
		
	}
	public void unsubscriber(Subscribers subscriber)
	{
		subscribers.remove(subscriber);
	}
	public void uploadNewVideo(String videoTitle)
	{
		notifyAllSubscriber("New vedio uploaded :"+videoTitle);
	}
	private void notifyAllSubscriber(String msg) {
		 for(Subscribers subscriber : subscribers)
		 {
			 subscriber.notifySubscriber(msg);
		 }
		
	}

}
