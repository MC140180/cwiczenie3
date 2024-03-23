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
        this.calculateOrder();
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public Client getClient() {
        return client;
    }

    public ArrayList<Product> getGifts() {
        return gifts;
    }

    @Override
    public void assignGift(Product gift) {
        this.gifts.add(gift);
        this.calculateOrder();
    }

    public Boolean getSubmitted() {
        return submitted;
    }

    public void submitOrder() {
        this.submitted = true;
    }
    public Double getCost() {
        return cost ;
    }
    public Double getTotalCost(){
        return cost + this.transportPrice;
    }

    public HashMap<String, Object> getTotalInfo() {
        HashMap<String, Object> totalOrderInfo = new HashMap<>();
        totalOrderInfo.put("Products:", this.products.stream().map(Product::getName).collect(Collectors.toList()));
        totalOrderInfo.put("Gifts:", this.gifts.stream().map(Product::getName).collect(Collectors.toList()));
        totalOrderInfo.put("Total price:", this.getTotalCost()); // here is double
        return totalOrderInfo;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    private double calculateOrder(){
        for(Product product: this.products) {
            this.cost += product.getPrice();
        }
        for(Product product: this.gifts) {
            this.cost -= product.getPrice();
        }
        return this.cost > 0 ? this.cost : 0;
    }
}
