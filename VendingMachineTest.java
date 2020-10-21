

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class VendingMachineTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class VendingMachineTest
{
    /**
     * Default constructor for test class VendingMachineTest
     */
    public VendingMachineTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
    
    @Test
    public void testFillMachine()
    {
        VendingMachine testVendingMachine = new VendingMachine();
        testVendingMachine.fillMachine(5);
        int amt = testVendingMachine.getCanAmount();
        assertEquals(15, amt);
        
      
    }
    @Test
    public void testInsertToken()
    {
        VendingMachine testVendingMachine = new VendingMachine();
        testVendingMachine.insertToken(5);
        int amt = testVendingMachine.getTokenAmount();
        assertEquals(5, amt);
    }
    @Test
    public void testVendingMachine()
    {
        VendingMachine testVendingMachine = new VendingMachine();
        int amt = testVendingMachine.getCanAmount();
        assertEquals(10, amt);
        
    }
    @Test
    public void VendingMachineTest()
    {
        VendingMachine testVendingMachine = new VendingMachine(15);
        int amt = testVendingMachine.getCanAmount();
        assertEquals(15, amt);
    }
}
