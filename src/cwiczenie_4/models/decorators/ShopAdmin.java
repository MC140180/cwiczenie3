package cwiczenie_4.models.decorators;

import cwiczenie_4.interfaces.IGiftAssigner;
import cwiczenie_4.models.Order;
import cwiczenie_4.models.Shop;

import java.util.ArrayList;

public class ShopAdmin {
    private final Shop shop;

    public ShopAdmin(Shop shop) {
        this.shop = shop;
    }

    public void submitOrder(IGiftAssigner order) {
        order.getOrder().submitOrder();
        ArrayList<Order> placedOrders = this.shop.getPlacedOrders();
        placedOrders.remove(order.getOrder());
        this.shop.setPlacedOrders(placedOrders);
        this.shop.addOrderToSubmitted(order.getOrder());
    }

    public Shop getShop() {
        return shop;
    }
}
