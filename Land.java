import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.Color;
/**
 * Constructs the land
 * @author ArjSan1
 * @version 11/13/2020
 */
public class Land
{
    // instance variables \
    private int xLeft;
    private int yTop;
    private int width;
    private int height;
    private Color color;
/**
    The constructor for land with a specified left corner, width, height, and color
     * @param the x coordinate of the top left corner
     * @param the width of the land
     * @param the y coordinate of the top left corner 
     * @param the height of the land
     * @param the color of the land
     */
    public Land(int initialX, int initialY, int initialWidth, int initialHeight, Color initialColor)
    {
        
        this.xLeft = initialX;
        this.yTop = initialY;
        this.width = initialWidth;
        this.height = initialHeight;
        this.color = initialColor;
    }

    /**
      Draws the land.
      @param g2 the graphics context
   */
   public void drawLand(Graphics2D g2)
    {
        Rectangle2D.Double land1 = new Rectangle2D.Double(this.xLeft, this.yTop, width, height);
        
        g2.setColor(color);
       
        g2.fill(land1);
        g2.draw(land1);
        
    }
}
