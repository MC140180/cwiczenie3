package cwiczenie_3.models;

import cwiczenie_3.enums.IngredientsEnum;
import cwiczenie_3.interfaces.IPizza;

import java.util.ArrayList;


public  class Pizza implements IPizza {
    public Pizza() {
    }

    public ArrayList<IngredientsEnum> getIngredients() {
        ArrayList<IngredientsEnum> ingredients = new ArrayList<IngredientsEnum>();
        ingredients.add(IngredientsEnum.DOUGH);
        return ingredients;
    }
}
