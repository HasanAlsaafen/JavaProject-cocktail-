
package cocktail;


public class Cup
{
    private  double  capacity;
   
    private double calories;

    public Cup(double capacity) {
        this.capacity = capacity;
 
    }

    public Cup() {
    }

 
    public String getInfo() {
        return "Cup{" + "capacity=" + capacity + ", volume=" + ", calories=" + calories + '}';
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
