package cwiczenie_4.models;

import cwiczenie_4.interfaces.IOrderSubmiter;

import java.util.ArrayList;

public class Client  {
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
    public Order placeOrder() {
        Order order = new Order(this, this.basket);
        this.shop.addPlacedOrder(order);
        return order;
    }
}
