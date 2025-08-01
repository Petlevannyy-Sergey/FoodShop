package service;

import model.Food;
import model.constants.Currency;

public class ShoppingCart {
    private final Food[] food;

    public ShoppingCart(Food[] food) {
        this.food = food;
    }

    public double getTotalPriceWithOutDiscount() {
        double result = 0;
        for (Food item : food) {
            result += item.getPrice() * item.getAmount();
        }
        return result;
    }

    public double getTotalPriceWithDiscount() {
        double result = 0;
        for (Food item : food) {
            result += item.getPrice() * item.getAmount() * (100 - item.getDiscount()) / 100;
        }
        return result;
    }

    public double getTotalPriceWithOutDiscountVegetarian() {
        double result = 0;
        for (Food item : food) {
            if (item.isVegetarian()) {
                result += item.getPrice() * item.getAmount();
            }
        }
        return result;
    }

    public void printReceipt() {
        for (Food item : food) {
            System.out.printf("%s: %d %s х %.2f %s = %.2f %s\n",
                    item.getName(),
                    item.getAmount(),
                    item.getUnit(),
                    item.getPrice(),
                    item.getCurrency(),
                    item.getAmount() * item.getPrice(),
                    item.getCurrency());

            if (item.getDiscount() > 0) {
                System.out.printf("Скидка: %.2f %s\n",
                        item.getAmount() * item.getPrice() * (100 - item.getDiscount()) / 100,
                        item.getCurrency());
            }

            System.out.println("----------");
        }

        System.out.printf("Стоимость без скидки: %.2f %s\n",
                getTotalPriceWithOutDiscount(), Currency.RUB);

        System.out.printf("Итого: %.2f %s\n",getTotalPriceWithDiscount(), Currency.RUB);
    }
}
