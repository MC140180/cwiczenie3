package cwiczenie_3.models.decorators;

import cwiczenie_3.interfaces.IPizza;

public abstract class ModifyPizzaDecorator implements IPizza {
   protected IPizza pizza;
   public ModifyPizzaDecorator(IPizza pizza){
        this.pizza = pizza;
    }

}
