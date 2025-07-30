package oops;

//run-time
public class Polymorphism {
    void processPayment() {
        System.out.println("Processing payment - Parent");
    }
    
    // Method Overloading (same method name, different parameters)
    void processPayment(String mode) {
        System.out.println("Processing payment using: " + mode);
    }

    void processPayment(String mode, double amount) {
        System.out.println("Processing " + amount + " via " + mode);
    }
}


class CreditCard extends Polymorphism {
    @Override
    void processPayment() {
        System.out.println("Processing payment using Credit Card");
    }
}


class BankTransfer extends Polymorphism {
    @Override
    void processPayment() {
        System.out.println("Processing payment using Bank Transfer");
    }
}
