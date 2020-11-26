package starbuzz;

public class Mocha extends CondimentDecorator {

    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    public double cost() {

        if (beverage.getSize() == "Pequeno") {    
            return .15 + beverage.cost();
        } else if (beverage.getSize() == "Medio" || beverage.getSize() == "") {
            return .20 + beverage.cost();
        } else if(beverage.getSize() == "Grande")  {
            return .25 + beverage.cost();
        }else{
            return .20 + beverage.cost();
        }

    }
}
