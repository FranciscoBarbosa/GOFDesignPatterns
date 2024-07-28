package francisco.barbosa.gofpatterns.decorator.problem;

public class HouseBlend extends Beverage{

    @Override
    public double cost() {
        return 0.89+super.cost();
    }
}
