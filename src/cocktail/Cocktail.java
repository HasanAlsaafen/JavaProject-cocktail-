package cocktail;

import java.util.ArrayList;

public class Cocktail {
private double calories;
ArrayList<Ingredients> ingredient;
private Color color;

    public Cocktail(double calories, ArrayList<Ingredients> ingredient, Color color) {
        this.calories = calories;
        this.ingredient = ingredient;
        this.color = color;
    }

    public Cocktail() {
    }

    public double getCalories() {
        return calories;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }

    public ArrayList<Ingredients> getIngredient() {
        return ingredient;
    }

    public void setIngredient(ArrayList<Ingredients> ingredient) {
        this.ingredient = ingredient;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
    public String getInfo() {
        return "Cocktail{" + "calories=" + calories + ", ingredient=" + ingredient + ", color=" + color + '}';
    }

    
    
    
}

    
