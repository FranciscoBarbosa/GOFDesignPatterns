package francisco.barbosa.gofpatterns.factory.problem;

public class PizzaStore {
    
    public Pizza orderPizza(String type){
        Pizza pizza = null;

        switch (type) {
            case "cheese" -> pizza = new CheesePizza();
            case "greek" -> pizza = new GreekPizza();
            case "pepperoni" -> pizza = new PepperoniPizza();
            case "clam" -> pizza = new ClamPizza();
            case "veggie" -> pizza = new VeggiePizza();
            default -> new CheesePizza();
        }

        assert pizza != null;
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        
        return pizza;
    }
}
