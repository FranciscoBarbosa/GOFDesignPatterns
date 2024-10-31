package francisco.barbosa.gofpatterns.factory.solutions.abstractFactory.pizzaStore;


import francisco.barbosa.gofpatterns.factory.solutions.abstractFactory.pizza.Pizza;

public abstract class PizzaStore {
    
    public Pizza orderPizza(String type){
        Pizza pizza = createPizza(type);

        pizza.bake();
        pizza.cut();
        pizza.box();
        
        return pizza;
    }

    protected abstract Pizza createPizza(String type);
}
