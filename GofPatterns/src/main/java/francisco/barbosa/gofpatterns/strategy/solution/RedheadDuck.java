package francisco.barbosa.gofpatterns.strategy.solution;

import francisco.barbosa.gofpatterns.strategy.solution.behaviors.FlyBehavior;
import francisco.barbosa.gofpatterns.strategy.solution.behaviors.QuackBehavior;

public class RedheadDuck extends Duck{
    public RedheadDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        super(flyBehavior, quackBehavior);
    }

    public void display(){
        System.out.println("I'm a RedHead Duck");
    }

}
