import model.*;
import model.constants.Colour;
import model.constants.Currency;
import model.constants.Shape;
import model.constants.Unit;
import service.ShoppingCart;

public class Main {
    public static void main(String[] args) {

        ShoppingCart cart = getShoppingCart();
        cart.printReceipt();
        System.out.printf("Общая сумма товаров без скидки: %.2f %s\n", cart.getTotalPriceWithOutDiscount(), Currency.RUB);
        System.out.printf("Общая сумма товаров со скидкой: %.2f %s\n", cart.getTotalPriceWithDiscount(), Currency.RUB);
        System.out.printf("Общая сумма вегетарианских продуктов без скидки: %.2f %s\n", cart.getTotalPriceWithOutDiscountVegetarian(), Currency.RUB);
    }

    private static ShoppingCart getShoppingCart() {
        Food redApple = new Apple(1, 120, "Красные яблоки", Colour.RED, Unit.KG);
        Food greenApple = new Apple(1, 100, "Зеленые яблоки", Colour.GREEN, Unit.KG);
        Food redFish = new Fish(1, 325, "Лосось", Unit.KG, true);
        Food fish = new Fish(1, 80, "Братская могила в томатном соусе", Unit.TIN, false);
        Food milk1 = new Milk(1, 120, "Домик на хуторе близ Гоголя", Unit.PACKAGING, 2.5);
        Food milk2 = new Milk(1, 130, "Домик на хуторе близ Гоголя", Unit.PACKAGING, 3.2);
        Food meat = new Meat(1, 1000, "Лапка \"Демона\"", Unit.KG);
        Food mushroom = new Mushroom(1, 2, "Шампиньон", Unit.PIECE);
        Food pasta1 = new Pasta(1, 46, "Long", Unit.PACKAGING, true, Shape.LONG);
        Food pasta2 = new Pasta(1, 47, "Short", Unit.PACKAGING, true, Shape.SHORT);
        Food pasta3 = new Pasta(1, 48, "Circle", Unit.PACKAGING, true, Shape.CIRCLE);
        Food[] food = {redApple, greenApple, redFish, fish, milk1, milk2, meat, mushroom, pasta1, pasta2, pasta3};
        return new ShoppingCart(food);
    }
}