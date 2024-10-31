package francisco.barbosa.gofpatterns.factory.solutions.abstractFactoryMethod.pizzaStore;

import francisco.barbosa.gofpatterns.factory.solutions.abstractFactoryMethod.pizza.ChicagoStyleCheesePizza;
import francisco.barbosa.gofpatterns.factory.solutions.abstractFactoryMethod.pizza.ChicagoStylePepperoniPizza;
import francisco.barbosa.gofpatterns.factory.solutions.abstractFactoryMethod.pizza.Pizza;

class ChicagoPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        if(type == "cheese"){
            pizza = new ChicagoStyleCheesePizza();
        }
        if(type == "pepperoni"){
            pizza = new ChicagoStylePepperoniPizza();
        }
        return pizza;
    }
}
