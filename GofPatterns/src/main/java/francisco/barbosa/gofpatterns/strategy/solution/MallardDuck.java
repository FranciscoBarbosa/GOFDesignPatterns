package francisco.barbosa.gofpatterns.strategy.solution;

import francisco.barbosa.gofpatterns.strategy.solution.behaviors.FlyBehavior;
import francisco.barbosa.gofpatterns.strategy.solution.behaviors.QuackBehavior;

public class MallardDuck extends Duck {
    public MallardDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        super(flyBehavior, quackBehavior);
    }

    public void display(){
        System.out.println("I'm a Mallard Duck");
    }
}
