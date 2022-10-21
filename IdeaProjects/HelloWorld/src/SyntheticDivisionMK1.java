/*
* This program allows for synthetic division of up to 4th degree polynomials. Its not really practical but it works lol
*
* Made by OptionalFinalGuy
*/

import java.util.Scanner;

public class SyntheticDivisionMK1 {
    private int one, two, three, four, five, divisor;

    public void setNums(int a, int b, int c, int d, int e, int div){
        this.one = a;
        this.two = b;
        this.three = c;
        this.four = d;
        this.five = e;
        this.divisor = div;
    }
    public String TwoTermCalculator(){
        if (this.one == 0 && this.two == 0 && this.three == 0)
            return "Not Possible. Already a Factor";
        else if (this.one == 0){
            int term1 = this.two;
            int term2 = this.three + (term1 * this.divisor);
            int term3 = this.four + (term2 * this.divisor);
            int remainder = this.five + (term3 * this.divisor);
            return "\nTerm 1 (3th Degree) = " + term1 + "\nTerm 2 (2nd Degree) = " + term2 + "\nTerm 3 (1st Degree) = " + term3 + "\nRemainder = " + remainder;
        }
        else{
            int term1 = this.one;
            int term2 = this.two + (term1 * this.divisor);
            int term3 = this.three + (term2 * this.divisor);
            int term4 = this.four + (term3 * this.divisor);
            int remainder = this.five + (term4 * this.divisor);

            return "\nTerm 1 = " + term1 + "\nTerm 2 = " + term2 + "\nTerm 3 = " + term3 + "\nTerm 4 = " + term4 + "\nRemainder = " + remainder;
        }
    }
    public String ThreeTermCalculator(){
        if (this.one == 0 && this.two == 0){
            int term1 = this.three;
            int term2 = this.four + (term1 * this.divisor);
            int remainder = this.five + (term2 * this.divisor);
            return "\nTerm 1 (3th Degree) = " + term1 + "\nTerm 2 (2nd Degree) = " + term2 + "\nRemainder = " + remainder;
        }
        else if (this.one == 0){
            int term1 = this.two;
            int term2 = this.three + (term1 * this.divisor);
            int term3 = this.four + (term2 * this.divisor);
            int remainder = this.five + (term3 * this.divisor);
            return "\nTerm 1 (3th Degree) = " + term1 + "\nTerm 2 (2nd Degree) = " + term2 + "\nTerm 3 (1st Degree) = " + term3 + "\nRemainder = " + remainder;
        }
        else{
            int term1 = this.one;
            int term2 = this.two + (term1 * this.divisor);
            int term3 = this.three + (term2 * this.divisor);
            int term4 = this.four + (term3 * this.divisor);
            int remainder = this.five + (term4 * this.divisor);

            return "\nTerm 1 = " + term1 + "\nTerm 2 = " + term2 + "\nTerm 3 = " + term3 + "\nTerm 4 = " + term4 + "\nRemainder = " + remainder;
            }
    }
    public String FourTermCalculator(){
        if (this.one == 0){
            int term1 = this.two;
            int term2 = this.three + (term1 * this.divisor);
            int term3 = this.four + (term2 * this.divisor);
            int remainder = this.five + (term3 * this.divisor);
            return "\nTerm 1 = " + term1 + "\nTerm 2 = " + term2 + "\nTerm 3 = " + term3 + "\nRemainder = " + remainder;
        }
        int term1 = this.one;
        int term2 = this.two + (term1 * this.divisor);
        int term3 = this.three + (term2 * this.divisor);
        int term4 = this.four + (term3 * this.divisor);
        int remainder = this.five + (term4 * this.divisor);

        return "\nTerm 1 = " + term1 + "\nTerm 2 = " + term2 + "\nTerm 3 = " + term3 + "\nTerm 4 = " + term4 + "\nRemainder = " + remainder;

    }
    public String FiveTermCalculator(){
        int term1 = this.one;
        int term2 = this.two + (term1 * this.divisor);
        int term3 = this.three + (term2 * this.divisor);
        int term4 = this.four + (term3 * this.divisor);
        int remainder = this.five + (term4 * this.divisor);

        return "\nTerm 1 (4th Degree) = " + term1 + "\nTerm 2 (3rd Degree) = " + term2 + "\nTerm 3 (2nd Degree) = " + term3 + "\nTerm 4 (1st Degree) = " + term4 + "\nRemainder = " + remainder;

    }
    public int TermCount(int a, int b, int c, int d, int e){
        int[] array = {a, b, c, d, e};
        int count = 0;
        for (int i = 0; i <= 4; i++){
            if (array[i] != 0)
                count += 1;
        }
        return count;
    }
    public static void main(String[] args){
        SyntheticDivisionMK1 polynomial = new SyntheticDivisionMK1();
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Divisor: ");
        int divisor = keyboard.nextInt();
        System.out.print("Term 1 (4th Degree) Coefficient: ");
        int term_one = keyboard.nextInt();
        System.out.print("Term 2 (3rd Degree) Coefficient: ");
        int term_two = keyboard.nextInt();
        System.out.print("Term 3 (2nd Degree) Coefficient: ");
        int term_three = keyboard.nextInt();
        System.out.print("Term 4 (1st Degree) Coefficient: ");
        int term_four = keyboard.nextInt();
        System.out.print("Term 5 (0th Degree) Coefficient: ");
        int term_five = keyboard.nextInt();

        polynomial.setNums(term_one, term_two, term_three, term_four, term_five, divisor);

        int terms = polynomial.TermCount(term_one, term_two, term_three, term_four, term_five);
        if (terms == 2)
            System.out.println(polynomial.TwoTermCalculator());
        else if (terms == 3)
            System.out.println(polynomial.ThreeTermCalculator());
        else if (terms == 4)
            System.out.println(polynomial.FourTermCalculator());
        else
            System.out.println(polynomial.FiveTermCalculator());
    }
}