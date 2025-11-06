package lab.model;

import java.util.LinkedList;
import java.util.List;
import lab.delivery.Delivery;
import lab.payment.Payment;
import lombok.Data;

@Data
public class Order {
    private List<Item> items;
    private Delivery delivery;
    private Payment payment;

    public Order() {
        this.items = new LinkedList<>();
    }

    public void setPaymentStrategy(Payment payment) {
        this.payment = payment;
    }

    public void setDeliveryStrategy(Delivery delivery) {
        this.delivery = delivery;
    }

    public void addItem(Item item) {
        if (item != null) {
            items.add(item);
        }
    }

    public void removeItem(Item item) {
        items.remove(item);
    }

    public double calculateTotalPrice() {
        return items.stream()
                .mapToDouble(Item::getPrice)
                .sum();
    }

    public void processOrder() {
        if (payment == null || delivery == null) {
            System.out.println("Payment and delivery have not been set");
            return;
        }

        double subtotal = calculateTotalPrice();
        double deliveryCost = delivery.deliver(subtotal);
        double total = subtotal + deliveryCost;

        payment.pay(total);
    }
}
