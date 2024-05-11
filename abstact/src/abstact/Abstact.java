
package abstact;


public class Abstact {

    public static void main(String[] args)
    {
   
      
        Shape rectangle =new Rectangular("abcd",2,3);
        Shape circle =new circle(1,"unit circle");
        Shape square=new Square("wxyz",2,2);
        System.out.println("this is your circle details :\n");
        System.out.println("name is "+circle.getName()+" the area is "+ circle.area());
        System.out.println("");
          System.out.println("this is your square details :\n");
        System.out.println("name is "+square.getName()+" the area is "+ square.area());
            System.out.println("");
          System.out.println("this is your rectangle details :\n");
        System.out.println("name is "+rectangle.getName()+" the area is "+ rectangle.area());
            System.out.println("");
        
    }
    
}
