
package cocktail;


public class Suger extends Ingredients {
    private Color color;

    @Override
    public void setColor(Color c) {
       this.color=new Color(248,240,235);
    }

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
