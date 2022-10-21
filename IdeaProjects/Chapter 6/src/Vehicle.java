/*
 * Shreyas Potnuru
 * Chapter 06
 * Program 36
 */

public class Vehicle {
    private String manufacturer; // Instance variables
    private String owner;
    private boolean truth;

    public Vehicle(){ // Default Constructor
        manufacturer = "Unknown";
        owner = "Unknown";
        truth = false;
    }

    public Vehicle(String m, String o){ // Initialization Constructor
        manufacturer = m;
        owner = o;
        truth = false;
    }

    // get methods
    public String getManufacturer(){
        return manufacturer;
    }
    public boolean getTruth(){ return truth;}
    public String getOwner(){
        return owner;
    }

    //setter truth method
    public void setTruth(Vehicle v){
        boolean one = v.getManufacturer().equals(getManufacturer());
        boolean two = v.getOwner().equals(getOwner());
        if(one && two){ truth = true;}
    }

    // resets instance varibales in class
    public void reset(){
        manufacturer = "Unknown";
        owner = "Unknown";
        truth = false;
    }

    // toString method
    public String toString(){
        return "Vehicle Manufacturer: " + getManufacturer() + "\nOwner: " + getOwner();
    }
}
