/*
* Shreyas Potnuru
* Chapter 04
* Program 27
*/

import java.util.Scanner;

public class TriangleThree{
    private int size;
    private String letter;

    public TriangleThree(){ // Default Constructor
        this.size = 0;
        this.letter = "";
    }
    public TriangleThree(int num, String l) { // Initialization constructor
        this.size = num;
        this.letter = l;
    }

    public void setTriangle(int count, String let){ // setter method
        this.size = count;
        this.letter = let;
    }

    public String getLetter() { // getter method / create triangle
        String str = "";

        for (int i = size - 1; i >= 0; i--) {
                for (int j = 1; j <= i; j++) {
                    str += " ";
                }
                for (int let = i; let < size; let++){
                    str += this.letter;
                }
            str += "\n";
        }
        return str;
    }

    public String toString(){ // return getter method result as a string
        return getLetter();
    }
    public static void main( String[] args ) {
        TriangleThree test = new TriangleThree(3, "A");
        Scanner string = new Scanner(System.in);
        Scanner num = new Scanner(System.in);

        String answer = ""; // result of user choice to continue
        int sized = 0;
        String let = "";

        do{
            System.out.print("Enter size of triangle: ");
            sized = num.nextInt();
            System.out.print("Enter a letter: ");
            let = string.nextLine();
            System.out.println("Here is your triangle of letters!");
            test.setTriangle(sized, let);
            System.out.println(test.toString());
            System.out.print("Do you want to do it again (y/n)? ");
            answer = string.nextLine().toLowerCase();
        } while(!answer.equals("n"));
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

Do you want to do it again (y/n)? y
Enter size of triangle: 5
Enter a letter: T
Here is your triangle of letters!
    T
   TT
  TTT
 TTTT
TTTTT

Do you want to do it again (y/n)? y
Enter size of triangle: 4
Enter a letter: W
Here is your triangle of letters!
   W
  WW
 WWW
WWWW

Do you want to do it again (y/n)? n
 */
