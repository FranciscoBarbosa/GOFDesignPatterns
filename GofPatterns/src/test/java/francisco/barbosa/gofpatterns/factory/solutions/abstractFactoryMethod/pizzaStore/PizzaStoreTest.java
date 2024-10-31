package francisco.barbosa.gofpatterns.factory.solutions.abstractFactoryMethod.pizzaStore;

import francisco.barbosa.gofpatterns.factory.solutions.abstractFactoryMethod.pizza.Pizza;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class PizzaStoreTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    void orderCheesePizza() {
        PizzaStore pizzaStore = new NyPizzaStore();
        Pizza pizza = pizzaStore.orderPizza("cheese");

        Assertions.assertThat(pizza.getName()).isEqualTo("NY Style Sauce and Cheese Pizza");
    }

    @Test
    void orderPepperoniPizza() {
        PizzaStore pizzaStore = new ChicagoPizzaStore();
        Pizza pizza = pizzaStore.orderPizza("pepperoni");

        Assertions.assertThat(pizza.getName()).isEqualTo("Chicago Style Pepperoni Pizza");
    }

}