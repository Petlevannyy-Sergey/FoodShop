package model;

import model.constants.Colour;
import model.constants.Discount;

public class Apple extends Food {
    protected final String colour;

    public Apple(int amount, double price, String name, String currency, String colour, String unit) {
        super(amount, price, name, currency, unit, true);
        this.colour = colour;
    }

    @Override
    public double getDiscount() {
        return  colour.equals(Colour.RED) ?
                Discount.RED_APPLE :
                Discount.NO ;
    }
}
