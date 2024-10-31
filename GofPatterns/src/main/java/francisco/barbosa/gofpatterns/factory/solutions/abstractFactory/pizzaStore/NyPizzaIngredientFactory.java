package francisco.barbosa.gofpatterns.factory.solutions.abstractFactory.pizzaStore;

import francisco.barbosa.gofpatterns.factory.solutions.abstractFactory.ingredients.Cheese;
import francisco.barbosa.gofpatterns.factory.solutions.abstractFactory.ingredients.Clams;
import francisco.barbosa.gofpatterns.factory.solutions.abstractFactory.ingredients.Dough;
import francisco.barbosa.gofpatterns.factory.solutions.abstractFactory.ingredients.FreshClams;
import francisco.barbosa.gofpatterns.factory.solutions.abstractFactory.ingredients.Garlic;
import francisco.barbosa.gofpatterns.factory.solutions.abstractFactory.ingredients.MarinaraSauce;
import francisco.barbosa.gofpatterns.factory.solutions.abstractFactory.ingredients.Mushroom;
import francisco.barbosa.gofpatterns.factory.solutions.abstractFactory.ingredients.Onion;
import francisco.barbosa.gofpatterns.factory.solutions.abstractFactory.ingredients.Pepperoni;
import francisco.barbosa.gofpatterns.factory.solutions.abstractFactory.ingredients.RedPepper;
import francisco.barbosa.gofpatterns.factory.solutions.abstractFactory.ingredients.ReggianoCheese;
import francisco.barbosa.gofpatterns.factory.solutions.abstractFactory.ingredients.Sauce;
import francisco.barbosa.gofpatterns.factory.solutions.abstractFactory.ingredients.SlicedPepperoni;
import francisco.barbosa.gofpatterns.factory.solutions.abstractFactory.ingredients.ThinCrustDough;
import francisco.barbosa.gofpatterns.factory.solutions.abstractFactory.ingredients.Veggies;

class NyPizzaIngredientFactory implements PizzaIngredientFactory {

    public Dough createDough() {
        return new ThinCrustDough();
    }
    public Sauce createSauce() {
        return new MarinaraSauce();
    }
    public Cheese createCheese() {
        return new ReggianoCheese();
    }
    public Veggies[] createVeggies() {
        Veggies veggies[] = { new Garlic(), new Onion(), new Mushroom(), new RedPepper() };
        return veggies;
    }
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClams() {
        return new FreshClams();
    }

    public Clams createClam() {
        return new FreshClams();
    }
}
