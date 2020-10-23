import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.Color;
import java.lang.Object;
import javafx.scene.shape.Circle;
/**
 * Constructs a target that can be positioned anywhere on the screen
 *
 * @author ArjSan1
 * @version 10/23/2020
 */
public class Target
{
    // instance variables - replace the example below with your own
    private int xLeft;
    private int yTop;
    /**
     * Constructor for Target with a given top left corner.
     * @param the x coordinate of the top left corner
     * @param the y coordinate of the top left corner
     */
    public Target(int initialX, int initialY)
    {
        // initialise instance variables
        this.xLeft = initialX;
        this.yTop = initialY;
    }

    /**
     * This method draws the target
     *
     * @param g2 the graphics context
     */
    public void drawTarget(Graphics2D g2)
    {
        //Ellipse2D.Double firstCircle = new Ellipse2D.Double(this.xLeft, this.yTop, 100, 100);
        //firstCircle.setColor(Color.BLACK);
        //Circle firstCircle = new Circle(this.xLeft, this.yTop, 100, Color.BLACK);
        
    }
}
