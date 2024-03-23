package cwiczenie_3;

import cwiczenie_3.interfaces.IPizza;
import cwiczenie_3.models.HamPizza;
import cwiczenie_3.models.PlainPizza;
import cwiczenie_3.models.decorators.AddingDecorators.AddCheeseDecorator;
import cwiczenie_3.models.decorators.AddingDecorators.AddHamDecorator;
import cwiczenie_3.models.decorators.AddingDecorators.AddSauceDecorator;
import cwiczenie_3.models.decorators.RemovingDecorators.RemoveCheeseDecorator;
import cwiczenie_3.models.decorators.RemovingDecorators.RemoveHamDecorator;
import cwiczenie_3.models.decorators.RemovingDecorators.RemoveSauceDecorator;

public class Main {
    public static void main(String[] args) {
        IPizza pizza = new PlainPizza();

        pizza = new AddHamDecorator(pizza);
        pizza = new AddCheeseDecorator(pizza);
        pizza = new AddSauceDecorator(pizza);
        System.out.println("Pizza with all ingredients:"+ pizza.getIngredients());
        pizza = new RemoveHamDecorator(pizza);
        System.out.println("Same pizza without ham: " + pizza.getIngredients());
        pizza = new RemoveCheeseDecorator(pizza);
        System.out.println("Same pizza no cheese and ham:" + pizza.getIngredients());
        pizza = new RemoveSauceDecorator(pizza);
        System.out.println("Same, plain pizza:" + pizza.getIngredients());


        IPizza hamPizza = new HamPizza();
        System.out.println("basic ham pizza: " + hamPizza.getIngredients());
        new AddHamDecorator(hamPizza);
        System.out.println("basic ham pizza with extra ham: " + hamPizza.getIngredients());
        System.out.println("no sauce ham pizza: "+ new RemoveSauceDecorator(hamPizza).getIngredients());
    }
}
