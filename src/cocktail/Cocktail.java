
package cocktail;
import java.util.*;

public class Cocktail {


    public static void main(String[] args) 
    {
        System.out.println("-----------------welcome to Hasan and Mohammad store for cokteil-----------------\n");
        System.out.println("do you want to make cockteil ");
        Scanner input =new Scanner(System.in);
        System.out.println("yes        No");
        String choice1;
        choice1=input.next();
        if(choice1.equalsIgnoreCase("yes"))
        {
            System.out.println("we offer you these types of friuts");
            Blender blender=new Blender();
             ArrayList<Fruits>friuts=new ArrayList<>();
              ArrayList<Milk> milk=new ArrayList<>();
              boolean flag=false;
          int choice2;
            do
            {
                  
                System.out.println("1.orange with 100 cal\n2.kiwi with 50 cal\n3.banana with 120 cal\n4.Strawbarry with 20 cal\n5.go to milk\n6.add suger\n7.blend");
                choice2=input.nextInt();
                switch(choice2)
                {
                    case 1: 
                       int[] color1={255,165,0};
                        Fruits orange=new Fruits(color1,150,"orange",100);
                        friuts.add(orange);
                        break;
                    case 2: 
                          int[] color2={0,255,0};
                        Fruits kiwi=new Fruits(color2,50,"kiwi",50);
                        friuts.add(kiwi);
          
                        break;
                    case 3:
                        int[] color3={152, 255, 0};
                        Fruits banana=new Fruits(color3,80,"banana",120);
                        friuts.add(banana);
                  
                        break;
                    case 4:
                        int[] color4={255, 80, 120};
                        Fruits strawbarry=new Fruits(color4,30,"strwabarry",20);
                        friuts.add(strawbarry);
                  
                        break;
                    case 5:
                        System.out.println("we offer you 2 tybes of milk\n1.milk\n2.Evaporated milk\n");
                        int choice3;
                        choice3=input.nextInt();
                       
                        switch(choice3)
                        {
                            case 1 -> {
                                int[] color5={255, 80, 120};
                                Milk milk1=new Milk(color5,150,"milk",200);
                                milk.add(milk1);
                           
                        }
                            case 2 -> { 
                                int []color6={250, 253, 240};
                                Milk evaporatedMilk=new Milk(color6,150,"evaporated milk",250);
                                milk.add(evaporatedMilk);
                        }
                            default -> {
                                        System.out.println("Invalid choice");
                                    }
                                
                        }

                    case 6:
                        flag=true;
                        break;
                      
                    case 7:
                        if(blender.isEmpty())System.out.println("there isn't any thing to blend");
                        else
                        {
                            try{
                                if(flag)
                             blender.add(friuts, milk, new Suger());
                                else    blender.add(friuts, milk, null);
                                blender.blend();
                            }
                            catch(BlenderFull bf)
                            {
                                System.out.println(bf.getMessage());
                            }
                           
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
                                    System.out.println("please pay to the casher");
                                    System.out.println("your cup'c color is "+blender.getColor()+"\nyour cup's calories "+cup1.getCalories()+"\nyour cup's volume is"+cup1.getVolume());
                                }
                                catch (BlenderEmpty be)
                                {
                                    System.out.println(be.getMessage());
                                }
                        }
                            case 2 -> {
                                Cup cup2=new Cup(330);
                                try{
                                    blender.pour(cup2);
                                       System.out.println("please pay to the casher");
                                    System.out.println("your cup'c color is "+blender.getColor()+"\nyour cup's calories "+cup2.getCalories()+"\nyour cup's volume is"+cup2.getVolume());
                                }
                                catch (BlenderEmpty be)
                                {
                                    System.out.println(be.getMessage());
                                }
                        }
                                      case 3 -> {
                                          Cup cup3=new Cup(500);
                                          try{
                                              blender.pour(cup3);
                                                 System.out.println("please pay to the casher");
                                    System.out.println("your cup'c color is "+blender.getColor()+"\nyour cup's calories "+cup3.getCalories()+"\nyour cup's volume is"+cup3.getVolume());
                                          }
                                          catch (BlenderEmpty be)
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
        else System.out.println("we are hoped to serve you in another time\n ");
    }
    

}
