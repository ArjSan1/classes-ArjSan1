import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.Color;
import java.awt.geom.Arc2D.Double;
import java.awt.geom.Arc2D;

/**
 * Constructs an UFO
 * @author ArjSan1
 * @version 11/20/2020
 */
public class UFO
{
    private int xLeft;
    private int yTop;
    private int width;
    private int height;
    private Color color;

    /**
     * The constructor for the UFO with a specified left corner, width, height, and color
     * @param the x coordinate of the top left corner
     * @param the width of the moon
     * @param the y coordinate of the top left corner 
     * @param the height of the moon
     * @param the color of the moon
     */
    public UFO(int initialX, int initialY, int initialWidth, int initialHeight, Color initialColor)
    {
        
        this.xLeft = initialX;
        this.yTop = initialY;
        this.width = initialWidth;
        this.height = initialHeight;
        this.color = initialColor;
    }
    /**
      Draws the UFO.
      @param g2 the graphics context
   */
    public void drawUFO(Graphics2D g2)
    {
        Ellipse2D.Double ufo1 = new Ellipse2D.Double(this.xLeft, this.yTop, width, height);
        
        g2.setColor(color);
       
        g2.fill(ufo1);
        g2.draw(ufo1);
        Arc2D.Double topUFO = new Arc2D.Double(this.xLeft+15,this.yTop-30,width-30,height+70,0,180,Arc2D.CHORD);
        g2.setColor(color);
       
        g2.fill(topUFO);
        g2.draw(topUFO);
        
        
    }
        
    
    
}