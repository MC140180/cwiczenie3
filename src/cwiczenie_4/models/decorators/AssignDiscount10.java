package cwiczenie_4.models.decorators;

import cwiczenie_4.models.Order;
import cwiczenie_4.models.Product;

public class AssignDiscount10 extends AssignGift {
    public AssignDiscount10(Order order){
        super(order);
        this.assignGift(new Product("discount", -10));
    }

}
