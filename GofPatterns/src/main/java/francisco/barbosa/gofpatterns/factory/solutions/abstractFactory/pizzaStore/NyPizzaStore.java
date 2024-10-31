package francisco.barbosa.gofpatterns.factory.solutions.abstractFactory.pizzaStore;

import francisco.barbosa.gofpatterns.factory.solutions.abstractFactory.pizza.CheesePizza;
import francisco.barbosa.gofpatterns.factory.solutions.abstractFactory.pizza.ClamPizza;
import francisco.barbosa.gofpatterns.factory.solutions.abstractFactory.pizza.Pizza;

import java.util.Objects;

class NyPizzaStore extends PizzaStore {

    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NyPizzaIngredientFactory();
        if(Objects.equals(type, "cheese")){
            pizza = new CheesePizza(ingredientFactory);
        }
        if(Objects.equals(type, "pepperoni")){
            pizza = new ClamPizza(ingredientFactory);
        }
        return pizza;
    }
}
