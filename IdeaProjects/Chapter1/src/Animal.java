/*
* Shreyas Potnuru
* Chapter 01
* Program 3 (Extra)
*/

public class Animal {
    public static void main(String[] args) {
        String reset = "\u001b[0m";
        String green = "\u001b[32m";
        String purple = "\u001b[35m";
        String cyan = "\u001b[36m";

        System.out.println(cyan + "\t   Turtle" + reset);
        System.out.println(green + "      __________" + reset);
        System.out.println(green + "     /||||||||||\\" + reset);
        System.out.println(green + "  |'||||||||||||||" + reset);
        System.out.println(green + "     |||     |||" + reset);
        System.out.println(purple + "\tBy Shreyas Potnuru" + reset);
        
    }
}
/* Output:
    	Turtle
      __________
     /||||||||||\
  |'||||||||||||||
     |||     |||
	By Shreyas Potnuru
 */