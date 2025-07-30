package cohesion;

// A simple Order class for demonstration
class Order {
    int orderId;
    String item;
    int quantity;
    double price;

    public Order(int orderId, String item, int quantity, double price) {
        this.orderId = orderId;
        this.item = item;
        this.quantity = quantity;
        this.price = price;
    }
}

// High Cohesion Example
public class HighCohesion {

    public void processOrder(Order order) {
        validateOrder(order);
        prepareOrder(order);
        saveToDatabaseHistory(order);
    }

    private void validateOrder(Order order) {
        if (order.quantity <= 0 || order.price <= 0) {
            System.out.println("Invalid order. Quantity and price must be greater than zero.");
        } else {
            System.out.println("Order validated successfully.");
        }
    }

    private void prepareOrder(Order order) {
        double total = calculateTotal(order);
        System.out.println("Order prepared. Total amount: ₹" + total);
    }

    private double calculateTotal(Order order) {
        return order.quantity * order.price;
    }

    private void saveToDatabaseHistory(Order order) {
        System.out.println("Order saved to database. Order ID: " + order.orderId);
    }

    // Main method
    public static void main(String[] args) {
        Order order = new Order(101, "Notebook", 3, 120.50);
        HighCohesion processor = new HighCohesion();
        processor.processOrder(order);
    }
}
