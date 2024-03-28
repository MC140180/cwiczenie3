package cwiczenie_3.models.decorators.AddingDecorators;

import cwiczenie_3.interfaces.IPizza;
import cwiczenie_3.models.decorators.ModifyPizzaDecorator;


public class AddCheeseDecorator extends ModifyPizzaDecorator {
    public AddCheeseDecorator(IPizza pizza) {
        super(pizza);
    }

    @Override
    public  String getIngredients() {
        return this.pizza.getIngredients() + ", Cheese";
    }


}
