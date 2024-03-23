package cwiczenie_4;

import cwiczenie_4.models.Client;
import cwiczenie_4.models.Order;
import cwiczenie_4.models.Product;
import cwiczenie_4.models.Shop;
import cwiczenie_4.models.decorators.AssignDiscount10;
import cwiczenie_4.models.decorators.AssignLeash;
import cwiczenie_4.models.decorators.AssignMascot;
import cwiczenie_4.models.decorators.ShopAdmin;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop();

        Client client = new Client(shop);
        client.addProductToBasket(new Product("Wiertarka", 1));
        client.addProductToBasket(new Product("Wiertarka3", 11));

        Order order = client.placeOrder();

        ArrayList<Order> orders = shop.getSubmittedOrders();
        System.out.println(!orders.isEmpty() ? orders.getFirst().getTotalInfo() : "[]");
        ShopAdmin shopAdmin = new ShopAdmin(shop);

        shopAdmin.submitOrder(new AssignDiscount10(new AssignMascot(new AssignLeash(order))));

        System.out.println((!orders.isEmpty() ? orders.getFirst().getTotalInfo() : "[]"));
    }
}
