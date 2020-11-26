package starbuzz;

public class Whip extends CondimentDecorator {

    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    public double cost() {
        if (beverage.getSize() == "Pequeno") {
            return .05 + beverage.cost();
        } else if (beverage.getSize() == "Medio" || beverage.getSize() == "") {
            return .10 + beverage.cost();
        } else if(beverage.getSize() == "Grande")  {
            return .15 + beverage.cost();
        }else{
            return .10 + beverage.cost();
        }
    }
}
