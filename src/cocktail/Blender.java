
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
    
    
 
  public void add(ArrayList<Ingredients> ingredients) throws BlenderOverFlowExecption
          
  {
        
   
    
         for(int i=0;i<ingredients.size();i++)
      {
            
          this.calories+=ingredients.get(i).getCalories();
          this .volume+=ingredients.get(i).getVolume();
          this.ingredients.add(ingredients.get(i));
          
      }
          this.ingredients=ingredients;
   

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
    public Cocktail blend()
    {
        
        for (Ingredients s:ingredients)
        {
            if(s.getColor()!=null)
            {
               
                 color.setRed((int)((color.getRed()+(s.getColor().getRed()))));
                 color.setBlue((int)((color.getBlue()+(s.getColor().getBlue()))));
                 color.setGreen((int)((color.getGreen()+(s.getColor().getGreen()))));
                
               
            }
           
        }
        color.setRed(color.getRed()/ingredients.size());
        color.setBlue(color.getBlue()/ingredients.size());
        color.setGreen(color.getGreen()/ingredients.size());
        Cocktail cocktail=new Cocktail(this.calories,this.ingredients,color);
        return cocktail;
     
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
