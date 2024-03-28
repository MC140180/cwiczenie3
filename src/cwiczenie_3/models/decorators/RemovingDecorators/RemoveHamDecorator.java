package cwiczenie_3.models.decorators.RemovingDecorators;

import cwiczenie_3.enums.IngredientsEnum;
import cwiczenie_3.enums.PizzaDecoratorsEnum;
import cwiczenie_3.interfaces.IPizza;
import cwiczenie_3.models.decorators.ModifyPizzaDecorator;

import java.util.ArrayList;

public class RemoveHamDecorator extends ModifyPizzaDecorator {

    public RemoveHamDecorator(IPizza pizza) {
        super(pizza);
    }

    @Override
    public  String getIngredients() {
        return this.pizza.getIngredients().replace(", Ham", "");
    }


}
