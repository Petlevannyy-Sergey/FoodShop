package model;

public abstract class Food implements Discountable {
    protected int amount;
    protected double price;
    protected boolean isVegetarian;
    protected String name;
    protected String currency;
    protected String unit;

    public Food(int amount, double price, String name, String unit, boolean isVegetarian) {
        this.amount = amount;
        this.price = price;
        this.name = name;
        this.unit = unit;
        this.isVegetarian = isVegetarian;
    }

    public int getAmount() {

        return amount;
    }

    public double getPrice() {

        return price;
    }

    public boolean isVegetarian() {

        return isVegetarian;
    }

    public String getName() {

        return name;
    }

    public String getUnit() {
        return unit;
    }

    @Override
    public abstract double getDiscount();
}
