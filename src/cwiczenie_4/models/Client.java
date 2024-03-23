package cwiczenie_4.models;

import cwiczenie_4.interfaces.IOrderSubmiter;

import java.util.ArrayList;

public class Client implements IOrderSubmiter {
    private ArrayList<Product> basket;
    private Shop shop;
    public Client(Shop shop) {
        this.basket = new ArrayList<Product>();
        this.shop = shop;
    }
    public ArrayList<Product> getBasket() {
        return basket;
    }

    public void addProductToBasket(Product product) {
        this.basket.add(product);
    }
    public void deleteProductFromBasket(Product product) {
        this.basket.remove(product);
    }

    @Override
    public void submitOrder(Order order){
        System.out.println("You cannot submit order");
    }
    public void placeOrder(Order order) {
        this.shop.addPlacedOrder(order);
    }
}
