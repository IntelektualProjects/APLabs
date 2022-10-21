/*
* Shreyas Potnuru
* Chapter 06
* Program 36
*/

public class Program36Main {

    public static void main(String[] args){
        Truck uno = new Truck("Ford", "Jimmy", 6, 3000.0, 7800.0);
        Truck dos = new Truck("Honda", "Amel", 4, 250.0, 200.0);
        Truck tres = new Truck("Ford", "Jimmy", 6, 3000.0, 7800.0);
        uno.setTruth(dos);
        System.out.println(uno.toString(dos));
        uno.setTruth(tres);
        System.out.println(uno.toString(tres));

    }
}

/* Output:
Vehicle Manufacturer: Ford
Owner: Jimmy
Number of Cylinders: 6
Load Capacity: 3000.0
Tow Capacity: 7800.0

Is the same truck as

Vehicle Manufacturer: Honda
Owner: Amel
Number of Cylinders: 4
Load Capacity: 250.0
Tow Capacity: 200.0

Vehicle Manufacturer: Ford
Owner: Jimmy
Number of Cylinders: 6
Load Capacity: 3000.0
Tow Capacity: 7800.0

Is not the same truck as

Vehicle Manufacturer: Ford
Owner: Jimmy
Number of Cylinders: 6
Load Capacity: 3000.0
Tow Capacity: 7800.0
*/