package francisco.barbosa.gofpatterns.decorator.problem;

public class Espresso extends Beverage{

    @Override
    public double cost() {
        return 1.99+super.cost();
    }
}
