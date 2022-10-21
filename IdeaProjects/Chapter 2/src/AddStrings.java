//Shreyas Potnuru
//Chapter 02
//Program 11

public class AddStrings
{
    private String first, last;

    public AddStrings() { //Default Constructor
        first = "";
        last = "";
    }

    public AddStrings(String one, String two) { // Initialization Constructor
        first = one;
        last = two;
    }

    public void setStrings(String one, String two) { // Accessor Method
        first = one;
        last = two;
    }

    public String add() { // add strings together
        return first + " " + last;
    }

    public int findLength() {return first.length() + last.length(); } // Find length of added string

    public String toString() { // Prints final answers to terminal
        setStrings(first, last);
        return "The \"sum\" of the words: " + add() + ".\nThe length of the name \"" + add() + "\": " + findLength() + ".";
    }

    public static void main(String[] args) {
        AddStrings nameOne = new AddStrings("Maria", "Sanchez");
        System.out.println(nameOne.toString() + "\n");
        AddStrings nameTwo = new AddStrings("Frida", "Kahlo");
        System.out.println(nameTwo.toString() + "\n");
        AddStrings nameThree = new AddStrings("Salvatore", "Dali");
        System.out.println(nameThree.toString() + "\n");
        AddStrings nameFour = new AddStrings("Ash", "Ketchum");
        System.out.println(nameFour.toString() + "\n");
    }
}
/*Output:
The "sum" of the words: Maria Sanchez.
The length of the name "Maria Sanchez": 13.

The "sum" of the words: Frida Kahlo.
The length of the name "Frida Kahlo": 11.

The "sum" of the words: Salvatore Dali.
The length of the name "Salvatore Dali": 14.

The "sum" of the words: Ash Ketchum.
The length of the name "Ash Ketchum": 11.
 */