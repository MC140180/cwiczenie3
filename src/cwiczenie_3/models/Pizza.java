package cwiczenie_3.models;

import cwiczenie_3.interfaces.IPizza;


public  class Pizza implements IPizza {
    public Pizza() {
    }

    public String getIngredients() {
        return "dough";
    }
}
