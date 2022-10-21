/*
* Shreyas Potnuru
* Chapter 05
* Program 32
*/

import java.util.Arrays;
import java.util.Random;
public class Histogram{
    private int[] array;

    public Histogram(){ this.array = new int[0]; } // Default Constructor

    public Histogram(int[] array){ this.array = array; } // Initialization Constructor

    public void setArray(int[] array){ this.array = array; } // Setter method for random array

    public int[] CountInHistogram(){
        int[] values = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] count = new int[10]; // stores counts of numbers in random array
        for(int val : this.array){  // for each value in random array, compare to values 0-9
            int pos = 0;
            for(int number : values){
                if(number == val)
                    count[pos] += 1;
                else{
                    pos += 1;
                }
            }
        }
        return count;
    }

    public String toString(){ // returns count in string, readable format
        int num = 0;
        String s = Arrays.toString(this.array) + "\n";
        for(int value : CountInHistogram()){
            s += num + " - " + value + "\n";
            num++;
        }
        return s;
    }

    public static void main(String[] args) {
        Histogram test = new Histogram();
        Random random = new Random();
        int i = 1;                           // Generates 3 random arrays with required constraints
        do{
            int[] random_array = new int[random.nextInt(21)];
            for(int j = 0; j < random_array.length; j++){
                random_array[j] = random.nextInt(9);
            }
            test.setArray(random_array);
            System.out.println(test.toString());
            i++;
        } while(i < 4);
    }
}
/* Output:
[2, 2, 7, 4, 6, 1, 0, 6, 1, 3, 3, 6, 4, 7, 4, 2, 7, 8]
0 - 1
1 - 2
2 - 3
3 - 2
4 - 3
5 - 0
6 - 3
7 - 3
8 - 1
9 - 0

[8, 8]
0 - 0
1 - 0
2 - 0
3 - 0
4 - 0
5 - 0
6 - 0
7 - 0
8 - 2
9 - 0

[5, 1, 0, 1, 2, 1, 1, 4, 0, 8, 4, 0, 6]
0 - 3
1 - 4
2 - 1
3 - 0
4 - 2
5 - 1
6 - 1
7 - 0
8 - 1
9 - 0
 */