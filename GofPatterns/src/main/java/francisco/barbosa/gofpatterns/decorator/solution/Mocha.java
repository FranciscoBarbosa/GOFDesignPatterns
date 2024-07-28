package francisco.barbosa.gofpatterns.decorator.solution;

public class Mocha extends BeverageDecorator{
    private final Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return 0.2+ beverage.cost();
    }

    @Override
    public String getDescription() {
        return description = beverage.getDescription() + " with Mocha";
    }

}
