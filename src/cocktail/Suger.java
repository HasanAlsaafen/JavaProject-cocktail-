
package cocktail;


public class Suger extends Ingredients {

    public Suger(String name, double calories) {
        super(name, calories);
    }

    public Suger() {
    }
//
    
   
    @Override
    public String getInfo() {
        return super.getCalories()+ "calories";
    }

   
  
    
}
