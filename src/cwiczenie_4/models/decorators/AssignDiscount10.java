package cwiczenie_4.models.decorators;

import cwiczenie_4.interfaces.IOrder;
import cwiczenie_4.models.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.stream.Collectors;

public class AssignDiscount10 extends AssignGift {

    public AssignDiscount10(IOrder order) {
        super(order);
    }

    @Override
    public ArrayList<Product> getGifts() {
        ArrayList<Product> newOrders = this.order.getGifts();
        newOrders.add(new Product("Discount -10", -10));
        return newOrders;
    }

    @Override
    public double getCost() {
        return Math.max(this.order.getCost() - 10, 0) <= 0 ? 0 : this.order.getCost() - 10;
    }
    @Override
    public HashMap<String, Object> getOrderInformation() {
        HashMap<String, Object> orderInfo = new HashMap<String, Object>();
        orderInfo.put("Gifts: ", this.order.getGifts().stream().map(Product::getName).collect(Collectors.toList()));
        orderInfo.put("Products: ", this.order.getOrder().getProducts().stream().map(Product::getName).collect(Collectors.toList()));
        orderInfo.put("Total price: ", this.getCost() + this.order.getOrder().getTransportPrice() );
        return orderInfo;
    }
}