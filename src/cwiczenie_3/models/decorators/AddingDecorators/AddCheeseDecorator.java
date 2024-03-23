package cwiczenie_3.models.decorators.AddingDecorators;

import cwiczenie_3.enums.IngredientsEnum;
import cwiczenie_3.interfaces.IPizza;
import cwiczenie_3.models.decorators.ModifyPizzaDecorator;

public class AddCheeseDecorator extends ModifyPizzaDecorator {
    public AddCheeseDecorator(IPizza pizza) {
        super(pizza);
        super.addExtraIngredient(IngredientsEnum.CHEESE);
    }
}
