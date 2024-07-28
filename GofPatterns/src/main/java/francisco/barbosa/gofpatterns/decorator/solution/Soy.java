package francisco.barbosa.gofpatterns.decorator.solution;

public class Soy extends BeverageDecorator{
    private final Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return 0.15+ beverage.cost();
    }

    @Override
    public String getDescription() {
        return description = beverage.getDescription() + " with Soy";
    }

}
