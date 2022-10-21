// Shreyas Potnuru
// Chapter 05
// Program 31

import java.util.Arrays;
import java.util.Random;

public class OddsAndEvens{
    public static int[] getAllEvens(int[] array){
        int count = 0;

        for (int item : array) { // count mount of even numbers in the array
            if (item % 2 == 0)
                count += 1;
        }

        int[] evens = new int[count];
        int position = 0;

        for (int value : array) { // fill each position in the new array by checking for evens in previous array
            if (value % 2 == 0) {
                evens[position] = value;
                position++;
            }
        }
        return evens;
    }

    public static int[] getAllOdds(int[] array){
        int[] odds = new int[array.length - getAllEvens(array).length]; // make array of odds by subtracting total even numbers from total
        int position = 0;

        for (int value : array) { // Fill array of odd numbers based on previously defined array
            if (value % 2 != 0){
                odds[position] = value;
                position++;
            }
        }
        return odds;
    }

    public static void main( String[] args ) {
    Random random = new Random();
    int[] array = new int[random.nextInt(21)]; // finds random number from 1, 20
    for(int i = 0; i < array.length; i++)             // fills each spot in array with value from 1-100
        array[i] = random.nextInt(101);

    System.out.println("Odds = " + Arrays.toString(getAllOdds(array)));
    System.out.println("Evens = " + Arrays.toString(getAllEvens(array)));

    }
}
/* Outputs:
Odds = [25, 45, 71, 37, 13, 35, 29]
Evens = [48, 58, 64, 40, 62, 4, 86, 26, 34]

Odds = [53, 9, 63, 49, 97, 47]
Evens = [88, 70, 4, 20, 96, 66, 74, 64, 68, 4]

Odds = [15, 85, 93, 93, 47, 23, 33, 33, 83, 93, 29, 65]
Evens = [98, 64, 2, 90, 50]
 */