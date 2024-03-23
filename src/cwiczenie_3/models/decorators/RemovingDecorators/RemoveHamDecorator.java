package cwiczenie_3.models.decorators.RemovingDecorators;

import cwiczenie_3.enums.IngredientsEnum;
import cwiczenie_3.interfaces.IPizza;
import cwiczenie_3.models.decorators.ModifyPizzaDecorator;

public class RemoveHamDecorator extends ModifyPizzaDecorator {
    public RemoveHamDecorator(IPizza pizza) {
        super(pizza);
        super.deleteIngredient(IngredientsEnum.HAM);
    }
}
