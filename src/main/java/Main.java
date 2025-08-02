import model.Apple;
import model.Food;
import model.constants.Colour;
import model.constants.Unit;
import service.ShoppingCart;

public class Main {
    public static void main(String[] args) {
        Food redApple = new Apple(10, 120, "Красные яблоки", Colour.RED, Unit.KG);
        Food greenApple = new Apple(5, 100, "Зеленые яблоки", Colour.GREEN, Unit.KG);

        Food[] food = {redApple, greenApple};
        ShoppingCart cart = new ShoppingCart(food);
        cart.printReceipt();
    }
}