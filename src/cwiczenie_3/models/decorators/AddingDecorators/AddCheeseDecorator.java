package cwiczenie_3.models.decorators.AddingDecorators;

import cwiczenie_3.enums.IngredientsEnum;
import cwiczenie_3.interfaces.IPizza;
import cwiczenie_3.models.decorators.ModifyPizzaDecorator;

import java.util.ArrayList;


public class AddCheeseDecorator extends ModifyPizzaDecorator {
    public AddCheeseDecorator(IPizza pizza) {
        super(pizza);
    }

    @Override
    public ArrayList<IngredientsEnum> getIngredients() {
        ArrayList<IngredientsEnum> ingredients = this.pizza.getIngredients();
        ingredients.add(IngredientsEnum.CHEESE);
        return ingredients;
    }


}
