package francisco.barbosa.gofpatterns.factory.solutions.abstractFactory.pizza;

import francisco.barbosa.gofpatterns.factory.solutions.abstractFactory.pizzaStore.PizzaIngredientFactory;

public class ClamPizza extends Pizza {
    PizzaIngredientFactory pizzaIngredientFactory;

    public ClamPizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    public void prepare() {
        dough = pizzaIngredientFactory.createDough();
        sauce = pizzaIngredientFactory.createSauce();
        cheese = pizzaIngredientFactory.createCheese();
        clam = pizzaIngredientFactory.createClams();
    }
}
