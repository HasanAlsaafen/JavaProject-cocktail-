/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cocktail;

/**
 *
 * @author حسن
 */
public class Milk extends  Ingredients{
     private Color color;
    private double volume;

    public Milk(Color color, double volume, String name, double calories) {
        super(name, calories);
        this.color = color;
        this.volume = volume;
    }

    public Milk(Color color, double volume) {
        this.color = color;
        this.volume = volume;
    }


    public Milk() {
    
    }

    public Color getColor() {
        return color;
    }

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
        return "Milk{" + "color=" + color + ", volume=" + volume + '}';
    }
}
