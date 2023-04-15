import java.util.ArrayList;
import java.util.List;

public class CoffeeMachine {
    List<Coffee> list = new ArrayList<>();

    public int getAmount() {
        return amount;
    }

    private int amount = 0;

    public CoffeeMachine addCoffee(Coffee coffee) {
        list.add(coffee);
        return this;
    }

    public List<Coffee> getList() {
        return list;
    }

    public Coffee findDrink(String string) {
        for (int i = 0; i < getList().size(); i++) {
            if (getList().get(i).getName().equals(string)) {
                return getList().get(i);
            }
        }
        return null;
    }

    public Coffee sellDrink(Coffee drink) {
        try {
            Coffee findDrink = findDrink(drink.getName());
            getList().remove(findDrink);
            amount += findDrink.getPrice();
            return findDrink;
        } catch (Exception e) {
            throw new RuntimeException("Напиток не найден");
        }

    }
}
