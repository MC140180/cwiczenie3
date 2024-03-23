package cwiczenie_3.models.decorators;

import cwiczenie_3.enums.IngredientsEnum;
import cwiczenie_3.interfaces.IPizza;

import java.util.ArrayList;
import java.util.HashMap;

public abstract class ModifyPizzaDecorator implements IPizza {
    IPizza pizza;

    public ModifyPizzaDecorator(IPizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public HashMap<String, ArrayList<IngredientsEnum>> getIngredients() {
        return this.pizza.getIngredients();
    }

    @Override
    public void setIngredients(ArrayList<IngredientsEnum> ingredients) {
        this.pizza.setIngredients(ingredients);
    }


    @Override
    public void addExtraIngredient(IngredientsEnum ingredient) {
        this.pizza.addExtraIngredient(ingredient);
    }

    @Override
    public void deleteIngredient(IngredientsEnum ingredient) {
        this.pizza.deleteIngredient(ingredient);
    }
}
