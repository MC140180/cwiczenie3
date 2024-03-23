package cwiczenie_4.models.decorators;

import cwiczenie_4.models.Order;
import cwiczenie_4.models.Product;
import cwiczenie_4.interfaces.IGiftAssigner;

public class AssignGift extends Order implements IGiftAssigner {
    Order order;
    public AssignGift(Order order){
        super(order.getClient(), order.getProducts());
        this.order = order;
    }
    @Override
    public void assignGift(Product gift) {
        this.order.assignGift(gift);
    }

}

