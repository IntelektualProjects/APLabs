/*
* Shreyas Potnuru
* Chapter 04
* Program 17
*/
public class CoolNums {
    public static boolean isCoolNumber( int num ) { // checks if number is "cool"
        if (num % 3 == 1)
            if (num % 4 == 1)
                if (num % 5 == 1)
                    return num % 6 == 1;
        return false;
    }

    public static int countCoolNumbers( int stop ) { // Runs through every number in range for "coolness"
        int count = 0; // counter
        for (int i = 6; i <= stop; i++){   //for loop
            if (isCoolNumber(i))
                count += 1;
        }
        return count;
    }

    public static void main(String[] args) { // prints all cases
        CoolNums print = new CoolNums();
        System.out.println(print.countCoolNumbers(250) + " cool numbers between 6 - 250");
        System.out.println(print.countCoolNumbers(1250) + " cool numbers between 6 - 1250");
        System.out.println(print.countCoolNumbers(2250) + " cool numbers between 6 - 2250");
        System.out.println(print.countCoolNumbers(5500) + " cool numbers between 6 - 5500");
        System.out.println(print.countCoolNumbers(9500) + " cool numbers between 6 - 9500");
        System.out.println(print.countCoolNumbers(23500) + " cool numbers between 6 - 23500");
        System.out.println(print.countCoolNumbers(32500) + " cool numbers between 6 - 32500");
    }
}
/* Output:
4 cool numbers between 6 - 250
20 cool numbers between 6 - 1250
37 cool numbers between 6 - 2250
91 cool numbers between 6 - 5500
158 cool numbers between 6 - 9500
391 cool numbers between 6 - 23500
541 cool numbers between 6 - 32500 */