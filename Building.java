
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.Color;
/**
 * Constructs a building
 * @author ArjSan1
 * @version 11/6/2020
 */
public class Building
{
    private int xLeft;
    private int yTop;
    private int width;
    private int height;
    private Color color;

    /**
     * The constructor for buildings with a specified left corner, width, height, and color
     * @param the x coordinate of the top left corner
     * @param the width of the building
     * @param the y coordinate of the top left corner 
     * @param the height of the building
     * @param the color of the building
     */
    public Building(int initialX, int initialY, int initialWidth, int initialHeight, Color initialColor)
    {

        this.xLeft = initialX;
        this.yTop = initialY;
        this.width = initialWidth;
        this.height = initialHeight;
        this.color = initialColor;
    }

    /**
    Draws the building.
    @param g2 the graphics context
     */
    public void drawBuilding(Graphics2D g2)
    {
        Rectangle2D.Double b = new Rectangle2D.Double(this.xLeft, this.yTop, width, height);

        g2.setColor(color);

        g2.fill(b);
        g2.draw(b);

        
    }
}
