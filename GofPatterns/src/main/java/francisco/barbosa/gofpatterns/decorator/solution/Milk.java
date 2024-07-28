package francisco.barbosa.gofpatterns.decorator.solution;

public class Milk extends BeverageDecorator{
    private final Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return 0.1+ beverage.cost();
    }

    @Override
    public String getDescription() {
        return description = beverage.getDescription() + " with Milk";
    }


}
