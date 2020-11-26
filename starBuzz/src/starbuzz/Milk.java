package starbuzz;

public class Milk extends CondimentDecorator {

    Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }

    public double cost() {
        if (beverage.getSize() == "Pequeno") { 
            return .05 + beverage.cost();
        } else if (beverage.getSize() == "Medio" || beverage.getSize() == "") {
            return .10 + beverage.cost();
        } else if(beverage.getSize() == "Grande") {
            return .25 + beverage.cost();
        }else{
            return .10 + beverage.cost();
        }
    }
}
