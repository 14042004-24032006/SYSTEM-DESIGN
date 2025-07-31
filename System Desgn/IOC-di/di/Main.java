package di;

///1.constructor Injection *
//2.setter injection *
//3.interface injection -
//4.Annotation * only in spring
public class Main {
 	public static void main(String args[]) {
 		//1.constructor Injection 
 		MessageService  service=new Email();
 		NoificationSender notNoificationSender=new NoificationSender(service);
 		notNoificationSender.notifyUser("Email is sent ! !");
 	}

}
