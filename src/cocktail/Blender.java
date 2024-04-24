
package cocktail;
import java.util.ArrayList;
public  class Blender 
{

    private  double calories;
    private  double volume;
    private  int[] color;
private  final double capasity = 2000;
private final  ArrayList<Ingredients> ingredients=new ArrayList<>();
 
  public void add(ArrayList<Fruits> fruit ,ArrayList<Milk> milk,Suger suger) throws BlenderFull
          
  {
      
      this.ingredients.add(suger);
    
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

if(this.volume>this.capasity) throw new BlenderFull();
  };

  public  void blend ()
  {
      //function for    RGP  color;
      
  }
  public  void pour(Cup cup) throws BlenderEmpty
  
  {
      
   
      if(this.volume>=cup.getCapacity())
      {
                cup.setVolume(cup.getCapacity());
            cup.setCalories((cup.getVolume()*this.calories)/this.volume);
      this.volume-=cup.getCapacity();
 
      this.calories=((this.volume)/this.capasity)*this.calories;
    
      }
    
      if(this.volume<cup.getCapacity()&&this.volume>0)
      {
          cup.setVolume(this.volume);
          this.volume=0;
          this.calories=0;
         
      }
      if(isEmpty())throw new BlenderEmpty();

  }

    public double getCalories() {
        return calories;
    }

    public double getVolume() {
        return volume;
    }

    public int[] getColor() {
        return color;
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
        return "Blender{" + "calories=" + calories + ", volume=" + volume + ", color=" + color + ", capasity=" + capasity + ", ingredients=" + ingredients + '}';
    }



 
    
      
}
