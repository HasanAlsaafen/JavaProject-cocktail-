
package cocktail;


public class BlenderEmpty extends Exception
{
    @Override
    public String getMessage() {
        return "the blender doesnot have that quantity!";  
}
    
}
