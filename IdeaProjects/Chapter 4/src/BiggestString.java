/*
* Shreyas Potnuru
* Chapter 04
* Program 24
*/

public class BiggestString{
    private String one, two, three;

    public BiggestString(){ // Default Constructor
        this.one = "";
        this.two = "";
        this.three = "";
    }

    public BiggestString(String a, String b, String c){ // initialization Constructor
        this.one = a;
        this.two = b;
        this.three = c;
    }

    public void setStrings(String a, String b, String c){ // Setter Method
        this.one = a;
        this.two = b;
        this.three = c;
    }

    public String getBiggest(){ // Compares all 3 strings to determine the largest
        String max = "";
        if (this.one.substring(0, 1).compareTo(this.two.substring(0, 1)) < 0)
            max = this.two;
        else
            max = this.one;
        if (max.substring(0, 1).compareTo(this.three.substring(0, 1)) < 0)
            max = this.three;
        return max;
    }

    public String toString(){ // Fancy version of a print method
        return this.one + " " + this.two + " " + this.three + "\nBiggest = " + getBiggest() + "\n";
    }

    public static void main(String[] args){
        BiggestString test = new BiggestString("abc", "cba", "bca");
        System.out.println(test.toString());

        test.setStrings("one", "fourteen", "twenty");
        System.out.println(test.toString());

        test.setStrings("124323", "20009", "3434");
        System.out.println(test.toString());

        test.setStrings("abcde", "ABCDE", "1234234324");
        System.out.println(test.toString());

    }

}
/* Output:
abc cba bca
Biggest = cba

one fourteen twenty
Biggest = twenty

124323 20009 3434
Biggest = 3434

abcde ABCDE 1234234324
Biggest = abcde
*/