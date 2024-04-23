
package cocktail;
import java.util.*;

public class Cocktail {


    public static void main(String[] args) 
    {
Blender b1=new Blender();
int[] x={0,1,2};
Fruits orange=new Fruits(x,900,"orange",500);
Fruits apple=new Fruits(x,900,"apple",100);
Fruits bannana=new Fruits(x,900,"bannana",200);
Fruits strwpary=new Fruits(x,900,"strwpary",300);
ArrayList<Fruits> f=new ArrayList<>();
f.add(apple);
f.add(orange);
f.add(bannana);
f.add(strwpary);
Milk milk =new Milk(x,100,"milk",100);
Suger suger=new Suger("suger",100);

try{
  
    b1.add(f,milk,suger);
}
catch(BlenderFull b)
        {
            System.out.println(b.getMessage());
        }
        System.out.println("5");
  
    }
    
   
    
}
