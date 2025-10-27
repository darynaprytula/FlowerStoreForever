package lab.model;

import java.util.ArrayList;
import java.util.List;
import lombok.Data;

@Data
public class FlowerBucket {
    private List<FlowerPack> flowerPacks = new ArrayList<>();

    public double getPrice() {
        double totalPrice = 0.0;
        for (FlowerPack pack : flowerPacks) {
            totalPrice += pack.getPrice();
        }
        return totalPrice;
    }

    public void add(FlowerPack flowerPack) {
        flowerPacks.add(flowerPack);
    }
}
