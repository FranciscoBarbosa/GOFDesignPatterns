package francisco.barbosa.gofpatterns.strategy.solution;

import francisco.barbosa.gofpatterns.strategy.solution.behaviors.FlyBehavior;
import francisco.barbosa.gofpatterns.strategy.solution.behaviors.QuackBehavior;
import lombok.Getter;

@Getter
public class Duck {
    private FlyBehavior flyBehavior;
    private QuackBehavior quackBehavior;

    public Duck(FlyBehavior flyBehavior, QuackBehavior quackBehavior){
        this.flyBehavior=flyBehavior;
        this.quackBehavior=quackBehavior;
    }

    public void fly(){
        flyBehavior.fly();
    }

    public void quack(){
        quackBehavior.quack();
    }
}
