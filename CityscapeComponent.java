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
    private Land land1;
    private Building b1;
    private Window w1;
    private Building b2;
    private Building b3;
    private Window w2;
    private Window w3;
    //CityscapeComponent contructor and intiailized all instance variables
    /**
     *
     * This is the CityscapeComponent contructor and it intiailizes all instance variables
     * @param g2 the graphics context
     */
    public CityscapeComponent()
    {
     this.moon1 = new Moon(50,50,50,50, Color.WHITE);
     this.w1 = new Window(35, 325, 50, 50, Color.YELLOW);
     this.land1 =  new Land(0,500,800,300, Color.GREEN);
     this.b1 = new Building(25, 300, 100, 200, Color.MAGENTA);
     this.b2 = new Building(240, 350, 100, 150, Color.CYAN);
     this.w2 = new Window(290, 370, 35, 30, Color.YELLOW);
     this.b3 = new Building(470, 325, 100, 175, Color.RED);
     this.w3 = new Window(480, 350, 50, 40, Color.YELLOW);

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
        this.land1.drawLand(g2);
        this.b1.drawBuilding(g2);
        this.w1.drawWindow(g2);
        this.b2.drawBuilding(g2);
        this.w2.drawWindow(g2);
        this.b3.drawBuilding(g2);
        this.w3.drawWindow(g2);
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
