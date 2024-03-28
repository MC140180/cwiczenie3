package cwiczenie_3.models.decorators.AddingDecorators;

import cwiczenie_3.enums.IngredientsEnum;
import cwiczenie_3.interfaces.IPizza;
import cwiczenie_3.models.decorators.ModifyPizzaDecorator;

import java.util.ArrayList;

public class AddHamDecorator extends ModifyPizzaDecorator {
    public AddHamDecorator(IPizza pizza) {
        super(pizza);
    }

    @Override
    public ArrayList<IngredientsEnum> getIngredients() {
        ArrayList<IngredientsEnum> ingredients = this.pizza.getIngredients();
        ingredients.add(IngredientsEnum.HAM);
        return ingredients;
    }

}
