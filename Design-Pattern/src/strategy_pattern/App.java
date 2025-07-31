package strategy_pattern;

public class App {
    public static void main(String[] args) {
        ShoppingCard cart = new ShoppingCard();
        cart.setPaymentMethod(new CreditCardPayment());
        cart.checkout(1000);

        cart.setPaymentMethod(new UPIPayment());
        cart.checkout(1000);

        cart.setPaymentMethod(new CashPayment());
        cart.checkout(1000);
    }
}