package cwiczenie_3.models.decorators.AddingDecorators;

import cwiczenie_3.enums.IngredientsEnum;
import cwiczenie_3.interfaces.IPizza;
import cwiczenie_3.models.decorators.ModifyPizzaDecorator;

public class AddSauceDecorator extends ModifyPizzaDecorator {
    public AddSauceDecorator(IPizza pizza) {
        super(pizza);
        super.addExtraIngredient(IngredientsEnum.TOMATO_SAUCE);
    }
}
