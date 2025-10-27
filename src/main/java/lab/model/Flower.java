package lab.model;

import lombok.Getter;
import lombok.Setter;

@Setter
public class Flower {
    @Getter
    private double sepalLength;
    private FlowerColor color;
    @Getter
    private double price;
    @Getter
    private FlowerType flowerType;

    public String getColor() {
        return color.toString();
    }

    public void setPrice(double cost) {
        if (cost < 0) {
            throw new IllegalArgumentException("flower price can't be negative");
        }
        price = cost;
    }

    public void setSepalLength(double sepalLen) {
        if (sepalLen < 0) {
            throw new IllegalArgumentException("sepal length can't be negative");
        }
        sepalLength = sepalLen;
    }
}
