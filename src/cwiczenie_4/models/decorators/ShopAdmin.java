package cwiczenie_4.models.decorators;

import cwiczenie_4.interfaces.IOrderSubmiter;
import cwiczenie_4.models.Order;
import cwiczenie_4.models.Shop;

import java.util.ArrayList;

public class ShopAdmin extends Shop  implements IOrderSubmiter {
   private Shop shop;
    public ShopAdmin(Shop shop) {
        this.shop = shop;
        this.setPlacedOrders(this.shop.getPlacedOrders());
        this.setSubmittedOrders(this.shop.getSubmittedOrders());

    }
    @Override
    public void submitOrder(Order order) {
        order.submitOrder();
        ArrayList<Order> placedOrders = this.shop.getPlacedOrders();
        placedOrders.remove(order);
        this.shop.setPlacedOrders(placedOrders);
        this.shop.addOrderToSubmitted(order);
    }

    public Order assignMascot(Order order){
        return new AssignMascot(order);
    }
    public Order assignLeash(Order order){
        return new AssignLeash(order);
    }
    public Order assignDiscount10(Order order){
        return new AssignDiscount10(order);
    }

}
