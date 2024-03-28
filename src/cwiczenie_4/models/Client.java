package cwiczenie_4.models;

import cwiczenie_4.interfaces.IOrder;

import java.util.ArrayList;

public class Client {
    private final ArrayList<Product> basket;
    private final String clientName;
    private Shop shop;

    public Client(String clientName, Shop shop) {
        this.basket = new ArrayList<Product>();
        this.shop = shop;
        this.clientName = clientName;
    }

    public String getClientName() {
        return clientName;
    }

    public Shop getShop() {
        return shop;
    }

    public void setShop(Shop shop) {
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

    public IOrder placeOrder() {
        Order order = new Order(this, this.basket);
        this.shop.addPlacedOrder(order);
        this.shop.addClient(this);
        return order;
    }
}
