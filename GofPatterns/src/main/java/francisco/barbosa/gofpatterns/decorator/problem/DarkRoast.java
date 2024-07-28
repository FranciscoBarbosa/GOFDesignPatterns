package francisco.barbosa.gofpatterns.decorator.problem;

public class DarkRoast extends Beverage{

    @Override
    public double cost() {
        return 0.99+super.cost();
    }
}
