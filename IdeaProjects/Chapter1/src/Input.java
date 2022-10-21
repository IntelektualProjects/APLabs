/* Shreyas Potnuru
    Chapter 01
    Program 5
 */

import java.util.Scanner;

public class Input {
    public static void main (String[] args) {

        Scanner keyboard = new Scanner(System.in); // scanner initialization

        int intOne, intTwo;  // variables
        double doubleOne, doubleTwo;
        float floatOne, floatTwo;
        short shortOne, shortTwo;

        //requests for input variables
        System.out.print("\nEnter an integer :: ");
        intOne = keyboard.nextInt();
        System.out.print("Enter an integer :: ");
        intTwo = keyboard.nextInt();
        System.out.print("\nEnter a double :: ");
        doubleOne = keyboard.nextDouble();
        System.out.print("Enter a double :: ");
        doubleTwo = keyboard.nextDouble();
        System.out.print("\nEnter a float one :: ");
        floatOne = keyboard.nextFloat();
        System.out.print("Enter a float two :: ");
        floatTwo = keyboard.nextFloat();
        System.out.print("\nEnter a short one :: ");
        shortOne = keyboard.nextShort();
        System.out.print("Enter a short two :: ");
        shortTwo = keyboard.nextShort();


        System.out.println("\ninteger one = " + intOne ); // integer outputs
        System.out.println("integer two = " + intTwo );
        System.out.println("\n\tdouble one = " + doubleOne); // double outputs
        System.out.println("\tdouble two = " + doubleTwo);
        System.out.println("\n\tfloat one = " + floatOne); // float outputs
        System.out.println("\tfloat two = " + floatTwo);
        System.out.println("\n\tshort one = " + shortOne); // short outputs
        System.out.println("\tshort two = " + shortTwo);


    }

}
