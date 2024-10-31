package francisco.barbosa.gofpatterns.factory.solutions.simpleFactory;

public class SimplePizzaFactory {

    Pizza createPizza(String type){
        Pizza pizza = null;
        switch (type) {
            case "cheese" -> pizza = new CheesePizza();
            case "greek" -> pizza = new GreekPizza();
            case "pepperoni" -> pizza = new PepperoniPizza();
            case "clam" -> pizza = new ClamPizza();
            case "veggie" -> pizza = new VeggiePizza();
            default -> new CheesePizza();
        }
        return pizza;
    }
}
