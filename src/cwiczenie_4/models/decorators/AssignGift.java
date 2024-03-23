package cwiczenie_4.models.decorators;

import cwiczenie_4.interfaces.IGiftAssigner;
import cwiczenie_4.models.Order;
import cwiczenie_4.models.Product;

public abstract class AssignGift implements IGiftAssigner {
    IGiftAssigner order;

    public AssignGift(IGiftAssigner order) {
        this.order = order;
    }

    @Override
    public void assignGift(Product gift) {
        this.order.assignGift(gift);
    }

    @Override
    public Order getOrder() {
        return this.order.getOrder();
    }

}

