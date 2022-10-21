/*
 * Shreyas Potnuru
 * Chapter 06
 * Program 36
 */

public class Truck extends Vehicle{
    private int cylinders; // instance variables
    private double load, tow;
    private boolean truth;

    public Truck(){ // default constructor
        super();
        cylinders = 8;
        load = 0.0;
        tow = 0.0;
        truth = false;
    }

    public Truck(String man, String own, int c, double l, double t){ // initialization constructor
        super(man, own);
        cylinders = c;
        load = l;
        tow = t;
        truth = false;
    }

    // getter methods
    public int getCylinders(){
        return cylinders;
    }
    public double getLoad(){
        return load;
    }
    public double getTow(){
        return tow;
    }
    public boolean getTruth(){ return truth;}

    // sets truth values
    public void setTruth(Truck t){
        boolean one = t.getManufacturer().equals(getManufacturer());
        boolean two = t.getOwner().equals(getOwner());
        boolean tres = t.getCylinders() == getCylinders();
        boolean cuatro = t.getLoad() == getLoad();
        boolean cinco = t.getTow() == getTow();
        if(one && two && tres && cuatro && cinco){
            truth = true;
        }
    }

    // resets instance variables
    public void reset(){
        super.reset();
        cylinders = 8;
        load = 0.0;
        tow = 0.0;
        truth = false;
    }

    // toString method for instance variable intro
    public String toString(Truck truck){
        String one = super.toString() + "\nNumber of Cylinders: " + getCylinders() + "\nLoad Capacity: " + getLoad() + "\nTow Capacity: "  +getTow();
        String two = truck.toString() + "\nNumber of Cylinders: " + getCylinders() + "\nLoad Capacity: " + getLoad() + "\nTow Capacity: "  +getTow();
        if(one.equals(two)){
            return one + "\n\nIs the same truck as \n\n" + two + "\n";
        }
        return one + "\n\nIs not the same truck as \n\n" + two + "\n";
    }
}
