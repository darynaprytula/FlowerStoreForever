package lab.model;

import java.util.ArrayList;
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
        this.items = new ArrayList<>();
    }

    public double getOrderFinalPrice() {
        double finalPrice = items.stream().mapToDouble(Item::getPrice).sum();
        finalPrice += delivery.deliver(finalPrice);
        return finalPrice;
    }
}
