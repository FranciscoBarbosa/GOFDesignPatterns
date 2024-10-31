package francisco.barbosa.gofpatterns.factory.solutions.abstractFactoryMethod.pizzaStore;

import francisco.barbosa.gofpatterns.factory.solutions.abstractFactoryMethod.pizza.NyStyleCheesePizza;
import francisco.barbosa.gofpatterns.factory.solutions.abstractFactoryMethod.pizza.NyStylePepperoniPizza;
import francisco.barbosa.gofpatterns.factory.solutions.abstractFactoryMethod.pizza.Pizza;

class NyPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        if(type == "cheese"){
            pizza = new NyStyleCheesePizza();
        }
        if(type == "pepperoni"){
            pizza = new NyStylePepperoniPizza();
        }
        return pizza;
    }
}
