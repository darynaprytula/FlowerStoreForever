package lab.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lab.delivery.DHLDeliveryStrategy;
import lab.delivery.Delivery;
import lab.delivery.PostDeliveryStrategy;

@RestController
@RequestMapping("/delivery")
public class DeliveryController {

    private final Delivery dhlDelivery = new DHLDeliveryStrategy();
    private final Delivery postDelivery = new PostDeliveryStrategy();

    @GetMapping("/dhl-delivery")
    public double getDhlDelivery(@RequestParam double orderPrice) {
        return dhlDelivery.deliver(orderPrice);
    }

    @GetMapping("/post-delivery")
    public double getPostDelivery(@RequestParam double orderPrice) {
        return postDelivery.deliver(orderPrice);
    }
}
