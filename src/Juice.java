public class Juice extends Coffee{
    private String taste;

    public Juice(String name, Integer size, String temperature, Integer price, String taste) {
        super(name, size, temperature, price);
        this.taste = taste;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + taste;
    }
}
