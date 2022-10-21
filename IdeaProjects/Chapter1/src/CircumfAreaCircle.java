/* Shreyas Potnuru
    Chapter 1
    Program 7
 */

import java.util.Scanner;

public class CircumfAreaCircle{
    Scanner keyboard = new Scanner(System.in);
    private int radius;
    private double circumference, area;


    public void setRadius(){
        System.out.print("The radius of the circle is "); // asks for radius from user
        radius = keyboard.nextInt();
    }
    public void calculateCircumference(){
        circumference = 2 * 3.14 * radius; // calculates circumference
    }
    public void calculateArea(){
        area = 3.14 * Math.pow(radius, 2); // calculates area
    }
    public void print(){
        System.out.println("The circumference is " + circumference + ".\nThe area is " + area + ".");
    }

    public static void main(String[] args){
        CircumfAreaCircle test = new CircumfAreaCircle();
        test.setRadius();
        test.calculateCircumference();
        test.calculateArea();
        test.print();
    }
}
