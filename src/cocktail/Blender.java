
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
<<<<<<< HEAD
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
=======
      int count=0;
      for(Ingredients s:ingredients)
      {
          s.getColor();
          count++;
      }


      if(count==2){

//code for tow color
          /*
          * private static Color blendColors(Color color1, Color color2, double ratio) {
    int red = (int) (color1.getRed() * (1 - ratio) + color2.getRed() * ratio);
    int green = (int) (color1.getGreen() * (1 - ratio) + color2.getGreen() * ratio);
    int blue = (int) (color1.getBlue() * (1 - ratio) + color2.getBlue() * ratio);
    return new Color(red, green, blue);
}

public static void main(String[] args) {

    Color color1 = new Color(255, 0, 124); // Red
    Color color2 = new Color(0, 255, 210); // Green
    Color color3 = new Color(0, 0, 255); // Blue
    Color color4 = new Color(255, 255, 0); // Yellow
    double ratio = 0.5; // Blend ratio
    Color blendedColor = blendColors(color1, color2, color3, color4, ratio);


    System.out.println("Blended color: " + blendedColor);

}*/

      }
      else if(count==3){
          //code for 3 color
/*import java.awt.Color;

public class ColorMixer {
    public static Color blendColors(Color color1, Color color2, Color color3, double ratio) {
        Color color12 = blendColors(color1, color2, ratio);
        return blendColors(color12, color3, ratio);
    }

    private static Color blendColors(Color color1, Color color2, double ratio) {
        int red = (int) (color1.getRed() * (1 - ratio) + color2.getRed() * ratio);
        int green = (int) (color1.getGreen() * (1 - ratio) + color2.getGreen() * ratio);
        int blue = (int) (color1.getBlue() * (1 - ratio) + color2.getBlue() * ratio);
        return new Color(red, green, blue);
    }

    public static void main(String[] args) {
        Color color1 = new Color(255, 0, 124); // Color  Red ,you can add any color you need
        Color color2 = new Color(0, 255, 210); // Color  Green
        Color color3 = new Color(0, 0, 255); // color Blue
        double ratio = 0.5; // Blend ratio
        Color blendedColor = blendColors(color1, color2, color3, ratio);

        System.out.println("Blended color: " + blendedColor);
    }
}
*/

      }
      else if(count==4){
          //code for four color
/*
* import java.awt.Color;

public class ColorMixer {
    public static Color blendColors(Color color1, Color color2, Color color3, Color color4, double ratio) {
        Color color12 = blendColors(color1, color2, ratio);
        Color color34 = blendColors(color3, color4, ratio);
        return blendColors(color12, color34, ratio);
    }

    private static Color blendColors(Color color1, Color color2, double ratio) {
        int red = (int) (color1.getRed() * (1 - ratio) + color2.getRed() * ratio);
        int green = (int) (color1.getGreen() * (1 - ratio) + color2.getGreen() * ratio);
        int blue = (int) (color1.getBlue() * (1 - ratio) + color2.getBlue() * ratio);
        return new Color(red, green, blue);
    }

    public static void main(String[] args) {

        Color color1 = new Color(255, 0, 124);
        Color color2 = new Color(0, 255, 210);
        Color color3 = new Color(0, 0, 255);
        Color color4 = new Color(255, 255, 0);
        double ratio = 0.5;
        Color blendedColor = blendColors(color1, color2, color3, color4, ratio);


        System.out.println("Blended color: " + blendedColor);

    }
}*/
      }


>>>>>>> 78c04ebc072bee560dd25bc90ac970b61976ad55
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
