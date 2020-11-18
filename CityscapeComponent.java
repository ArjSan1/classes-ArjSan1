import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.Color;
/**
 * Class that creates instances of the classes that comprise the cityscape and delegates drawing the
 *  cityscape to these object.
 * 
 * @author ArjSan1
 * @version 11/6/2020
 */
public class CityscapeComponent extends JComponent
{
    // instance variables
    private Moon moon1;
    private Moon moon2;
    private Moon moon3;
    private Land land1;
    private Building b1;
    //CityscapeComponent contructor and intiailized all instance variables
    /**
     *
     * This is the CityscapeComponent contructor and it intiailizes all instance variables
     * @param g2 the graphics context
     */
    public CityscapeComponent()
    {
     this.moon1 = new Moon(50,50,50,50, Color.WHITE);
     this.moon2 = new Moon(100,25,50,50, Color.WHITE);
     this.moon3 = new Moon(150,50,50,50, Color.WHITE);
     this.land1 =  new Land(0,400,800,400, Color.GREEN);
     this.b1 = new Building(25, 200, 100, 200, Color.GRAY);
    }
    
    
    /**
     * This method is invoked by the Java Run-Time whenever the component needs to be redrawn.
     * It does not need to be invoked explicitly.
     * 
     * @param g a reference to the Graphics object used for all drawing operations
     *
     */
    @Override
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        
        // invoke the draw method on each object in your Cityscape
        this.moon1.drawMoon(g2);
        this.moon2.drawMoon(g2);
        this.moon3.drawMoon(g2);
        this.land1.drawLand(g2);
        this.b1.drawBuilding(g2);
    }
    
    /**
     * Animate the cityscape by updating the objects such that they appear to be animated when
     *      they are next drawn.
     *
     */
    public void nextFrame()
    {
        // update the objects in the cityscape so they are animated
        // ...
        
        
        
        // request that the Java Runtime repaints this component by invoking its paintComponent method
        //  do not explicitly invoke the paintComponent method
        repaint();
    }

}
