package francisco.barbosa.gofpatterns.factory.solutions.abstractFactory.pizza;

import francisco.barbosa.gofpatterns.factory.solutions.abstractFactory.ingredients.Cheese;
import francisco.barbosa.gofpatterns.factory.solutions.abstractFactory.ingredients.Clams;
import francisco.barbosa.gofpatterns.factory.solutions.abstractFactory.ingredients.Dough;
import francisco.barbosa.gofpatterns.factory.solutions.abstractFactory.ingredients.Pepperoni;
import francisco.barbosa.gofpatterns.factory.solutions.abstractFactory.ingredients.Sauce;
import francisco.barbosa.gofpatterns.factory.solutions.abstractFactory.ingredients.Veggies;

import java.util.ArrayList;


public abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;
    Veggies veggies[];
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clam;
    ArrayList<String> toppings = new ArrayList<>();

    abstract void prepare();
    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }
    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }
    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }
    public String getName() {
        return name;
    }
}
