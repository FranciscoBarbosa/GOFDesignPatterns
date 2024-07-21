package francisco.barbosa.gofpatterns.strategy.problem;

public class RubberDuck extends Duck{
    public void quack() { //override and change behavior to squeak
        System.out.println("squeak");
    }
    public void display() {
        System.out.println("I'm a RubberDuck");
    }

    public void fly(){ //this duck can't fly, override to do nothing

    }
}
