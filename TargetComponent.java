import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
/**
 * This component creates the complete target
 *
 * @author ArjSan1
 * @version 10/28/2020
 */
public class TargetComponent extends JComponent

{  
   @Override
   public void paintComponent(Graphics g)
   {  
      Graphics2D g2 = (Graphics2D) g;  

      Target circle1 = new Target(200, 200, 100, 100); 
      
      
      // draw cars
      circle1.draw(g2);
      
    
   }
}