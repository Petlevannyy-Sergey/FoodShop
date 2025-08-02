package model;

import model.constants.Discount;

public class Milk extends Food {
    private final double fat;

    public Milk(int amount, double price, String name, String unit, double fat) {
        super(amount, price, name, unit, false);
        this.fat = fat;
    }

    @Override
    public double getDiscount() {
        return fat < 3 ? Discount.MILK : 0;
    }
}