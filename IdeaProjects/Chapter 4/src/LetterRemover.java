/*
* Shreyas Potnuru
* Chapter 04
* Program 23
*/
public class LetterRemover{
    private String sentence;
    private String lookFor;

    public LetterRemover(){ // Default Constructor
        this.sentence = "";
        this.lookFor = "";
    }
    public LetterRemover(String words, String target){ // Initialization Constructor
        this.sentence = words;
        this.lookFor = target;
    }
    public void setRemover(String s, String rem){ // Setter Method
        this.sentence = s;
        this.lookFor = rem;
    }

    public String removeLetters(){
        int i = 0;
        String new_string = "";

        while (i <= this.sentence.length() - 1){
            if (this.sentence.substring(i, i + 1).equals(this.lookFor)){ // if letter is the target removal letter, omit from new string
                new_string += "";
            }
            else{                               // if letter is not target removal letter, add to the new string
                new_string += this.sentence.substring(i, i + 1);
            }
            i += 1;
        }
        return new_string;
    }

    public String toString(){
        return sentence + "  " + this.lookFor + "- letter to remove " + this.lookFor + "\n" + removeLetters() + "\n";
    }
    public static void main( String[] args ){
        LetterRemover string = new LetterRemover("I am Sam I am", "a");
        System.out.println(string.toString());

        string.setRemover("ssssssssxsssssesssesss", "s");
        System.out.println(string.toString());

        string.setRemover("abababababa", "b");
        System.out.println(string.toString());

        string.setRemover("aababababa", "x");
        System.out.println(string.toString());

        string.setRemover("qwertqwerty", "a");
        System.out.println(string.toString());
    }
}
/* Output:
I am Sam I am  a- letter to remove a
I m Sm I m

ssssssssxsssssesssesss  s- letter to remove s
xee

abababababa  b- letter to remove b
aaaaaa

aababababa  x- letter to remove x
aababababa

qwertqwerty  a- letter to remove a
qwertqwerty
*/