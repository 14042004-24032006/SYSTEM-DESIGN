package strategy_pattern;

public class ShoppingCard {
	
	private PaymentMethod paymentMethod;
	
	public void setPaymentMethod(PaymentMethod paymentMethod)
	{
		this.paymentMethod=paymentMethod;
	}
	
	public void checkout(int amount)
	{
		if(paymentMethod==null)
		{
			System.out.println("Payment method is not selected");
		}
		else {
			{
				paymentMethod.payment(amount);
			}
		}
	}

}
