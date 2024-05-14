
package cocktail;
import cocktail.exeptions.BlenderOverFlowExecption;
import cocktail.exeptions.BlenderEmptyExecption;
import java.util.*;

public class Main {


    public static void main(String[] args) 
    {
        
        
        System.out.println("-----------------welcome to Hasan and Mohammad store for cokteil-----------------\n");
        System.out.println("do you want me to make you  a cockteil ");
        Scanner input =new Scanner(System.in);
        System.out.println("yes        No");
        String choice1;
        choice1=input.next();
        if(choice1.equalsIgnoreCase("yes"))
        {
            System.out.println("we offer you these choices");
            Blender blender=new Blender();
            blender.setCapasity(2500);
            Cocktail cocktail=new Cocktail();
         ArrayList<Ingredients> ingredients=new ArrayList();
       
              int choice2;
            do
            {
                  
                System.out.println("1.orange with 100 cal\n2.kiwi with 50 cal\n3.banana with 120 cal\n4.Strawbarry with 20 cal\n5.go to milk\n6.add suger\n7.blend");
                choice2=input.nextInt();
                switch(choice2)
                {
                    case 1: 
                       Color color1=new Color(255,165,0);
                        Fruits orange=new Fruits(color1,150,"orange",100);
                        ingredients.add(orange);
                        break;
                    case 2: 
                         Color color2=new Color(0,255,0);
                        Fruits kiwi=new Fruits(color2,50,"kiwi",50);
                        ingredients.add(kiwi);
          
                        break;
                    case 3:
                        Color color3=new Color(152, 255, 0);
                        Fruits banana=new Fruits(color3,80,"banana",120);
                        ingredients.add(banana);
                  
                        break;
                    case 4:
                        Color color4=new Color(255, 80, 120);
                        Fruits strawbarry=new Fruits(color4,30,"strwabarry",20);
                        ingredients.add(strawbarry);
                  
                        break;
                    case 5:
                        System.out.println("we offer you 2 tybes of milk\n1.milk\n2.Evaporated milk\n");
                        int choice3;
                        choice3=input.nextInt();
                       
                        switch(choice3)
                        {
                            case 1 -> {
                                Color color5=new Color(255, 80, 120);
                                Milk milk1=new Milk(color5,150,"milk",200);
                                ingredients.add(milk1);
                           
                        }
                            case 2 -> { 
                                Color color6=new Color(250, 253, 240);
                                Milk evaporatedMilk=new Milk(color6,150,"evaporated milk",250);
                                ingredients.add(evaporatedMilk);
                        }
                            default -> {
                                        System.out.println("Invalid choice");
                                    }
                                
                        }

                    case 6:
                        ingredients.add(new Suger(new Color(248,240,235),0,"Suger",120));
                        break;
                      
                    case 7:
                        
                        
                        {
                            try{
                               
                             blender.add(ingredients);
                                
                               cocktail= blender.blend();
                        
                            }
                            catch(BlenderOverFlowExecption bf)
                            {
                                System.out.println(bf.getMessage());
                            }
                           
                        }
                        if(blender.isEmpty())
                        {
                            System.out.println("there isn't any thing to blend");
                            break;
                        }
                        System.out.println("choose the size of the cup\n1.250 ml\n1.330 ml\n3.500 ml");
                        int choice4;
                        choice4=input.nextInt();
                        switch(choice4)
                        {
                            case 1 -> {
                                Cup cup1=new Cup(250);
                                try{
                                    blender.pour(cup1);
                                    Color x=cocktail.getColor();                                   
                                    System.out.println("here's your pill\nthe price is 10\nplease pay to the casher");
                                    System.out.println("your cup's color is in RGB "+x.toString()+ "\nyour cup's calories "+cup1.getCalories()+"\nyour cup's volume is"+cup1.getCapacity());
                                }
                                catch (BlenderEmptyExecption be)
                                {
                                    System.out.println(be.getMessage());
                                }
                        }
                            case 2 -> {
                                Cup cup2=new Cup(330);
                                try{
                                    blender.pour(cup2);
                                       System.out.println("here's your pill\nthe price is 15 \nplease pay to the casher");
                                    System.out.println("your cup's color is "+cocktail.getColor().toString()+"\nyour cup's calories "+cup2.getCalories()+"\nyour cup's volume is"+cup2.getCapacity());
                                }
                                catch (BlenderEmptyExecption be)
                                {
                                    System.out.println(be.getMessage());
                                }
                        }
                                      case 3 -> {
                                          Cup cup3=new Cup(500);
                                          try{
                                              blender.pour(cup3);
                                                 System.out.println("here's your pill\nthe price is 20 \nplease pay to the casher");
                                    System.out.println("your cup's color is "+cocktail.getColor().toString()+"\nyour cup's calories "+cup3.getCalories()+"\nyour cup's volume is"+cup3.getCapacity());
                                          }
                                          catch (BlenderEmptyExecption be)
                                          {
                                              System.out.println(be.getMessage());
                                          }
                        }
                                      default -> System.out.println("invalid choice");
                        }
                    break;

                    default:
                        System.out.println("invalid choice");
                }
                
                
            }while(choice2!=7);
       
        }
        else if(choice1.equalsIgnoreCase("no")) System.out.println("we are hoped to serve you in another time\n ");
        else System.out.println("please enter one of these choices");
       
    }
    
}
