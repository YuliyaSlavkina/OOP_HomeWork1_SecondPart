public class Coffee {
    public Coffee(String name, Integer size, String temperature, Integer price) {
        this.name = name;
        this.size = size;
        this.temperature = temperature;
        this.price = price;

    }

    public String getName() {
        return name;
    }

    public Integer getSize() {
        return size;
    }

    public Integer getPrice() {
        return price;
    }

    private String name;
    private Integer size;

    public void setPrice(Integer price) {
        this.price = price;
    }


    private Integer price;

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getTemperature() {
        return temperature;
    }

    private String temperature;

    @Override
    public String toString() {
        return String.format("%s, %d, %s, %d", name, size, temperature, price);
    }
}
