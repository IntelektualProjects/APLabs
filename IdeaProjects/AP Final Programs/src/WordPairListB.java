// Shreyas Potnuru
// AP Program Practice 2
// WordPairs

import java.util.*;
public class WordPairListB {
    /** The list of word pairs, initialized by the constructor. */
    private ArrayList<WordPair> allPairs;

    /** Put your answer to part a below please
     */
    public WordPairListB(String[] words) { // constructs legal WordPair objects and inserts them in addPairs
        allPairs = new ArrayList<>();

        for(int i = 0; i < words.length - 1; i++){
            for(int j = i + 1; j < words.length; j++){
                WordPair x = new WordPair(words[i], words[j]);
                if(!allPairs.contains(x) && i != j)
                    allPairs.add(x);
            }
        }
    }

    /** Returns the number of matches as described in part (b).
     */
    public int numMatches()  { // checks if first string equals second and increments a counter
        int count = 0;
        for(WordPair w : allPairs){
            if(w.getFirst().equals(w.getSecond()))
                count += 1;
        }
        return count; // return counter
    }
    /********************** Test *************************/

    public String toString() { return allPairs.toString(); }

    public static void main(String[] args){ // main
        String[] wordNums = {"one", "two", "three"};
        WordPairListB exampleOne = new WordPairListB(wordNums);
        System.out.println("This run should have zero matches. You got: " + exampleOne.numMatches());

        String[] phrase = {"the", "more", "the", "merrier"};
        WordPairListB exampleTwo = new WordPairListB(phrase);
        System.out.println("This run should have one match. You got: " + exampleTwo.numMatches());

        String[] moreWords = {"the", "red", "fox", "the", "red"};
        WordPairListB exampleThree = new WordPairListB(moreWords);
        System.out.println("This run should have two matches. You got: " + exampleThree.numMatches());
    }
}

/* Output:
This run should have zero matches. You got: 0
This run should have one match. You got: 1
This run should have two matches. You got: 2
 */

