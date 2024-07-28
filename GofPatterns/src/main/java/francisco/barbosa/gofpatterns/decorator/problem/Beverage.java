package francisco.barbosa.gofpatterns.decorator.problem;

public abstract class Beverage {
    String description;
    boolean milk;
    boolean soy;
    boolean mocha;
    boolean whip;

    Beverage() {
        this.milk = false;
        this.soy = false;
        this.mocha = false;
        this.whip = false;
    }

    public String getDescription() {
        return description;
    }
    public double cost(){
        double cost = 0;
        if(hasMilk()){
            cost += 0.5;
        }
        if(hasSoy()){
            cost += 0.6;
        }
        if(hasMocha()){
            cost += 0.7;
        }
        if(hasWhip()){
            cost += 0.8;
        }
        return cost;
    }

    public boolean hasMilk(){
        return this.milk;
    }
    public void setMilk(){
        this.milk = true;
    }

    public boolean hasSoy(){
        return this.soy;
    }
    public void setSoy(){
        this.soy = true;
    }

    public boolean hasMocha(){
        return this.mocha;
    }
    public void setMocha(){
        this.mocha = true;
    }

    public boolean hasWhip(){
        return this.whip;
    }
    public void setWhip(){
        this.whip = true;
    }

}
