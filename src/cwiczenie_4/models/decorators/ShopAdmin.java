package cwiczenie_4.models.decorators;

import cwiczenie_4.interfaces.IGiftAssigner;
import cwiczenie_4.interfaces.IOrderSubmiter;
import cwiczenie_4.models.Order;
import cwiczenie_4.models.Shop;

import java.util.ArrayList;

public class ShopAdmin implements IOrderSubmiter {
    private final Shop shop;

    public ShopAdmin(Shop shop) {
        this.shop = shop;
    }

    @Override
    public void submitOrder(IGiftAssigner order) {
        order.getOrder().submitOrder();
        ArrayList<Order> placedOrders = this.shop.getPlacedOrders();
        placedOrders.remove(order);
        this.shop.setPlacedOrders(placedOrders);
        this.shop.addOrderToSubmitted(order.getOrder());
    }

    @Override
    public Shop getShop() {
        return shop;
    }
}
