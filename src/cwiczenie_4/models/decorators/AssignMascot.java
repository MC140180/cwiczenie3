package cwiczenie_4.models.decorators;

import cwiczenie_4.models.Product;
import cwiczenie_4.interfaces.IGiftAssigner;

public class AssignMascot extends  AssignGift{
    public AssignMascot(IGiftAssigner order) {
        super(order);
        super.assignGift(new Product("Mascot", 0));
    }


}
