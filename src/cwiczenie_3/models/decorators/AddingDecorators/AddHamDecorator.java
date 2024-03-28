package cwiczenie_3.models.decorators.AddingDecorators;

import cwiczenie_3.interfaces.IPizza;
import cwiczenie_3.models.decorators.ModifyPizzaDecorator;

public class AddHamDecorator extends ModifyPizzaDecorator {
    public AddHamDecorator(IPizza pizza) {
        super(pizza);
    }

    @Override
    public String getIngredients() {
        return this.pizza.getIngredients() + ", Ham";
    }

}
