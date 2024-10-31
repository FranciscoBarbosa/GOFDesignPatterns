package francisco.barbosa.gofpatterns.factory.solutions.abstractFactoryMethod.pizza;

public class NyStylePepperoniPizza extends Pizza {
    public NyStylePepperoniPizza(){
        name = "NY Style Pepperoni Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";
        toppings.add("Grated Reggiano Cheese");
    }
}
