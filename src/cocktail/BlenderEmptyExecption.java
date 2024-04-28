
package cocktail;


public class BlenderEmptyExecption extends Exception
{
    @Override
    public String getMessage() {
        return "the blender doesnot have that quantity!";  
}
    
}
