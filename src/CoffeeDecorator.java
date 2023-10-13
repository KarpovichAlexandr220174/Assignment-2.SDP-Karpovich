// Decorator
abstract class CoffeeDecorator implements Coffee {
    private final Coffee decoratedCoffee;

    public CoffeeDecorator(Coffee coffee) {
        this.decoratedCoffee = coffee; // The decorator maintains a reference to the decorated coffee.
    }

    @Override
    public double cost() {
        return decoratedCoffee.cost(); // By default, it delegates the cost calculation to the decorated coffee.
    }
}