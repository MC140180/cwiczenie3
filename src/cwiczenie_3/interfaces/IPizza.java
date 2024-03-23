package cwiczenie_3.interfaces;

import cwiczenie_3.enums.IngredientsEnum;

import java.util.ArrayList;
import java.util.HashMap;

public interface IPizza {
    ArrayList<IngredientsEnum> ingredients = new ArrayList<IngredientsEnum>();
    ArrayList<IngredientsEnum> extraIngredients = new ArrayList<IngredientsEnum>();

    HashMap<String, ArrayList<IngredientsEnum>> getIngredients();

    void setIngredients(ArrayList<IngredientsEnum> ingredients);

    void addExtraIngredient(IngredientsEnum ingredient);

    void deleteIngredient(IngredientsEnum ingredient);
}
