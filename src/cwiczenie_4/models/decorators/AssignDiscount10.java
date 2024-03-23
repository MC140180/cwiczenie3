package cwiczenie_4.models.decorators;

import cwiczenie_4.interfaces.IGiftAssigner;
import cwiczenie_4.models.Product;

public class AssignDiscount10 extends AssignGift {
    public AssignDiscount10(IGiftAssigner order) {
        super(order.getOrder());
        this.assignGift(new Product("Discount", -10));
    }

    @Override
    public void assignGift(Product gift) {
        this.order.assignGift(gift);
        System.out.println("Dodano rabat");
    }

}
