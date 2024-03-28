package cwiczenie_4.models.decorators;

import cwiczenie_4.interfaces.IOrder;
import cwiczenie_4.models.Order;
import cwiczenie_4.models.Product;

import java.util.ArrayList;
import java.util.HashMap;

public abstract class AssignGift implements IOrder {
   protected IOrder order;

    public AssignGift(IOrder order) {
        this.order = order;
    }

    @Override
    public ArrayList<Product> getGifts() {
        return this.getOrder().getGifts();
    }
    @Override
    public Order getOrder() {
        return this.order.getOrder();
    }

}

