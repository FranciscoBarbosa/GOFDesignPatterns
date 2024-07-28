package francisco.barbosa.gofpatterns.decorator.problem;

public class Decaf extends Beverage{

    @Override
    public double cost() {
        return 1.05+super.cost();
    }
}
