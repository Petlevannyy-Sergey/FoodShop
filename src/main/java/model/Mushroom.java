package model;

public class Mushroom extends Food {
    public Mushroom(int amount, double price, String name, String unit) {
        super(amount, price, name, unit, true);
    }

    @Override
    public double getDiscount() {
        return 0;
    }
}
