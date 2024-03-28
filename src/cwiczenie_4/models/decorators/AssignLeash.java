package cwiczenie_4.models.decorators;

import cwiczenie_4.interfaces.IOrder;
import cwiczenie_4.models.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.stream.Collectors;

public class AssignLeash extends AssignGift {

    public AssignLeash(IOrder order) {
        super(order);
    }

    @Override
    public ArrayList<Product> getGifts() {
        ArrayList<Product> newOrders =  this.order.getGifts();
        newOrders.add(new Product("Leash", 0));
        return newOrders;
    }



    @Override
    public double getCost() {

        return this.order.getCost() + 0;
    }
    @Override
    public HashMap<String, Object> getOrderInformation() {
        HashMap<String, Object> orderInfo = new HashMap<String, Object>();
        orderInfo.put("Gifts: ", this.order.getGifts().stream().map(Product::getName).collect(Collectors.toList()));
        orderInfo.put("Products: ", this.order.getOrder().getProducts().stream().map(Product::getName).collect(Collectors.toList()));
        orderInfo.put("Total price: ", this.getCost() );
        return orderInfo;
    }
}
