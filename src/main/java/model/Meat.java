package model;

public class Meat extends Food {
    public Meat(int amount, double price, String name, String currency, String unit) {
        super(amount, price, name, currency, unit, false);
    }

    @Override
    public double getDiscount() {
        return 0;
    }
}