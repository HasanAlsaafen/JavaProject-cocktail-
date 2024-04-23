
package cocktail;

public class Fruits extends Ingredients 
{
    private int[] color;
    private double volume;

    public Fruits(int[] color, double volume, String name, double calories) {
        super(name, calories);
        this.color = color;
        this.volume = volume;
    }
        public Fruits() {
       
    }

    public int[] getColor() {
        return color;
    }

    public void setColor(int[] color) {
        this.color = color;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    public String getInfo() {
        return "Fruits{" + "color=" + color + ", volume=" + volume + '}';
    }
  
   
    
    

    
    
    
    
}
