package starbuzz;

public class Soy extends CondimentDecorator{
    Beverage beverage;
    
    public Soy(Beverage beverage){
        this.beverage = beverage;
    }
    
    public String getDescription(){
        return beverage.getDescription() + ", Soy";
    }
    
    public double cost(){
        
        if(beverage.getSize()=="Pequeno"){
            return .10 +beverage.cost();
        }else if(beverage.getSize()=="Medio"||beverage.getSize()==""){
            return .15 +beverage.cost();
        }else if(beverage.getSize() == "Grande") {
            return .20 +beverage.cost();
        }else{
            return .15 + beverage.cost();
        }
        
    }
}
