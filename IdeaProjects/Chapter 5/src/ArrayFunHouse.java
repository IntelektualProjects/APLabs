/*
* Shreyas Potnuru
* Chapter 05
* Program 29
*/

import java.util.Arrays;

public class ArrayFunHouse{
    public static int getSum(int[] numArray, int start, int stop){
        int sum = 0;
        for(int i = start; i <= stop; i++){
            sum += numArray[i];
        }
        return sum;
    }
    //getCount() will return number of times val is present
    public static int getCount(int[] numArray, int val){
        int count = 0;
        for (int value : numArray) {
            if (value == val)
                count += 1;
        }
        return count;
    }
    public static int[] removeVal(int[] numArray, int val){
        int[] list = new int[numArray.length - getCount(numArray, val)];
        int position = 0;

        for (int value : numArray) {
            if (value != val) {
                list[position] = value;
                position += 1;
            }
        }
        return list;
    }



    public static void main(String[] args) {

        //arrays
        int[] one = {7, 4, 10, 0, 1, 7, 6, 5, 3, 2, 9, 7};

        int[] two = {7, 4, 2, 7, 3, 4, 6, 7, 8, 9, 7, 0, 10, 0, 1, 7, 6, 5, 7, 3, 2, 7, 9, 9, 8, 7};
        //add test cases

        System.out.println(Arrays.toString(one));
        System.out.println("sum of spots 3 - 6 = " + ArrayFunHouse.getSum(one, 3, 6));
        System.out.println("sum of spots 2 - 9 = " + ArrayFunHouse.getSum(one, 2, 9));
        System.out.println("# of 4s = " + ArrayFunHouse.getCount(one, 4));
        System.out.println("# of 9s = " + ArrayFunHouse.getCount(one, 9));
        System.out.println("# of 7s = " + ArrayFunHouse.getCount(one, 7));
        System.out.println("New array with all the 7s removed = " + Arrays.toString(ArrayFunHouse.removeVal(one, 7)));
        System.out.println("# of 7s = " +  ArrayFunHouse.getCount(ArrayFunHouse.removeVal(one, 7),7));

        //space do it all again for the second array
        System.out.println("");

        System.out.println(Arrays.toString(two));
        System.out.println("sum of spots 3 - 16 = " + ArrayFunHouse.getSum(two, 3, 16));
        System.out.println("sum of spots 2 - 9 = " + ArrayFunHouse.getSum(two, 2, 9));
        System.out.println("# of 0s = " + ArrayFunHouse.getCount(two, 0));
        System.out.println("# of 3s = " + ArrayFunHouse.getCount(two, 3));
        System.out.println("# of 7s = " + ArrayFunHouse.getCount(two, 7));
        System.out.println("New array with all the 7s removed = " + Arrays.toString(ArrayFunHouse.removeVal(two, 7)));
        System.out.println("# of 7s = " +  ArrayFunHouse.getCount(ArrayFunHouse.removeVal(two, 7),7));
    }
}
/* Output:
[7, 4, 10, 0, 1, 7, 6, 5, 3, 2, 9, 7]
sum of spots 3 - 6 = 14
sum of spots 2 - 9 = 34
# of 4s = 1
# of 9s = 1
# of 7s = 3
New array with all the 7s removed = [4, 10, 0, 1, 6, 5, 3, 2, 9]
# of 7s = 0

[7, 4, 2, 7, 3, 4, 6, 7, 8, 9, 7, 0, 10, 0, 1, 7, 6, 5, 7, 3, 2, 7, 9, 9, 8, 7]
sum of spots 3 - 16 = 75
sum of spots 2 - 9 = 46
# of 0s = 2
# of 3s = 2
# of 7s = 8
New array with all the 7s removed = [4, 2, 3, 4, 6, 8, 9, 0, 10, 0, 1, 6, 5, 3, 2, 9, 9, 8]
# of 7s = 0
 */