/* Shreyas Potnuru
    Chapter 1
    Program 6
 */

import java.util.Scanner;

public class PerimeterAreaRec {

        Scanner keyboard = new Scanner(System.in);
        private int length;
        private int width;
        private int perimeter;
        private int area;

        public void setLengthWidth(){
            System.out.print("The length of the rectangle is ");
            length = keyboard.nextInt();
            System.out.print("The width of the rectangle is ");
            width = keyboard.nextInt();

        }
        public void calculatePerimeter(){
            perimeter = 2 * (length + width); // calculates perimeter of rectangle
        }
        public void calculateArea(){
            area = length * width; // calculates area of rectangle
        }
        public void print(){
            System.out.println("The perimeter is " + perimeter + ".");
            System.out.println("The area is " + area + ".");

        }
        public static void main(String[] args) {
            PerimeterAreaRec test = new PerimeterAreaRec();
            test.setLengthWidth();
            test.calculatePerimeter();
            test.calculateArea();
            test.print();
        }
}
