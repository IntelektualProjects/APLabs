/*
* Shreyas Potnuru
* Chapter 03
* Program 16
*/


public class Social {
    private String socialNum;
    private int sum;

    public Social() { // Default Constructor
        this.socialNum = "";
        this.sum = 0;
    }
    public Social(String soc) { setWord(soc); } // Initialization Constructor

    public void setWord(String w) { // Setter Method
        this.socialNum = w;
        chopAndAdd();
    }

    public void chopAndAdd() { // Take apart String and parse for integer values
        int indexOne = this.socialNum.indexOf("-");
        int indexTwo = this.socialNum.lastIndexOf("-");
        this.sum = Integer.parseInt(this.socialNum.substring(0, indexOne)) + Integer.parseInt(this.socialNum.substring(indexOne + 1, indexTwo)) + Integer.parseInt(this.socialNum.substring(indexTwo + 1));
    }
    public String toString() { // Just a print method
        return "SS# " + this.socialNum + " has a total of " + this.sum + "\n";
    }
    public static void main( String[] args) {
        Social code = new Social();

        code.setWord("456-56-234");
        System.out.println(code.toString());

        code.setWord("1-1-1");
        System.out.println(code.toString());

        code.setWord("102-2-12");
        System.out.println(code.toString());

        code.setWord("0-0-0");
        System.out.println(code.toString());
    }
}
/* Output:
SS# 456-56-234 has a total of 746

SS# 1-1-1 has a total of 3

SS# 102-2-12 has a total of 116

SS# 0-0-0 has a total of 0
 */