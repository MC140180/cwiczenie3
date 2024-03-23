package cwiczenie_4.models.decorators;

import cwiczenie_4.models.Product;
import cwiczenie_4.interfaces.IGiftAssigner;

public class AssignGift implements IGiftAssigner {
    IGiftAssigner order;
    public AssignGift(IGiftAssigner order){
        this.order = order;
    }
    @Override
    public void assignGift(Product gift) {
        this.order.assignGift(gift);
    }

}

