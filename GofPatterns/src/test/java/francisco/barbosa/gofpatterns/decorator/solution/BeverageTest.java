package francisco.barbosa.gofpatterns.decorator.solution;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BeverageTest {

    @Test
    void shouldCalculateDoubleMochaSoyLatteWithWhip(){
        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Soy(beverage2);
        beverage2 = new Whip(beverage2);

        double totalCost = beverage2.cost();
        String totalCostStr = String.format("%.2f", totalCost);
        String expectedCost = String.format("%.2f", 0.99+0.2*2+0.15+0.1);

        Assertions.assertEquals(totalCostStr, expectedCost);
    }

}