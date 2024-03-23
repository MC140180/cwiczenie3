package cwiczenie_4.models;

public class Product {
    private final double price;
    private final String name;

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public Product(String name, double price) {
        this.price = price;
        this.name = name;
    }
}
