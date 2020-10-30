import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.Color;
/**
 * Constructs a target that can be positioned anywhere on the screen, and can have a speficied width and height
 *
 * @author ArjSan1
 * @version 10/23/2020
 */
public class Target
{
    // instance variables - replace the example below with your own
    private int xLeft;
    private int yTop;
    private int width;
    private int height;
    /**
     * Constructor for Target with a given top left corner.
     * @param the x coordinate of the top left corner/ the width of the ellipse
     * @param the y coordinate of the top left corner/ the height of the 
     */
    public Target(int initialX, int initialY, int initialWidth, int initialHeight)
    {
        // initialise instance variables
        this.xLeft = initialX;
        this.yTop = initialY;
        this.width = initialWidth;
        this.height = initialHeight;
    }

    /**
     * This method draws draws the target
     * @param g2 the graphics context
     */
    public void drawTarget(Graphics2D g2)
    {
        Ellipse2D.Double circle = new Ellipse2D.Double(this.xLeft, this.yTop, width, height);
        g2.setColor(Color.BLACK);
        g2.draw(circle);
        
        width = width - 50;
        height = height - 50;
        
        Ellipse2D.Double circle2 = new Ellipse2D.Double(this.xLeft, this.yTop, width, height);
        g2.setColor(Color.WHITE);
        g2.draw(circle2);
        
        width = width - 25;
        height = height - 25;
        
        Ellipse2D.Double circle3 = new Ellipse2D.Double(this.xLeft, this.yTop, width, height);
        g2.setColor(Color.BLACK);
        g2.draw(circle3);
        
    }
}
