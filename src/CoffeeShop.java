import java.text.DecimalFormat;

public class CoffeeShop {
    public static void main(String[] args) {
        Coffee simpleCoffee = new SimpleCoffee(); // Create a simple coffee object.

        // Create decorated coffee objects with milk and sugar.
        Coffee milkCoffee = new MilkDecorator(simpleCoffee);
        Coffee milkSugarCoffee = new SugarDecorator(milkCoffee);

        DecimalFormat df = new DecimalFormat("#.##");

        // Print the cost of different coffee variations.
        System.out.println("Simple Coffee: $" + df.format(simpleCoffee.cost()));
        System.out.println("Coffee with Milk: $" + df.format(milkCoffee.cost()));
        System.out.println("Coffee with Milk and Sugar: $" + df.format(milkSugarCoffee.cost()));
    }
}