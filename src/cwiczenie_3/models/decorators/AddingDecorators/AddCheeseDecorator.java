package cwiczenie_3.models.decorators.AddingDecorators;

import cwiczenie_3.enums.IngredientsEnum;
import cwiczenie_3.enums.PizzaDecoratorsEnum;
import cwiczenie_3.interfaces.IPizza;
import cwiczenie_3.models.decorators.ModifyPizzaDecorator;

import java.util.ArrayList;
import java.util.HashMap;

public class AddCheeseDecorator extends ModifyPizzaDecorator {
    public AddCheeseDecorator(IPizza pizza) {
        super(pizza);
    }

    @Override
    public  String getIngredients() {
        return this.pizza.getIngredients() + ", Cheese";
    }


}
