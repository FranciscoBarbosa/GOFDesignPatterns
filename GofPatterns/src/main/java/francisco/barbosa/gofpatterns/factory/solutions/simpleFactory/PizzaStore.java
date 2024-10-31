package francisco.barbosa.gofpatterns.factory.solutions.simpleFactory;

public class PizzaStore {
    SimplePizzaFactory factory;

    PizzaStore(){
        factory = new SimplePizzaFactory();
    }

    public Pizza orderPizza(String type){
        Pizza pizza = factory.createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        
        return pizza;
    }
}
