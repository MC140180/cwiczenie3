package cwiczenie_3;

import cwiczenie_3.interfaces.IPizza;
import cwiczenie_3.models.Pizza;
import cwiczenie_3.models.decorators.AddingDecorators.AddCheeseDecorator;
import cwiczenie_3.models.decorators.AddingDecorators.AddHamDecorator;
import cwiczenie_3.models.decorators.AddingDecorators.AddSauceDecorator;
import cwiczenie_3.models.decorators.RemovingDecorators.RemoveCheeseDecorator;
import cwiczenie_3.models.decorators.RemovingDecorators.RemoveHamDecorator;
import cwiczenie_3.models.decorators.RemovingDecorators.RemoveSauceDecorator;

public class Main {
    public static void main(String[] args) {
        IPizza pizza = new Pizza();

        IPizza allIngredient =  new AddSauceDecorator(new AddCheeseDecorator(new AddHamDecorator(pizza)));
        System.out.println("Pizza with all ingredients:" + allIngredient.getIngredients());

        IPizza pizza1 = new AddHamDecorator( new RemoveCheeseDecorator(allIngredient));
        IPizza nowHamPizza1 = new RemoveHamDecorator(pizza1);
        System.out.println("double ham, no cheese:" + pizza1.getIngredients());
        System.out.println("no ham, no cheese:" + nowHamPizza1.getIngredients());
    }
}
