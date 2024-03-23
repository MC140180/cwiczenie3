package cwiczenie_4;

import cwiczenie_4.interfaces.IOrderSubmiter;
import cwiczenie_4.models.*;
import cwiczenie_4.models.decorators.AssignDiscount10;
import cwiczenie_4.models.decorators.AssignLeash;
import cwiczenie_4.models.decorators.ShopAdmin;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop();
        Client client = new Client();
        client.addProductToBasket(new Product("Wiertarka", 1));
        client.addProductToBasket(new Product("Wiertarka3", 11));
        Order order = new Order(client, client.getBasket());
        shop.placeOrder(order);

        shop.submitOrder(order);

        ArrayList<Order> orders = shop.getSubmittedOrders();
        System.out.println(!orders.isEmpty() ? orders.getFirst().getTotalInfo() : "[]");
        shop = new ShopAdmin(shop);
        new AssignDiscount10(order);
        shop.submitOrder(order);

        System.out.println(!orders.isEmpty() ? orders.getFirst().getTotalInfo() : "[]");

    }
}
