/*
* Shreyas Potnuru
* Chapter 04
* Program 21
*/
public class Factorial
{
    private int number;

    public Factorial() { this.number = 0; } // Default Constructor
    public Factorial(int num) {this.number = num; } // Initialization Constructor
    public void setNum(int num) { this.number = num; } // Setter method
    public int getFactorial() { // Finds factorial of number
        int answer = 1;
        for (int i = this.number; i >= 1; i--)
            answer *= i;
        return answer;
    }
    public String toString() { // Prints value
        return this.number + "! Is " + getFactorial();
    }
    public static void main ( String[] args ) {
        Factorial num = new Factorial(5);
        System.out.println(num.toString());

        num.setNum(4);
        System.out.println(num.toString());

        num.setNum(8);
        System.out.println(num.toString());

        num.setNum(6);
        System.out.println(num.toString());

        num.setNum(9);
        System.out.println(num.toString());

        num.setNum(3);
        System.out.println(num.toString());
    }
}
/*Output:
5! Is 120
4! Is 24
8! Is 40320
6! Is 720
9! Is 362880
3! Is 6
*/