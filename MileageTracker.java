
/**
 * This class models a mileage tracker for a car.
 *
 * @author ArjSan1
 * @version 10 October 2020
 */
public class MileageTracker
{
    /* 2. 
     * Define Instance variables
     * specify public vs private
     * specify type
     * specify name
     * Instance variables are:
     * scoped to the class
     * automatically initialized
     * don't initialize at first
     */
  
    private double milesDriven; // in units of miles
    private double fuelConsumed; // in units of gallons
    private String vin; // vehicle identification number
    
    /* 3. Define Contructor:
     *  initalizes objects
     *  invoked using new operator
     *  name is same name of the class
     *  no return type, not even void
     *  
     */
    /**
     * Default constructor for the MileageTracker class.
     *  Initializes the miles driven and fuel consumed to zero and the vin to null
     */
    public MileageTracker()
    {
        /*
         * Use this to reference the current object
         * Its usage is encouraged but not always required.
         */
        this.milesDriven = 0;
        this.fuelConsumed = 0;
        this.vin = null;
    }
    /**
     * Constructs a new MileageTracker object with the specified miles driven and fuel consumes
     * @param InitialMilesDriven the # of miles already driven
     * @param InitialFuelConsumed the # of gallons of fuel already consumed
     */
    public MileageTracker(double initialMilesDriven, double initialFuelConsumed)
    {
        this.milesDriven = initialMilesDriven;
        this.fuelConsumed = initialFuelConsumed;
        this.vin = null;
    }
    
    /* 1. Define methods by specifying:
     * visibily
     * return-type
     * methood name
     * paramaters and their types
     */

    /**
     * increment the # of miles that the car has driven
     * 
     * @param miles, the additional distance, in miles, this car has driven
     */
    public  void  incrementMilesDriven(double miles)
    {
        this.milesDriven += miles;
    }
    /**
     * Returns the # of miles the car has driven
     * 
     * @return the the total # of miles driven
     */
    public double getMilesDriven()
    {
        
        return this.milesDriven;
      
    }
    
    
    
    /**
     * Increment the number of gallons of fuel that this car has consumed
     * 
     * @param gallons    the additional fuel, in gallons, this car has consumed
     */
    public void incrementFuelConsumed(double gallons)
    {
        this.fuelConsumed += gallons;
        
    }
    
    /**
     * Returns the total number of gallons of fuel consumed
     * 
     * @return the total number of gallons of fuel consumed
     */
    public double getFuelConsumed()
    {
        return this.fuelConsumed;
    }
    
    
    /**
     * Returns the current mileage, in miles per gallon
     * 
     * @return the current mileage, in miles per gallon
     */
    public double getMileage()
    {
        return this.milesDriven / this.fuelConsumed;
    }
    
    /**
     * Returns the vehicle identification (VIN) of this car.
     * 
     * @return the vehicle identification (VIN) of this car
     */
    public String getVIN()
    {
        return this.vin;
    }
    
    /**
     * Sets the vehicle identification (VIN) of this car.
     * 
     * @param newVIN    the vehicle identification (VIN) of this car
     */
    public void setVIN(String newVIN)
    {
        /* 
         * If parameter was named vin, it would "shadow" the instance variable vin
         * Local and parameter variables "shadow" Instance variables of the same name
         * In this code, vin would refer to the parameter and not the instance variable
         * To refer explicitly to an instance variable, use "this"
         * Advice: avoid this issue by giving local, parameter, and instance variables unique names;
         */
        
        this.vin = newVIN;
    }
}






