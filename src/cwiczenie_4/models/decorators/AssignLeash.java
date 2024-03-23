package cwiczenie_4.models.decorators;

import cwiczenie_4.interfaces.IGiftAssigner;
import cwiczenie_4.models.Product;

public class AssignLeash extends AssignGift {
    public AssignLeash(IGiftAssigner order) {
        super(order.getOrder());
        this.assignGift(new Product("Leash", 0));
    }

    @Override
    public void assignGift(Product gift) {
        System.out.println("Dodano smycz");
        this.order.assignGift(gift);
    }

}
