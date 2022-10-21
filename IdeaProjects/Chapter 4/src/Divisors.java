/*
* Shreyas Potnuru
* Chapter 04
* Program 22
*/
public class Divisors{
    public static String getDivisors( int number ){ // method to get divisors of number
        String values = ""; // empty string for divisors
        for (int i = 1; i < number; i++){
            if (number % i == 0)
                values = values + " " + i; // for every factor of number, add it to the string values
        }
        return number + " has divisors" + values; // return divisors of number in an acceptable form
    }
    public static void main( String[] args ){ // print divisors of number
        System.out.println(getDivisors(10));
        System.out.println(getDivisors(45));
        System.out.println(getDivisors(14));
        System.out.println(getDivisors(1024));
        System.out.println(getDivisors(1245));
        System.out.println(getDivisors(33));
        System.out.println(getDivisors(65535));

    }
}
/* Output:
10 has divisors 1 2 5
45 has divisors 1 3 5 9 15
14 has divisors 1 2 7
1024 has divisors 1 2 4 8 16 32 64 128 256 512
1245 has divisors 1 3 5 15 83 249 415
33 has divisors 1 3 11
65535 has divisors 1 3 5 15 17 51 85 255 257 771 1285 3855 4369 13107 21845
*/
