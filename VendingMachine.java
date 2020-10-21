
/**
 * Write a description of class VendingMachine here.
 *
 * @author ArjSan1
 * @version 10/21/2020
 */
public class VendingMachine
{   
   private int amtOfCans;
   private int amtOfTokens;
   /**
    * Intitializes the VendingMachine with 10 cans
    */
    public VendingMachine()
    {
        this.amtOfCans = 10;
        this.amtOfTokens = 0;
    }
    /**
     * Initializes the VendingMachine with a given amount of cans
     */
    public VendingMachine(int numCans)
    {
        this.amtOfCans = numCans;
        this.amtOfTokens = 0;
    }
    /**
     * Allows user to insert tokens into the the vending machine, for every token, the user gets one can
     *
     * @param the amount of tokens you would like to insert
     */
    public void insertToken(int tokenAmt)
    {
        this.amtOfTokens += tokenAmt;
        
        this.amtOfCans = this.amtOfCans-tokenAmt;
        

    }
   
    /**
     * Allows the user to fill up the machine with a specified amount of cans
     * @param the amount of cans you would like to put into the machine
     */
    public void fillMachine(int cans)
    {
        this.amtOfCans += cans;
        
        this.amtOfTokens = this.amtOfTokens-cans;

    }

    /**
     * Returns the amount of cans in the machine
     * 
     * @return the amount of cans in the machine
     */
    public int getCanAmount()
    {
        return this.amtOfCans;
    }

    /**
     * Returns the amount of tokens in the machine
     * 
     * @return the amount of tokens in the machine
     */

    public int getTokenAmount()
    {
        return this.amtOfTokens;
    }
}
/* 2.1 Methods would be insertToken - allows user to insert tokens into the machine, 
 * fillMachine- allows user to fill machine with cans, 
 * getCanAmount-returns the amount of cans ,
 * and getTokenAmount- returns the amount of tokens
 */

