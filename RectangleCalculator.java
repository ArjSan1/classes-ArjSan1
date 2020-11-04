import  java.lang.Math;
import java.util.Scanner;

/**
 * Write a description of class RectangleCalculator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RectangleCalculator
{
    // instance variables - replace the example below with your own
    private double height;
    private double width;

    /**
     * Constructor for objects of class RectangleCalculator
     */
    public RectangleCalculator(double Height, double Width)
    {
        this.height = Height;
        this. width = Width;

    }

    public double getArea()
    {
        double a = height * width;
        return a;
    }

    public double getPerimeter()
    {
        double p = 2*(width + height);
        return p;
    }

    public double getDiagonalLength()
    {
        double d = (Math.pow(width, 2) + Math.pow(height, 2));
        double dl = Math.sqrt(d);
        return dl;
    }

    public String toString()
    {
        String str = "[Height: " + this.height + "; Width: " + this.width + "; Area: " + this.getArea() + "; Perimeter: "
            + this.getPerimeter() + "; Diagonal Length: " + this.getDiagonalLength()+ "]";

        return str;
    }

    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the height of the rectangle: ");
        
        double newHeight = s.nextDouble();
        
        System.out.print("Enter the width of the rectangle: ");
        
        double newWidth = s.nextDouble();
        
        RectangleCalculator rectCalc = new RectangleCalculator(newHeight, newWidth);
        
        double A = rectCalc.getArea();
        
        double P = rectCalc.getPerimeter();
        
        String S = rectCalc.toString();
        
        
        System.out.println(S);
    }

}
