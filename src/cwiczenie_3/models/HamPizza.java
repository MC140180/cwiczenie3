package cwiczenie_3.models;

import cwiczenie_3.enums.IngredientsEnum;

import java.util.ArrayList;

public class HamPizza extends Pizza{
    public HamPizza(){
        super();
        ArrayList<IngredientsEnum> ingredients = new ArrayList<IngredientsEnum>();
        ingredients.add(IngredientsEnum.TOMATO_SAUCE);
        ingredients.add(IngredientsEnum.CHEESE);
        ingredients.add(IngredientsEnum.HAM);
        this.setIngredients(ingredients);
    }
}
