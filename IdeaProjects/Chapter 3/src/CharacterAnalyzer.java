/*
Shreyas Potnuru
Chapter 03
Program 13
*/

import java.util.Scanner;

public class CharacterAnalyzer {

    private char theChar;
    public static Scanner console = new Scanner(System.in); //Scanner object declaration

    public static char readACharacter() {
        return console.next().charAt(0);
    }

    public CharacterAnalyzer() {
        this.theChar = '0';
    } // Default constructor

    public CharacterAnalyzer(char c) { // Initialization Constructor
        setChar(c);
    }

    public void setChar(char c) { this.theChar = c; }

    public char getChar(){ return this.theChar; }

   public boolean isUpper() {
        return this.getASCII() >= 65 && this.getASCII() <= 90;
    }

    public boolean isLower() {
        return this.getASCII() >= 97 && this.getASCII() <= 122;
    }

    public boolean isNumber() {
        return this.getASCII() >= 48 && this.getASCII() <= 57;
    }

    public int getASCII() {
        return (int) this.getChar();
    }

    public String toString() {
        String lettercase = "" ;
        if (this.isUpper())
            lettercase = "an uppercase character";
        else if (this.isLower())
            lettercase = "an lowercase character";
        else if (this.isNumber())
            lettercase = "a number";
        return this.theChar + " is " + lettercase + ". ASCII == " + this.getASCII() + ".\n";
    }

    public static void main(String[] args) {
        CharacterAnalyzer character = new CharacterAnalyzer();

        System.out.print("Enter a Character: ");
        character.setChar(readACharacter());
        System.out.println(character.toString());

        System.out.print("Enter a Character: ");
        character.setChar(readACharacter());
        System.out.println(character.toString());

        System.out.print("Enter a Character: ");
        character.setChar(readACharacter());
        System.out.println(character.toString());

        System.out.print("Enter a Character: ");
        character.setChar(readACharacter());
        System.out.println(character.toString());

        System.out.print("Enter a Character: ");
        character.setChar(readACharacter());
        System.out.println(character.toString());

        System.out.print("Enter a Character: ");
        character.setChar(readACharacter());
        System.out.println(character.toString());

        System.out.print("Enter a Character: ");
        character.setChar(readACharacter());
        System.out.println(character.toString());

        System.out.print("Enter a Character: ");
        character.setChar(readACharacter());
        System.out.println(character.toString());

        System.out.print("Enter a Character: ");
        character.setChar(readACharacter());
        System.out.println(character.toString());
    }
}
/* Output:
Enter a Character: A
A is an uppercase character. ASCII == 65.

Enter a Character: 1
1 is a number. ASCII == 49.

Enter a Character: a
a is an lowercase character. ASCII == 97.

Enter a Character: 7
7 is a number. ASCII == 55.

Enter a Character: D
D is an uppercase character. ASCII == 68.

Enter a Character: 2
2 is a number. ASCII == 50.

Enter a Character: X
X is an uppercase character. ASCII == 88.

Enter a Character: z
z is an lowercase character. ASCII == 122.

Enter a Character: 9
9 is a number. ASCII == 57.
 */