public class Main {
    public static void main(String[] args) {
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        coffeeMachine.addCoffee(new Coffee("cappuccino", 50, "warm", 120))
                .addCoffee(new Coffee("Latte", 80, "hot", 130))
                .addCoffee(new Coffee("Espresso", 100, "cold", 150))
                .addCoffee(new Juice("lemonade", 100, "cold", 98, "strawberry"))
                .addCoffee(new Juice("Juice", 100, "cold", 120, "orange "));

        System.out.println("Наш список напитков:");
        for (int i = 0; i < coffeeMachine.getList().size(); i++) {
            System.out.println(coffeeMachine.getList().get(i));
        }
        System.out.println();
        System.out.println("Нашли напиток, который хотим купить: ");

        Coffee found = coffeeMachine.findDrink("Espresso");
        System.out.println(found);

        System.out.println("Напиток, который продали:  ");
        Coffee sold = coffeeMachine.sellDrink(found);
        System.out.println(sold);
        System.out.println("Количество денег, которое получили:  ");
        System.out.println(coffeeMachine.getAmount());
        System.out.println("Список оставшихся напитков:  ");
        for (int i = 0; i < coffeeMachine.getList().size(); i++) {
            System.out.println(coffeeMachine.getList().get(i));
        }

        try {
            Coffee nonExistentDrink = coffeeMachine.sellDrink(coffeeMachine.findDrink("milkshake"));
            System.out.println(nonExistentDrink);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }


    }
}