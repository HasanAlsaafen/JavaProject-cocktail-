
package abstact;

public class Rectangular extends Shape
{
    private int h,w;

    public Rectangular(String name,int h, int w) {
        super(name);
        this.h = h;
        this.w = w;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    public int getW() {
        return w;
    }

    public void setW(int w) {
        this.w = w;
    }
    @Override
    public double area()
    {
        return h*w;
    }
    
    
}
