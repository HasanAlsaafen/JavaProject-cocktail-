
package cocktail;

import java.util.ArrayList;
import javax.swing.JOptionPane;

import java.util.*;
public  class Blender 
{

    private  double calories;
    private  double volume;
    private Color color;
    private double capasity;
    private ArrayList<Ingredients> ingredients;
 
MyLogger logger;
    public Blender() {
        ingredients=new ArrayList();
        color=new Color(0,0,0);


    }

    public Blender(double capasity ,MyLogger logger) {
        this.capasity = capasity;
        ingredients=new ArrayList();
        color=new Color(0,0,0);

    }

    public void setCapasity(double capasity) {
        this.capasity = capasity;
    }
    
    
 
  public void add(ArrayList<Ingredients> ingredients) throws BlenderOverFlowExecption
          
  {
          Date date=new Date();
          logger=new MyLogger();
         
   logger.log("\n-----------------------------------------------------------------------\n"+"at "+date.toString()+"\n");

    
         for(int i=0;i<ingredients.size();i++)
      {
  
            
          this.calories+=ingredients.get(i).getCalories();
          this .volume+=ingredients.get(i).getVolume();
          this.ingredients.add(ingredients.get(i));
     try
       {
          
       

           logger.log(ingredients.get(i).getInfo()+" is added\n");
       
      
}
catch(Exception e)
{
    JOptionPane.showMessageDialog(null, e.getMessage());
        }
      }
      
          
   

if(this.volume>this.capasity) throw new BlenderOverFlowExecption();
  };
  public  void pour(Cup cup) throws BlenderEmptyExecption
  
  {
      
   
      if(this.volume>=cup.getCapacity())
      {
  try{
       logger.log("a cup of size "+cup.getCapacity()+" is poured\n");
  }catch(Exception e)
  {
      JOptionPane.showMessageDialog(null, e.getMessage());
  }

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
try{    color.setRed(color.getRed()/ingredients.size());
        color.setBlue(color.getBlue()/ingredients.size());
        color.setGreen(color.getGreen()/ingredients.size());
        Cocktail cocktail=new Cocktail(this.calories,this.ingredients,color);
         return cocktail;
}catch(Exception e)
{
    JOptionPane.showMessageDialog(null,"there is no ingredients");
}
        return null;
       
     
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

    public double getCapasity() {
        return capasity;
    }
}
