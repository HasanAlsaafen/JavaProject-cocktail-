
package cocktail;
import java.lang.System.Logger;
import java.util.ArrayList;


public  class Blender 
{

    private  double calories;
    private  double volume;
    private Color color;
    private double capasity;
    private ArrayList<Ingredients> ingredients;

    public Blender() {
        ingredients=new ArrayList();
        color=new Color(0,0,0);
        
    }

    public Blender(double capasity ,Logger logger) {
        this.capasity = capasity;
        ingredients=new ArrayList();
        color=new Color(0,0,0);
    }

    public void setCapasity(double capasity) {
        this.capasity = capasity;
    }
    
    
 
  public void add(ArrayList<Fruits> fruit ,ArrayList<Milk> milk,Suger suger) throws BlenderOverFlowExecption
          
  {
        
      if (suger!=null)
      {
        
            this.ingredients.add(suger);
            this.calories+=suger.getCalories();
      }
    
         for(int i=0;i<milk.size();i++)
      {
            
          this.calories+=milk.get(i).getCalories();
          this .volume+=milk.get(i).getVolume();
          this.ingredients.add(milk.get(i));
          
      }
      for(int i=0;i<fruit.size();i++)
      {
          this.calories+=fruit.get(i).getCalories();
          this .volume+=fruit.get(i).getVolume();
          this.ingredients.add(fruit.get(i));
          
      }
        


if(this.volume>this.capasity) throw new BlenderOverFlowExecption();
  };
  public  void pour(Cup cup) throws BlenderEmptyExecption
  
  {
      
   
      if(this.volume>=cup.getCapacity())
      {

            cup.setCalories((cup.getCapacity()*this.calories)/this.volume);
      this.volume-=cup.getCapacity();
 
      this.calories-=cup.getCalories();
    
      }
      else throw new BlenderEmptyExecption();

  }
    public double getCalories() {
        return calories;
    }

    public double getVolume() {
        return volume;
    }

    public Color getColor() {
        return color;
    }
    public void blend()
    {
        
        for (Ingredients s:ingredients)
        {
            if(s.getColor()!=null)
            {
                if(color!=null)
                {
                 color.setRed((int) (color.getRed()+(s.getColor().getRed()*s.getVolume()/this.volume)));
                 color.setBlue((int) (color.getBlue()+(s.getColor().getBlue()*s.getVolume()/this.volume)));
                 color.setGreen((int) (color.getRed()+(s.getColor().getRed()*s.getVolume()/this.volume)));
                }
            }
           
        }
        color.setRed(color.getRed()/ingredients.size());
        color.setBlue(color.getBlue()/ingredients.size());
        color.setGreen(color.getGreen()/ingredients.size());
    }

    public ArrayList<Ingredients> getIngredients() {
        return ingredients;
    }
    public boolean isFull()
    {
       return (this.capasity==this.volume);
    }
        public boolean isEmpty()
    {
       return (this.volume==0);
    }

   
    public String getInfo() {
        return "Blender{" + "calories=" + calories + ", volume=" + volume + ", color=" + color.toString() + ", capasity=" + capasity + ", ingredients=" + ingredients.toString() + '}';
    }      
}
