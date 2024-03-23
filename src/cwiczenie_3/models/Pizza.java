package cwiczenie_3.models;

import cwiczenie_3.enums.IngredientsEnum;
import cwiczenie_3.interfaces.IPizza;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public abstract class Pizza implements IPizza {
    private ArrayList<IngredientsEnum> ingredients;
    private final ArrayList<IngredientsEnum> extraIngredients;

    public Pizza() {
        this.ingredients = new ArrayList<IngredientsEnum>();
        this.extraIngredients = new ArrayList<IngredientsEnum>();
    }

    public HashMap<String, ArrayList<IngredientsEnum>> getIngredients() {
        HashMap<String, ArrayList<IngredientsEnum>> ingredients1 = new HashMap<>();
        ingredients1.put("basicIngredients:", this.ingredients);
        ingredients1.put("extraIngredients:", this.extraIngredients);
        return ingredients1;
    }

    public void setIngredients(ArrayList<IngredientsEnum> ingredients) {
        this.ingredients = ingredients;
    }

    public void addExtraIngredient(IngredientsEnum ingredient) {
        this.extraIngredients.add(ingredient);
    }

    public void deleteIngredient(IngredientsEnum ingredient) {
        this.extraIngredients.removeAll(Collections.singleton(ingredient));
        this.ingredients.removeAll(Collections.singleton(ingredient));
    }
}
