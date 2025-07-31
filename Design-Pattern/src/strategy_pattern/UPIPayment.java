package strategy_pattern;

public class UPIPayment implements PaymentMethod {

	@Override
	public void payment(int amount) {
		 System.out.println("Paid "+amount+" using UPI");
		
	}
	

}
