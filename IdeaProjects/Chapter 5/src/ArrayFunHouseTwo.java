/*
* Shreyas Potnuru
* Chapter 05
* Program 30
*/

import java.util.Arrays;

public class ArrayFunHouseTwo{

    public static boolean goingUp(int[] numArray){
        int val = numArray[0]; // holds previous value in array for every cycle of for loop
        for (int value : numArray) {
            if (value < val) {
                return false;
            }
            val = value;
        }
        return true;
    }

    public static boolean goingDown(int[] numArray){
        int val = numArray[0]; // hold previous value in array for every cycle of loop
        for (int value : numArray) {
            if (value > val) {
                return false;
            }
            val = value;
        }
        return true;
    }


    public static int[] getCountValuesBiggerThanX(int[] numArray, int count, int x){
        int[] list = new int[count]; // new list for return
        int position = 0;

        for (int value : numArray) {
            if (position == list.length) { // breaks out of loop if the position in list equals amount of values needed
                break;
            }
            if (value > x) {
                list[position] = value;
                position++;
            }
        }
        return list;
    }

    public static void main( String[] args )
    {
        int[] one = {1,2,3,4,5,6,7,8,9,10};
        int[] two = {1,2,3,9,11,20,30};
        int[] three = {9, 8, 7, 6, 5, 4, 3, 2, 0, -2};
        int[] four = {3,6,9,12,15,18,21,23,19,17,15,13,11,10,9,6,3,2,1,0};

        System.out.println(Arrays.toString(one));
        System.out.println("is going Up ? " + goingUp(one));
        System.out.println(Arrays.toString(two));
        System.out.println("is going Up ? " + goingUp(two));
        System.out.println(Arrays.toString(three));
        System.out.println("is going Up ? " + goingUp(three));
        System.out.println(Arrays.toString(four));
        System.out.println("is going Up ? " + goingUp(four));
        System.out.println(Arrays.toString(one));
        System.out.println("is going Down ? " + goingDown(one));
        System.out.println(Arrays.toString(two));
        System.out.println("is going Down ? " + goingDown(two));
        System.out.println(Arrays.toString(three));
        System.out.println("is going Down ? " + goingDown(three));
        System.out.println(Arrays.toString(four));
        System.out.println("is going Down ? " + goingDown(four));

        System.out.println(Arrays.toString(four));
        System.out.println("first 7 values greater than 9 " + Arrays.toString(getCountValuesBiggerThanX(four, 7, 9)));
        System.out.println("first 5 values greater than 15 " + Arrays.toString(getCountValuesBiggerThanX(four, 5, 15)));
    }
}
/* Output:
[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
is going Up ? true
[1, 2, 3, 9, 11, 20, 30]
is going Up ? true
[9, 8, 7, 6, 5, 4, 3, 2, 0, -2]
is going Up ? false
[3, 6, 9, 12, 15, 18, 21, 23, 19, 17, 15, 13, 11, 10, 9, 6, 3, 2, 1, 0]
is going Up ? false
[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
is going Down ? false
[1, 2, 3, 9, 11, 20, 30]
is going Down ? false
[9, 8, 7, 6, 5, 4, 3, 2, 0, -2]
is going Down ? true
[3, 6, 9, 12, 15, 18, 21, 23, 19, 17, 15, 13, 11, 10, 9, 6, 3, 2, 1, 0]
is going Down ? false
[3, 6, 9, 12, 15, 18, 21, 23, 19, 17, 15, 13, 11, 10, 9, 6, 3, 2, 1, 0]
first 7 values greater than 9 [12, 15, 18, 21, 23, 19, 17]
first 5 values greater than 15 [18, 21, 23, 19, 17]
*/