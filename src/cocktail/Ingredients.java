package cocktail;

public abstract class Ingredients
{
 private String name;
 protected double calories;
 private Color color;




  

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Ingredients(String name, double calories) {
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
