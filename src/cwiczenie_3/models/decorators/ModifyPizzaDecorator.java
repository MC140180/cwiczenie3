package cwiczenie_3.models.decorators;

import cwiczenie_3.enums.IngredientsEnum;
import cwiczenie_3.enums.PizzaDecoratorsEnum;
import cwiczenie_3.interfaces.IPizza;

import java.util.ArrayList;
import java.util.HashMap;

public abstract class ModifyPizzaDecorator implements IPizza {
   protected IPizza pizza;
   public ModifyPizzaDecorator(IPizza pizza){
        this.pizza = pizza;
    }

}
