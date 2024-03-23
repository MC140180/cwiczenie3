package cwiczenie_4.models.decorators;

import cwiczenie_4.models.Order;
import cwiczenie_4.models.Product;

public class AssignMascot extends  AssignGift{
    public AssignMascot(Order order) {
        super(order);
        super.assignGift(new Product("Mascot", 0));
    }


}
