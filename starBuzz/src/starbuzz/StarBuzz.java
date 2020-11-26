package starbuzz;

public class StarBuzz {

    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        beverage.setSize("Pequeno");
        beverage = new Soy(beverage);
        beverage = new Mocha(beverage);
        beverage = new Whip(beverage);
        beverage = new Milk(beverage);
        System.out.printf(beverage.getDescription()
                + " $" + "%.2f\n", beverage.cost());

        Beverage beverage2 = new Espresso();
        beverage2.setSize("Medio");
        beverage2 = new Soy(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        beverage2 = new Milk(beverage2);

        System.out.printf(beverage2.getDescription()
                + " $" + "%.2f\n", beverage2.cost());

        Beverage beverage3 = new Espresso();
        beverage3.setSize("Grande");
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        beverage3 = new Milk(beverage3);

        System.out.printf(beverage3.getDescription()
                + " $" + "%.2f\n", beverage3.cost());

        Beverage beverage4 = new Decaf();
        beverage4.setSize("Pequeno");
        beverage4 = new Soy(beverage4);
        beverage4 = new Mocha(beverage4);
        beverage4 = new Whip(beverage4);
        beverage4 = new Milk(beverage4);

        System.out.printf(beverage4.getDescription()
                + " $" + "%.2f\n", beverage4.cost());

        Beverage beverage5 = new DarkRoast();
        beverage5.setSize("Medio");
        beverage5 = new Soy(beverage5);
        beverage5 = new Mocha(beverage5);
        beverage5 = new Whip(beverage5);
        beverage5 = new Milk(beverage5);

        System.out.printf(beverage5.getDescription()
                + " $" + "%.2f\n", beverage5.cost());

        Beverage beverage6 = new HouseBlend();
        beverage6.setSize("Grande");
        beverage6 = new Soy(beverage6);
        beverage6 = new Mocha(beverage6);
        beverage6 = new Whip(beverage6);
        beverage6 = new Milk(beverage6);

        System.out.printf(beverage6.getDescription()
                + " $" + "%.2f\n", beverage6.cost());

    }

}
