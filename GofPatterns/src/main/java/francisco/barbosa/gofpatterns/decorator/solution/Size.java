package francisco.barbosa.gofpatterns.decorator.solution;

public enum Size{
    TALL(0.1),
    GRANDE(0.15),
    VENTI(0.2);

    public final double cost;
    private Size(double cost){
        this.cost = cost;
    }
};
