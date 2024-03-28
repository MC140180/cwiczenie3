package cwiczenie_3.models.decorators.RemovingDecorators;

import cwiczenie_3.interfaces.IPizza;
import cwiczenie_3.models.decorators.ModifyPizzaDecorator;

public class RemoveCheeseDecorator extends ModifyPizzaDecorator {

    public RemoveCheeseDecorator(IPizza pizza) {
        super(pizza);
    }

    @Override
    public  String getIngredients() {
        return this.pizza.getIngredients().replace(", Cheese", "");
    }
}
