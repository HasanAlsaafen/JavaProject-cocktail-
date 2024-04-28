/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cocktail;

/**
 *
 * @author حسن
 */
public class Suger extends Ingredients{
       private Color color;

    /**
     *
     * @return
     */
    @Override
    public Color getColor() {
        return color;
    }
       

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
