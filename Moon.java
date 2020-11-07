import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.Color;
/**
 * Constructs a moon
 * @author ArjSan1
 * @version 11/6/2020
 */
public class Moon
{
    private int xLeft;
    private int yTop;
    private int width;
    private int height;
    private Color color;

    /**
     * The constructor for moon with a specified left corner, width, and height.
     * @param the x coordinate of the top left corner
     * @param the width of the moon
     * @param the y coordinate of the top left corner 
     * @param the height of the moon
     */
    public Moon(int initialX, int initialY, int initialWidth, int initialHeight, Color initialColor)
    {
        
        this.xLeft = initialX;
        this.yTop = initialY;
        this.width = initialWidth;
        this.height = initialHeight;
        this.color = initialColor;
    }
    
    public void drawMoon(Graphics2D g2)
    {
        Ellipse2D.Double moon1 = new Ellipse2D.Double(this.xLeft, this.yTop, width, height);
        color = Color.WHITE;
        g2.setColor(color);
       
        g2.fill(moon1);
        g2.draw(moon1);
        
    }
        
    
    
}
