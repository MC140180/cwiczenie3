package cwiczenie_4.models.decorators;

import cwiczenie_4.interfaces.IOrder;
import cwiczenie_4.models.Order;
import cwiczenie_4.models.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.stream.Collectors;

public abstract class AssignGift implements IOrder {
   protected IOrder order;

    public AssignGift(IOrder order) {
        this.order = order;
    }

    @Override
    public Order getOrder() {
        return this.order.getOrder();
    }
    @Override
    public HashMap<String, Object> getOrderInformation() {
        HashMap<String, Object> orderInfo = new HashMap<String, Object>();
        orderInfo.put("Gifts: ", this.getGifts().stream().map(Product::getName).collect(Collectors.toList()));
        orderInfo.put("Products: ", this.order.getOrder().getProducts().stream().map(Product::getName).collect(Collectors.toList()));
        orderInfo.put("Total price: ", this.getCost() + this.order.getOrder().getTransportPrice() );
        return orderInfo;
    }
}

