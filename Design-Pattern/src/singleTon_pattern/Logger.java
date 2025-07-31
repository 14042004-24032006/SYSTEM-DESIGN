package singleTon_pattern;

public class Logger {
   
	private static Logger logger;
	
	public Logger()
	{
		
	}
	public static Logger getInstance()
	{
		if(logger==null)
		{
			logger=new Logger();
		}
		return logger;
	}
	
	public void log(String message)
	{
		System.out.println("Log : "+message);
	}
}
