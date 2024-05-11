
package abstact;

public class circle extends Shape {
   double radious;

    public circle(double radious, String name) {
        super(name);
        this.radious = radious;
    }

    public double getRadious() {
        return radious;
    }

    public void setRadious(double radious) {
        this.radious = radious;
    }
    public double area ()
    {
        return Math.PI*radious*radious;
    }
   
}
