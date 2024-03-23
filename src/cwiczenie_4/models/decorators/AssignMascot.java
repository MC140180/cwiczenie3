package cwiczenie_4.models.decorators;

import cwiczenie_4.interfaces.IGiftAssigner;
import cwiczenie_4.models.Product;

public class AssignMascot extends AssignGift {
    public AssignMascot(IGiftAssigner order) {
        super(order.getOrder());
        this.assignGift(new Product("Mascot", 0));
    }

    @Override
    public void assignGift(Product gift) {
        System.out.println("Dodano maskotke");
        this.order.assignGift(gift);
    }
}
