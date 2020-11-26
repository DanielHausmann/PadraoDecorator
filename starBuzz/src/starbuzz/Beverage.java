package starbuzz;

public abstract class Beverage {
    String description = "Bebida Desconhecida";
    static String Size = "";
    public String getDescription() {
        return description;
    }

    public String getSize() {
        return Size;
    }

    public void setSize(String Size) {
        this.Size = Size;
        this.description = this.description +", "+ Size;
    }
    
    
    public abstract double cost();
}
