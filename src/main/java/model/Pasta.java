package model;

import model.constants.Discount;
import model.constants.Shape;

public class Pasta extends Food {
    private final String shape;

    public Pasta(int amount, double price, String name, String unit, boolean isVegetarian, String shape) {
        super(amount, price, name, unit, isVegetarian);
        this.shape = shape;
    }

    @Override
    public double getDiscount() {
        switch (shape) {
            case Shape.LONG:
                return Discount.SHAPE_LONG;
            case Shape.SHORT:
                return Discount.SHAPE_SHORT;
            case Shape.CIRCLE:
                return Discount.SHAPE_CIRCLE;
        }

        return 0;
    }
}
