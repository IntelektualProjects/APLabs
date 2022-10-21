/*
Shreyas Potnuru
Chapter 04
Program 26
 */

import java.util.Scanner;

public class Triangle {

    public static String createTriangle( String let, int size) { // Creates the triangle from main values
        String str = "";

        for (int i = 1; i <= size; i++){
            for (int j = 1; j <= i; j++){
                str += let;
            }
            str += "\n";
        }
        return str;
    }
    public static void main( String[] args ) {
        Scanner num = new Scanner(System.in); // scanners for numerical values and string values
        Scanner l = new Scanner(System.in);

        String answer = ""; // result of user choice to continue
        int size = 0;
        String letter = "";

        do {                                             // main do-while loop
            System.out.print("Enter size of triangle: ");
            size = num.nextInt();
            System.out.print("Enter a letter: ");
            letter = l.nextLine();
            System.out.println("Here is your triangle of letters!");
            System.out.println(createTriangle(letter, size));
            System.out.print("Do you want to do it again (y/n)? ");
            answer = l.nextLine().toLowerCase();
        } while (!answer.equals("n"));
        System.out.println("I don't like teaching geometry."); // final print statement after breaking from loop
    }

}
/* Output:
Enter size of triangle: 3
Enter a letter: A
Here is your triangle of letters!
A
AA
AAA

Do you want to do it again (y/n)? y
Enter size of triangle: 7
Enter a letter: X
Here is your triangle of letters!
X
XX
XXX
XXXX
XXXXX
XXXXXX
XXXXXXX

Do you want to do it again (y/n)? y
Enter size of triangle: 1
Enter a letter: R
Here is your triangle of letters!
R

Do you want to do it again (y/n)? n
I don't like teaching geometry.*/
