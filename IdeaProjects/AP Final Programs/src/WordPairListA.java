// Shreyas Potnuru
// AP Program Practice 2
// WordPairs

import java.util.ArrayList;

public class WordPairListA {
    /**
     * The list of word pairs, initialized by the constructor.
     */
    private ArrayList<WordPair> allPairs;

    /**
     * Constructs a WordPairList object as described in part (a).
     * Precondition: words.length >= 2
     */
    public WordPairListA(String[] words) { // constructs legal WordPair objects and inserts them in addPairs
        allPairs = new ArrayList<>();

        for(int i = 0; i < words.length - 1; i++){
            for(int j = i + 1; j < words.length; j++){
                WordPair x = new WordPair(words[i], words[j]);
                if(!allPairs.contains(x) && i != j)
                    allPairs.add(x);
            }
        }
     }

    public String toString() {
        return allPairs.toString();
    }

     public static void main (String[]args) { // main
            String[] wordNums = {"one", "two", "three"};
            WordPairListA exampleOne = new WordPairListA(wordNums);
            System.out.println("Here is what the first ArrayList allPairs should look like: ");
            System.out.println("[(one, two), (one, three), (two, three)]");
            System.out.println("Here is what your ArrayList allPairs looks like: \n" + exampleOne);


            String[] phrase = {"the", "more", "the", "merrier"};
            WordPairListA exampleTwo = new WordPairListA(phrase);
            System.out.println("\nHere is what the second ArrayList allPairs should look like:");
            System.out.println("[(the, more), (the, the), (the, merrier), (more, the), (more, merrier), (the, merrier)]");
            System.out.println("Here is what your second ArrayList allPairs looks like: \n" + exampleTwo);

            String[] moreWords = {"the", "red", "fox", "the", "red"};
            WordPairListA exampleThree = new WordPairListA(moreWords);
            System.out.println("\nHere is what the third ArrayList allPairs should look like:");
            System.out.println("[(the, red), (the, fox), (the, the), (the, red), (red, fox), (red, the), (red, red), (fox, the), (fox, red), (the, red)]");
            System.out.println("Here is what your third ArrayList allPairs looks like: \n" + exampleThree);
        }
    }
/* Output:
Here is what the first ArrayList allPairs should look like:
[(one, two), (one, three), (two, three)]
Here is what your ArrayList allPairs looks like:
[(one, two), (one, three), (two, three)]

Here is what the second ArrayList allPairs should look like:
[(the, more), (the, the), (the, merrier), (more, the), (more, merrier), (the, merrier)]
Here is what your second ArrayList allPairs looks like:
[(the, more), (the, the), (the, merrier), (more, the), (more, merrier), (the, merrier)]

Here is what the third ArrayList allPairs should look like:
[(the, red), (the, fox), (the, the), (the, red), (red, fox), (red, the), (red, red), (fox, the), (fox, red), (the, red)]
Here is what your third ArrayList allPairs looks like:
[(the, red), (the, fox), (the, the), (the, red), (red, fox), (red, the), (red, red), (fox, the), (fox, red), (the, red)]
 */