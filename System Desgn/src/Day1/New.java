package Day1;

//Payment System
interface PaymentSystem{
	void makePayment(double amount); 
	void refundPayment(double amount);
}

class CreditCardPayments implements PaymentSystem{

	@Override
	public void makePayment(double amount) {
		System.out.println("Payment of "+amount+" made with credit card.");
	}

	@Override
	public void refundPayment(double amount) {
		System.out.println("Payment of "+amount+" refunded to credit card.");
		
	}
	
}
class DebitCardPayments implements PaymentSystem{

	@Override
	public void makePayment(double amount) {
		System.out.println("Payment of "+amount+" made with debit card.");
	}

	@Override
	public void refundPayment(double amount) {
		System.out.println("Payment of "+amount+" refunded to debit card.");
		
	}
	
}
class UPIb implements PaymentSystem{

	@Override
	public void makePayment(double amount) {
		System.out.println("Payment of "+amount+" made with UPI.");
	}
	@Override
	public void refundPayment(double amount) {
		System.out.println("Payment of "+amount+" refunded with UPI.");
		
	}
}


abstract class BankTransaction{
	abstract void deposit(double amount);
	abstract void withdraw(double amount);
	
	void printTransactionDetails() {
		System.out.println("Transaction details printed");
	}
}

class NetBanking extends BankTransaction{

	@Override
	void deposit(double amount) {
		System.out.println("Deposited"+amount+" using net banking");
	}

	@Override
	void withdraw(double amount) {		
		System.out.println("Withdrawn"+amount+" using net banking");
	}	
}

class NEFT extends BankTransaction{

	@Override
	void deposit(double amount) {
		System.out.println("Deposited"+amount+" using NEFT");
	}

	@Override
	void withdraw(double amount) {	
		System.out.println("Withdrawn"+amount+" using NEFT");
	}	
}

class IMPS extends BankTransaction{

	@Override
	void deposit(double amount) {	
		System.out.println("Deposited"+amount+" using IMPS");
	}

	@Override
	void withdraw(double amount) {	
		System.out.println("Withdrawn"+amount+" using IMPS");
	}	
}

public class New {
	public static void main(String[] args) {
		PaymentSystem payment1=new CreditCardPayments();
		payment1.makePayment(1000.0);
		payment1.makePayment(500.0);
		
		PaymentSystem payment2=new DebitCardPayments();
		payment2.makePayment(1000.0);
		payment2.makePayment(500.0);
		
		PaymentSystem payment3=new UPIb();
		payment3.makePayment(1000.0);
		payment3.makePayment(500.0);
		
		BankTransaction transaction1 = new NetBanking();
		transaction1.deposit(1000.0);
		transaction1.withdraw(200.0);
		
		BankTransaction transaction2 = new NEFT();
		transaction2.deposit(1000.0);
		transaction2.withdraw(200.0);
		
		BankTransaction transaction3 = new IMPS();
		transaction3.deposit(1000.0);
		transaction3.withdraw(200.0);
		
	}

}