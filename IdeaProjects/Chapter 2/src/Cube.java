/* Shreyas Potnuru
    Chapter 2
    Program 8
 */

public class Cube {
    int sidelength;

    public Cube() {     // Default Constructor
        sidelength = 0;
    }

    public void setSide(int s) {  // Accessor Method
        sidelength = s;
        calculateSurfaceArea();
        calculateVolume();
    }

    public void calculateSurfaceArea() {
        double surface_area = (Math.pow(sidelength, 2)) * 6;
        System.out.println("The surface area is " + surface_area);
    }
    public void calculateVolume(){
        double volume = Math.pow(sidelength, 3);
        System.out.println("The volume is " + volume + "\n");
    }

    public static void main (String []args) {
        Cube test = new Cube();
        test.setSide(112);
        test.setSide(42);
        test.setSide(11);
        test.setSide(37);

    }
}
/* Output:
The surface area is 75264.0
The volume is 1404928.0

The surface area is 10584.0
The volume is 74088.0

The surface area is 726.0
The volume is 1331.0

The surface area is 8214.0
The volume is 50653.0
 */

