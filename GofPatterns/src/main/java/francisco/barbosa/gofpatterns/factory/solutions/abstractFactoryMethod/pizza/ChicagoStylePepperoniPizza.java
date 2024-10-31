package francisco.barbosa.gofpatterns.factory.solutions.abstractFactoryMethod.pizza;

public class ChicagoStylePepperoniPizza extends Pizza {
    public ChicagoStylePepperoniPizza(){
        name = "Chicago Style Pepperoni Pizza";
        dough = "thick crust dough";
        sauce = "Marinara sauce";

        toppings.add("Shredded Mozzarella Cheese");
    }
}
