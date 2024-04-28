package cocktail;

import java.util.ArrayList;

public class Cocktail {

    private int calories;
    private  ArrayList<Ingredients> ingredients=new ArrayList<>(); // should be necessary or no to be final  ya hasan?????
   private Color color;

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public Color getColor() {
        return color;
    }

    public  void setColor(Color color) {
        this.color = color;
    }

    public ArrayList<Ingredients> getIngredients() {
        return ingredients;
    }

    public void setIngredients(ArrayList<Ingredients> ingredients) {
        this.ingredients = ingredients;
    }

    @Override
    public String toString() {
        return "Cocktail{" +
                "calories=" + calories +
                ", ingredients=" + ingredients +
                ", color=" + color +
                '}';
    }
}
