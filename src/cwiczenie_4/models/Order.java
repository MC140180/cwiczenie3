package cwiczenie_4.models;

import cwiczenie_4.interfaces.IOrder;

import java.util.ArrayList;
import java.util.HashMap;

public class Order implements IOrder {
    private final ArrayList<Product> products;
    private final Client client;
    private  ArrayList<Product> gifts;
    private final double transportPrice;
    private double cost;

    public ArrayList<Product> getProducts() {
        return products;
    }

    public Order(Client client, ArrayList<Product> products) {
        this.client = client;
        this.products = products;
        this.gifts = new ArrayList<>();
        this.cost = 0.0;
        this.transportPrice = 13.0;
    }
    @Override
    public double getCost() {
        this.cost = 0;
        this.products.forEach(product -> {
            this.cost += product.getPrice();
        });

        return this.cost + this.transportPrice;
    }

    @Override
    public ArrayList<Product> getGifts() {
        return this.gifts;
    }

    @Override
    public HashMap<String, Object> getOrderInformation() {
        HashMap<String, Object> orderInfo = new HashMap<String, Object>();
        orderInfo.put("Gifts: ", this.gifts);
        orderInfo.put("Products: ", this.products);
        orderInfo.put("Total price: ", this.getCost() );
        return orderInfo;
    }

    @Override
    public Order getOrder() {
        return this;
    }
}
