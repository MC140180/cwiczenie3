package cwiczenie_4.models;

public class Product {
    private double price;
    private String name;

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public Product(String name, double price){
        this.price = price;
        this.name = name;
    }
}
