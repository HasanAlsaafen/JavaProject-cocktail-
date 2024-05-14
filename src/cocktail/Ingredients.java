package cocktail;

import java.io.Serializable;

public abstract class Ingredients implements Serializable
{
     private Color color;
     private double volume;
 private String name;
 private double calories;



    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Ingredients(Color color, double volume, String name, double calories) {
        this.color = color;
        this.volume = volume;
        this.name = name;
        this.calories = calories;
    }




     
            public Ingredients() {
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCalories() {
        return calories;
    }
    public  void setCalories(double calories)
    {
        this.calories=calories;
    }

  
    public String getInfo() {
        return "Ingredients{" + "name=" + name + ", calories=" + calories + ", color=" + color.toString() ;
    }
}
