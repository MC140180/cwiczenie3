package cwiczenie_4;

import cwiczenie_4.interfaces.IGiftAssigner;
import cwiczenie_4.interfaces.IOrderSubmiter;
import cwiczenie_4.models.*;
import cwiczenie_4.models.decorators.AssignDiscount10;
import cwiczenie_4.models.decorators.AssignLeash;
import cwiczenie_4.models.decorators.ShopAdmin;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop();

        Client client = new Client(shop);
        client.addProductToBasket(new Product("Wiertarka", 1));
        client.addProductToBasket(new Product("Wiertarka3", 11));

        Order order =  client.placeOrder();

        ArrayList<Order> orders = shop.getSubmittedOrders();
        System.out.println(!orders.isEmpty() ? orders.getFirst().getTotalInfo() : "[]");
        IOrderSubmiter shopAdmin = new ShopAdmin(shop);
        new AssignLeash(new AssignDiscount10(order));

        shopAdmin.submitOrder(order);

        System.out.println((!orders.isEmpty() ? orders.getFirst().getTotalInfo() : "[]"));
    }
}
