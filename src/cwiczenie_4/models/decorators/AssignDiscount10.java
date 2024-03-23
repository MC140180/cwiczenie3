package cwiczenie_4.models.decorators;

import cwiczenie_4.interfaces.IGiftAssigner;
import cwiczenie_4.models.Product;

public class AssignDiscount10 extends AssignGift {
    public AssignDiscount10(IGiftAssigner order){
        super(order);
        this.assignGift(new Product("discount", -10));
    }

}
