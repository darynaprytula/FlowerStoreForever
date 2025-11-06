package lab.model.decorators;

import lab.model.Item;

public class PaperDecorator extends ItemDecorator {
    private static final int ADDITIONAL_PRICE = 13;

    public PaperDecorator(Item item) {
        super(item);
    }

    @Override
    public double getPrice() {
        return ADDITIONAL_PRICE + item.getPrice();
    }

    @Override
    public String getDescription() {
        return item.getDescription() + " wrapped in paper decorator";
    }
}
