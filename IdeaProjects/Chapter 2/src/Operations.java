/*Shreyas Potnuru
* Chapter 02
* Program 9
*/

import java.util.Scanner;

public class Operations {
    private double one, two, sum, difference, product, quotient, modulus;

    public Operations() { // default constructor method
        one = 0; two = 0;
    }

    public void setNums(double num1, double num2) { // accessor method
    one = num1;
    two = num2;
    Operate();
    print();
    }

    public void Operate(){ // all math in this method
        sum = one + two;
        difference = one - two;
        product = one * two;
        quotient = one / two;
        modulus = one % two;
    }

    public void print() {
        System.out.println("Sum: " + sum + "\nDifference: " + difference + "\nProduct: " + product + "\nQuotient: " + quotient + "\nModulus: " + modulus);
    }
    public static void main (String[] args){
        Scanner user = new Scanner(System.in);
        double first, second;

        System.out.print("Please enter first double: ");
        first = user.nextDouble();
        System.out.print("Please enter second double: ");
        second = user.nextDouble();

        Operations test = new Operations();
        test.setNums(first, second);
    }
}
/* Output
Please enter first double: 3.0
Please enter second double: 4.0
Sum: 7.0
Difference: -1.0
Product: 12.0
Quotient: 0.75
Modulus: 3.0
 */
