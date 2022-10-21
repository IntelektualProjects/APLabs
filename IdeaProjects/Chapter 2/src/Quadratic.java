/*Shreyas Potnuru
* Chapter 02
* Program 10
*/

import java.util.Scanner;
public class Quadratic
{
    private int a, b, c;
    private double rootOne, rootTwo;

    public Quadratic() { // Default constructor
        a = 1;
        b = 0;
        c = 0;
        rootOne = 0;
        rootTwo = 0;
    }

    public Quadratic(int quadA, int quadB, int quadC) { // Initialization Constructor
        a = quadA;
        b = quadB;
        c = quadC;
    }

    public void setEquation(int quadA, int quadB, int quadC) { // Controls process of code
        a = quadA;
        b = quadB;
        c = quadC;
        calcRoots();
        print();
    }

    public void calcRoots( ) {
        rootOne = (-b + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
        rootTwo = (-b - Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
    }

    public void print( ) {
        System.out.println("Root One: " + rootOne + "\nRoot Two: " + rootTwo);
    }

    public static void main( String[] args ) {
        Scanner input = new Scanner(System.in);
        int first, second, third;

        System.out.print("First Term Coefficient: ");
        first = input.nextInt();
        System.out.print("Second term Coefficient: ");
        second = input.nextInt();
        System.out.print("Third term: ");
        third = input.nextInt();

        Quadratic solution = new Quadratic(first, second, third);
        solution.setEquation(first, second, third);

    }
}
/* Output 1:
First Term Coefficient: 5
Second term Coefficient: -8
Third term: 3
Root One: 1.0
Root Two: 0.6
 */
/* Output 2:
First Term Coefficient: 3
Second term Coefficient: 2
Third term: -7
Root One: 1.2301385866078098
Root Two: -1.8968052532744766
 */
/* Output 3:
First Term Coefficient: 9
Second term Coefficient: 6
Third term: 1
Root One: -0.3333333333333333
Root Two: -0.3333333333333333
 */