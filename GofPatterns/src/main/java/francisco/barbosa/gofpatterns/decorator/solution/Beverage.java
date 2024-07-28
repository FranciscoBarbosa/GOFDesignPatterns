package francisco.barbosa.gofpatterns.decorator.solution;

public abstract class Beverage {
    String description = "Unknown Beverage";

    protected Beverage() {
    }

    public String getDescription() {
        return description;
    }
    public abstract double cost();
}
