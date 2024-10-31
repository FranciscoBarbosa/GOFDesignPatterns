package francisco.barbosa.gofpatterns.factory.solutions.abstractFactory.pizzaStore;

import francisco.barbosa.gofpatterns.factory.solutions.abstractFactory.ingredients.Cheese;
import francisco.barbosa.gofpatterns.factory.solutions.abstractFactory.ingredients.Clams;
import francisco.barbosa.gofpatterns.factory.solutions.abstractFactory.ingredients.Dough;
import francisco.barbosa.gofpatterns.factory.solutions.abstractFactory.ingredients.Pepperoni;
import francisco.barbosa.gofpatterns.factory.solutions.abstractFactory.ingredients.Sauce;
import francisco.barbosa.gofpatterns.factory.solutions.abstractFactory.ingredients.Veggies;

public interface PizzaIngredientFactory {
    Dough createDough();

    Sauce createSauce();

    Cheese createCheese();

    Veggies[] createVeggies();

    Pepperoni createPepperoni();

    Clams createClams();
}
