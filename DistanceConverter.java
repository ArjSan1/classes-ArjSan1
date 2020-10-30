import java.util.Scanner;

/**
 * Write a description of class DistanceConverter here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DistanceConverter
{
   public static void main(String[] args)
   {
      Scanner s = new Scanner(System.in);
      System.out.print("Enter the number of yards to be converted to feet and inches: ");
      
      
      final double NUMBER_OF_FEET_IN_A_YARD = 3;
      final double NUMBER_OF_INCHES_IN_A_FOOT = 12;
      double yards = s.nextDouble();
      double feet = yards * NUMBER_OF_FEET_IN_A_YARD;
      double inches = feet * NUMBER_OF_INCHES_IN_A_FOOT;

      System.out.println(yards + " yards are " + feet + " feet");
      System.out.println(yards + " yards are " + inches + " inches");
   }
}