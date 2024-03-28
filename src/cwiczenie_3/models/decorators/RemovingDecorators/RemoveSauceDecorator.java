package cwiczenie_3.models.decorators.RemovingDecorators;

import cwiczenie_3.enums.IngredientsEnum;
import cwiczenie_3.interfaces.IPizza;
import cwiczenie_3.models.decorators.ModifyPizzaDecorator;

import java.util.ArrayList;

public class RemoveSauceDecorator extends ModifyPizzaDecorator {

    public RemoveSauceDecorator(IPizza pizza) {
        super(pizza);
    }

    @Override
    public ArrayList<IngredientsEnum> getIngredients() {
        ArrayList<IngredientsEnum> ingredients = this.pizza.getIngredients();
        ingredients.remove(IngredientsEnum.TOMATO_SAUCE);
        return ingredients;
    }
}
