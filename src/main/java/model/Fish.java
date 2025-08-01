package model;

import model.constants.Discount;

public class Fish extends Food {
    private final boolean isRed;

    public Fish(int amount, double price, String name, String unit, boolean isRed) {
        super(amount, price, name, unit, false);
        this.isRed = isRed;
    }

    @Override
    public double getDiscount() {
        return isRed ? 0 : Discount.FISH;
    }
}