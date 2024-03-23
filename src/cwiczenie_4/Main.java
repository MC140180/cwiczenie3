package cwiczenie_4;

import cwiczenie_4.models.*;
import cwiczenie_4.models.decorators.AssignLeash;
import cwiczenie_4.models.decorators.ShopAdmin;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop();
        Client client = new Client();
        client.addProductToBasket(new Product("Wiertarka", 1));
        client.addProductToBasket(new Product("Wiertarka3", 1));
        Order order = new Order(client, client.getBasket());
        shop.placeOrder(order);

        Shop shopAdmin = new ShopAdmin(shop);

        new AssignLeash(order);
        shopAdmin.submitOrder(order);

        ArrayList<Order> orders = shopAdmin.getShop().getSubmittedOrders();
        System.out.println(orders.getFirst().getTotalInfo());
    }
}
