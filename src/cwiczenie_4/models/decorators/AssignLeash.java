package cwiczenie_4.models.decorators;

import cwiczenie_4.models.Order;
import cwiczenie_4.models.Product;
import cwiczenie_4.interfaces.IGiftAssigner;

public class AssignLeash extends  AssignGift {
    public AssignLeash(IGiftAssigner order){
        super(order);
        super.assignGift(new Product("Leash", 0));
    }

}
