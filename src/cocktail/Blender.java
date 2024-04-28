
package cocktail;
import java.util.ArrayList;


public  class Blender 
{

    private  double calories;
    private  double volume;
    private  int[] color={0,0,0};
private  final double capasity = 2000;
private final  ArrayList<Ingredients> ingredients=new ArrayList<>();

    public Blender() {
        
    }
 
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
int sum[]=new int[3];
int count=0;
     for(Ingredients d:ingredients)
     {
     
         
         if(d!=null)
         {
             if(d.getColor()!=null)
             {
             int c[]=d.getColor();
             count++;
          int red=c[0];
              int green=c[1];
              int blue=c[2];
              
              sum[0]+=red*d.getVolume()/this.volume;
      
               sum[1]+=green*d.getVolume()/this.volume;
               sum[2]+=blue*d.getVolume()/this.volume;
             }
         
         }
     }
        if(count!=0)
        {
         color[0]=sum[0]/count;
         color[1]=sum[1]/count;
         color[2]=sum[2]/count;
        }




  }
 
  public  void pour(Cup cup) throws BlenderEmpty
  
  {
      
   
      if(this.volume>=cup.getCapacity())
      {
                cup.setVolume(cup.getCapacity());
            cup.setCalories((cup.getVolume()*this.calories)/this.volume);
      this.volume-=cup.getCapacity();
 
      this.calories-=cup.getCalories();
    
      }
      else throw new BlenderEmpty();

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
        return "Blender{" + "calories=" + calories + ", volume=" + volume + ", color=" + color.toString() + ", capasity=" + capasity + ", ingredients=" + ingredients + '}';
    }      
}
