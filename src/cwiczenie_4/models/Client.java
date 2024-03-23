package cwiczenie_4.models;

import java.util.ArrayList;

public class Client {
    private ArrayList<Product> basket;
    public Client() {
        this.basket = new ArrayList<Product>();
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

}
