package strategy_pattern;

public class CreditCardPayment implements PaymentMethod{

	@Override
	public void payment(int amount) {
		 System.out.println("paid "+amount+" using credit card");
		
	}
	

}
