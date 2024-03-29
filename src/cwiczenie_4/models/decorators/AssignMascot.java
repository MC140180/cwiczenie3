package cwiczenie_4.models.decorators;

import cwiczenie_4.interfaces.IOrder;
import cwiczenie_4.models.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.stream.Collectors;

public class AssignMascot  extends AssignGift {
    public AssignMascot(IOrder order) {
        super(order);
    }
    @Override
    public ArrayList<Product> getGifts() {
        ArrayList<Product> newOrders =  this.order.getGifts();
        newOrders.add(new Product("Mascot", 0));
        return newOrders;
    }

    @Override
    public double getCost() {
        return this.order.getCost() + 0;
    }
}
