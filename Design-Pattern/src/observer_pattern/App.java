package observer_pattern;

public class App {
	
	public static void main(String args[])
	{
		YoutubeChannel youtubeChannel =new YoutubeChannel();
		
		Subscribers sub1 =new LaptopSubscriber("poova@gmail.com");
		Subscribers sub2=new MobileSubscriber("9043296496");
		
	   youtubeChannel.subscribe(sub1);
	   youtubeChannel.subscribe(sub2);
	   
	   youtubeChannel.uploadNewVideo("SOLID Principles");
	}

}
