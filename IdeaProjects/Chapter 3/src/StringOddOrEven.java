/*
* Shreyas Potnuru
* Chapter 03
* Program 14
*/

import java.util.Scanner;

public class StringOddOrEven {
    private String word;

    public StringOddOrEven(){ this.word = ""; } // Default Constructor

    public StringOddOrEven(String s){ setString(s); } // Initialization Constructor

    public void setString(String s){ this.word = s; } // Setter Method

    public boolean isEven(){
        return this.word.length() % 2 == 0;
    }

    public String toString(){ //print method
        if (isEven())
            return this.word + " is even.\n";
        return this.word + " is odd.\n";
    }
    public static void main( String[] args ){
        Scanner keyboard = new Scanner(System.in);
        StringOddOrEven thing = new StringOddOrEven();

        System.out.print("Enter a word: ");
        thing.setString(keyboard.nextLine());
        System.out.println(thing.toString());

        System.out.print("Enter a word: ");
        thing.setString(keyboard.nextLine());
        System.out.println(thing.toString());

        System.out.print("Enter a word: ");
        thing.setString(keyboard.nextLine());
        System.out.println(thing.toString());

        System.out.print("Enter a word: ");
        thing.setString(keyboard.nextLine());
        System.out.println(thing.toString());

        System.out.print("Enter a word: ");
        thing.setString(keyboard.nextLine());
        System.out.println(thing.toString());

        System.out.print("Enter a word: ");
        thing.setString(keyboard.nextLine());
        System.out.println(thing.toString());

        System.out.print("Enter a word: ");
        thing.setString(keyboard.nextLine());
        System.out.println(thing.toString());

        System.out.print("Enter a word: ");
        thing.setString(keyboard.nextLine());
        System.out.println(thing.toString());
    }
}
/* Output:
Enter a word: cat
cat is odd.

Enter a word: boot
boot is even.

Enter a word: it
it is even.

Enter a word: a
a is odd.

Enter a word: eleven
eleven is even.

Enter a word: thirteen
thirteen is even.

Enter a word: odd
odd is odd.

Enter a word: even
even is even.
 */