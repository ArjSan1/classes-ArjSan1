/**
 * Write a description of class Annuity here.
 *
 * @author ArjSan1
 * @version 11/4/2020
 */
public class Annuity
{
    private static double pmt;
    private static double i;
    private static int n;
    
    public static double calcPresentValue(double Pmt, double I, int N)
    {
        pmt = Pmt;
        i = I;
        n = N;
        double Pvann = pmt * (((Math.pow(1+i, n-1)-1)/i)/(Math.pow(1+i, n-1)) + 1);
        
        return Pvann;
        
    }
    
}
