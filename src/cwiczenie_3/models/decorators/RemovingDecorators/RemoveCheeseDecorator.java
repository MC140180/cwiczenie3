package cwiczenie_3.models.decorators.RemovingDecorators;

import cwiczenie_3.enums.IngredientsEnum;
import cwiczenie_3.interfaces.IPizza;
import cwiczenie_3.models.decorators.ModifyPizzaDecorator;

import java.util.ArrayList;
import java.util.Collections;

public class RemoveCheeseDecorator extends ModifyPizzaDecorator {

    public RemoveCheeseDecorator(IPizza pizza) {
        super(pizza);
    }

    @Override
    public ArrayList<IngredientsEnum> getIngredients() {
        ArrayList<IngredientsEnum> ingredients = this.pizza.getIngredients();
        ingredients.removeAll(Collections.singleton(IngredientsEnum.CHEESE));
        return ingredients;
    }
}
