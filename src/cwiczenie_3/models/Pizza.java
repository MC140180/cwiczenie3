package cwiczenie_3.models;

import cwiczenie_3.enums.IngredientsEnum;
import cwiczenie_3.enums.PizzaDecoratorsEnum;
import cwiczenie_3.interfaces.IPizza;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public  class Pizza implements IPizza {
    public ArrayList<PizzaDecoratorsEnum>  decoratorList;

    public Pizza() {
    }

    public String getIngredients() {
        return "dough";
    }
}
