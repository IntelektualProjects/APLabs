import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListFunHouse{

    public static ArrayList<Integer> getListOfFactors(int number){
        ArrayList<Integer> factors = new ArrayList<Integer>(); //new arraylist for factors of number
        for(int i = 2; i < number; i++){ //finds factors between 1 and number exclusive
            if(number % i == 0){
                factors.add(i);
            }
        }
        return factors;
    }

    public static void keepOnlyCompositeNumbers( ArrayList<Integer> nums ){
        for(int i = 0; i < nums.size(); i++){
            if(getListOfFactors(nums.get(i)).size() == 0){ //checks if num is prime or not
                nums.remove(i);
            }
        }
    }

    public static void main( String[] args )
    {
        System.out.println(ArrayListFunHouse.getListOfFactors(9));

        System.out.println(ArrayListFunHouse.getListOfFactors(23));

        System.out.println(ArrayListFunHouse.getListOfFactors(50));

        System.out.println(ArrayListFunHouse.getListOfFactors(100));

        System.out.println(ArrayListFunHouse.getListOfFactors(762));

        Integer[] nums = {2,6,8,9,10,12,13,15,17,24,55,66,78,77,79};
        ArrayList<Integer> list = new ArrayList<Integer>( Arrays.asList(nums) );

        System.out.println("Original List \n"+ list );
        ArrayListFunHouse.keepOnlyCompositeNumbers( list );
        System.out.println("Composite List \n" + list );
    }
}
/* Output:
[3]
[]
[2, 5, 10, 25]
[2, 4, 5, 10, 20, 25, 50]
[2, 3, 6, 127, 254, 381]
Original List
[2, 6, 8, 9, 10, 12, 13, 15, 17, 24, 55, 66, 78, 77, 79]
Composite List
[6, 8, 9, 10, 12, 15, 24, 55, 66, 78, 77]
*/