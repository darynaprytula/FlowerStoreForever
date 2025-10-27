package lab.model;

import lombok.Data;

@Data
public class Item {
    private FlowerBucket flowerBucket;

    double getPrice() {
        return flowerBucket.getPrice();
    }
}