package model;

public class Mushroom extends Food {
    public Mushroom(int amount, double price, String name, String currency, String unit) {
        super(amount, price, name, currency, unit, true);
    }

    @Override
    public double getDiscount() {
        return 0;
    }
}
