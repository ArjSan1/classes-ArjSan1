
/**
 * Write a description of class Door here.
 *
 * @author Arjun
 * @version 10/16/20
 */
public class Door
{
    // Instance Variables
    private boolean isOpen;
    private String doorName;
    public Door(String initialDoorName , boolean initialDoorPosition)
    {
        this.doorName = initialDoorName;
        this.isOpen = initialDoorPosition;
    }
    /**
     * Sets door to open
     * 
     * 
     */
    public void open() 
    {
        
        this.isOpen = true;
       
    }
    
     /**
     * Sets door to close
     * 
     *
     */
    public void close() 
    {
        this.isOpen = false;
        
    }
    
    public boolean isDoorOpen()
    {
        return this.isOpen;
    }
    
    public void setName(String newName)
    {
        this.doorName = newName;
    }
    
    public String getName()
    {
        return this.doorName;
    }
    
}
