import javax.swing.JFrame;

/**
 * The viewer component of the Target
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TargetViewer
{
   public static void main(String[] args)
   {
      JFrame frame = new JFrame();  // create frame object
      // set frame attributes
      frame.setSize(400, 400);
      frame.setTitle("Target");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      // initialize a CarComponent() component object
      TargetComponent component = new TargetComponent();
      // add the component to the frame
      frame.add(component);

      frame.setVisible(true);
   }
}
