/*
* Shreyas Potnuru
* Chapter 04
* Program 18
*/
public class TriangleOne {
    private String word;

    public TriangleOne() { this.word = ""; } // Default constructor

    public TriangleOne(String s) { setWord(s); } // initialization Constructor

    public void setWord(String s) { this.word = s; }

    public String getWord(String s){ return this.word = s;}

    public void print() { // Prints entire triangle
        for (int i = getWord(this.word).length(); i >= 0; i -= 1){ // prints substring of word with constantly decreasing final index value
            System.out.println(getWord(this.word).substring(0, i));
        }
    }
    public static void main ( String[] args ) {
        TriangleOne triangle = new TriangleOne(""); // Class Object
        triangle.setWord("hippo");
        triangle.print();

        triangle.setWord("abcd");
        triangle.print();

        triangle.setWord("it");
        triangle.print();

        triangle.setWord("a");
        triangle.print();

        triangle.setWord("chicken");
        triangle.print();
    }
}
/* Output:
hippo
hipp
hip
hi
h

abcd
abc
ab
a

it
i

a

chicken
chicke
chick
chic
chi
ch
c
 */
