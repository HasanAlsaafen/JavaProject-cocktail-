
package cocktail;


public class Cup
{
    private  double  capacity;
    private double volume;
    private double calories;

    public Cup(double capacity) {
        this.capacity = capacity;
 
    }

    public Cup() {
    }
    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }
    public String getInfo() {
        return "Cup{" + "capacity=" + capacity + ", volume=" + volume + ", calories=" + calories + '}';
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public double getCalories() {
        return calories;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }
    






    
    
    

}
