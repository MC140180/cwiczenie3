package cwiczenie_4.models;

import cwiczenie_4.interfaces.IOrder;

import java.util.ArrayList;

public class Client {
    private final ArrayList<Product> basket;
    private final String clientName;

    public Client(String clientName) {
        this.basket = new ArrayList<Product>();
        this.clientName = clientName;
    }

    public String getClientName() {
        return clientName;
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

    public IOrder placeOrder(Shop shop) {
        Order order = new Order(this, this.basket);
        shop.addPlacedOrder(order);
        shop.addClient(this);
        return order;
    }
}
