package cwiczenie_4;

import cwiczenie_4.interfaces.IOrder;
import cwiczenie_4.models.Client;
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

        Client client = new Client("andrzej", shop);
        client.addProductToBasket(new Product("Wiertarka", 1));
        client.addProductToBasket(new Product("Wiertarka3", 11));
        client.addProductToBasket(new Product("Wiertarka3", 11));
        client.addProductToBasket(new Product("Wiertarka3", 11));

        IOrder order = client.placeOrder();

        ShopAdmin shopAdmin = new ShopAdmin(shop);
        ArrayList<IOrder> orders = shopAdmin.getShop().getSubmittedOrders();

        IOrder order2 = new AssignLeash(new AssignLeash(new AssignDiscount10(new AssignDiscount10(new AssignDiscount10(new AssignDiscount10(new AssignMascot(new AssignDiscount10(order))))))));
        shopAdmin.submitOrder(order2);
        System.out.println((!orders.isEmpty() ? orders.getFirst().getOrderInformation() : "[]"));
    }
}
