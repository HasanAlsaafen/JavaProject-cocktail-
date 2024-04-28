
package cocktail;

public class Fruits extends Ingredients
{
    private Color color;
    private double volume;

    public Fruits(Color color, double volume, String name, double calories) {
        super(name, calories);
        this.color = color;
        this.volume = volume;
    }
        public Fruits() {
       
            
    }

    @Override
    public Color getColor() {
        return color;
    }

    @Override
    public void setColor(Color color) {
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
