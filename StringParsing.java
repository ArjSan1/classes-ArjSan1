import java.util.Scanner;

/**
 * Write a description of class StringParsing here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StringParsing
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class StringParsing
     */
    public StringParsing(int num)
    {
        this.x = num;
    }
    
    public int getNum()
    {
        return this.x;
    }
    public String toString()
    {
        String str = ""+ this.getNum();
        return str;
    }
    public static void main(String[] args)

    {
      Scanner s = new Scanner(System.in);
      System.out.print("Please enter an integer between 1,000 and 999,999: ");
      String text = s.nextLine();
      int len = text.length();
      String firstPartOfString = text.substring(len-4);
      String secondPartOfString = text.substring(len-4, len-3);
      String string = secondPartOfString + firstPartOfString;
      System.out.println(string);
    }
}
