package singleTon_pattern;

public class WebApp {
	public static void main(String args[]) {
	
	Logger logger1=Logger.getInstance();
	Logger logger2=Logger.getInstance();
	
	logger1.log("logger1 Says Starting app......");
	logger2.log("still using logger 1");
	
	System.out.println(logger1==logger2);
}
}
