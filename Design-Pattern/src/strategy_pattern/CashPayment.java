package strategy_pattern;

public class CashPayment implements PaymentMethod{

	@Override
	public void payment(int amount) {
		System.out.println("user will pay "+amount+ " after delivery");
		
	}

}
