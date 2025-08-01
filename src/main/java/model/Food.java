package model;

public abstract class Food implements Discountable {
    protected int amount;
    protected double price;
    protected boolean isVegetarian;
    protected String name;
    protected String currency;
    protected String unit;

    public Food(int amount, double price, String name, String currency, String unit, boolean isVegetarian) {
        this.amount = amount;
        this.price = price;
        this.name = name;
        this.currency = currency;
        this.unit = unit;
        this.isVegetarian = isVegetarian;
    }

    protected Food() {
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

    public String getCurrency() {

        return currency;
    }

    public String getUnit() {
        return unit;
    }

    @Override
    public abstract double getDiscount();
}
