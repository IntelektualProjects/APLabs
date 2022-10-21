/*
* Shreyas Potnuru
* Chapter 03
* Program 15
*/
public class WordsCompare {
    private String wordOne, wordTwo;

    public WordsCompare() { // Default Constructor
        this.wordOne = " ";
        this.wordTwo = " ";
    }
    public WordsCompare(String one, String two) { setWords(one, two); }

    public void setWords(String one, String two) { // Setter Method
        this.wordOne = one;
        this.wordTwo = two;
    }
    public int compare() { // Compares 2 strings via ASCII value
        return this.wordOne.compareTo(this.wordTwo);
    }
    public String toString() {
        if (compare() < 0)
            return this.wordOne + " should be placed before " + this.wordTwo + "\n";
        return this.wordTwo + " should be placed before " + this.wordOne + "\n";
    }
    public static void main(String [] args){
        WordsCompare words = new WordsCompare();

        words.setWords("abe", "ape");
        System.out.println(words.toString());

        words.setWords("giraffe", "gorilla");
        System.out.println(words.toString());

        words.setWords("one", "two");
        System.out.println(words.toString());

        words.setWords("fun", "funny");
        System.out.println(words.toString());

        words.setWords("123", "19");
        System.out.println(words.toString());

        words.setWords("193", "1910");
        System.out.println(words.toString());

        words.setWords("goofy", "godfather");
        System.out.println(words.toString());

        words.setWords("funnel", "fun");
        System.out.println(words.toString());
    }
}
/* Output:
abe should be placed before ape

giraffe should be placed before gorilla

one should be placed before two

fun should be placed before funny

123 should be placed before 19

1910 should be placed before 193

godfather should be placed before goofy

fun should be placed before funnel
*/