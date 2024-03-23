package cwiczenie_4.models;

import cwiczenie_4.interfaces.IGiftAssigner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import java.util.stream.Collectors;

public class Order implements IGiftAssigner  {
    private final ArrayList<Product> products;
    private Double cost;



    private final Client client;
    private ArrayList<Product> gifts;
    private Boolean submitted;
    private double transportPrice;

    public Order(Client client, ArrayList<Product> products) {
        this.client = client;
        this.products = products;
        this.gifts = new ArrayList<>();
        this.cost = 0.0;
        this.transportPrice = 13.0;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public Client getClient() {
        return client;
    }

    @Override
    public void assignGift(Product gift) {
        this.gifts.add(gift);
    }

    public void submitOrder() {
        this.submitted = true;
    }
    public Double getTotalCost(){
       return this.calculateOrder();
    }

    public HashMap<String, Object> getTotalInfo() {
        HashMap<String, Object> totalOrderInfo = new HashMap<>();
        totalOrderInfo.put("Products:", this.products.stream().map(Product::getName).collect(Collectors.toList()));
        totalOrderInfo.put("Gifts:", this.gifts.stream().map(Product::getName).collect(Collectors.toList()));
        totalOrderInfo.put("Total price:", this.getTotalCost()); // here is double
        return totalOrderInfo;
    }

    private double calculateOrder(){
        this.cost = 0.0;
        for(Product product: this.products) {
            this.cost += product.getPrice();
        }
        for(Product product: this.gifts) {
            this.cost += product.getPrice();
        }
        return (this.cost > 0 ? this.cost : 0) + this.transportPrice;
    }
    @Override
    public Order getOrder() {
        return this;
    }
}
