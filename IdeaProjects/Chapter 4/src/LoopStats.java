/*
* Shreyas Potnuru
* Chapter 04
* Program 20
*/
public class LoopStats {
    private int start, stop;
    
    public LoopStats() { //Default Constructor
        this.start = 0;
        this.stop = 0;
    }
    public LoopStats(int beg, int end) { //Initialization Constructor
        this.start = beg;
        this.stop = end;
    }
    public void setNums(int beg, int end) {
        this.start = beg;
        this.stop = end;
    }
    public int getEvenCount() { // Counts amount of even numbers in given range
        int count = 0;
        for (int i = this.start; i <= this.stop; i++) {
            if (i % 2 == 0)
                count += 1;
        }
        return count;
    }
    public int getOddCount() { // Counts amount of odd numbers in a given range
        int count = 0;
        for (int i = this.start; i <= this.stop; i++) {
            if (i % 2 == 1)
                count += 1;
        }
        return count;
    }
    public int getTotal() { // Finds sum of numbers in range
        int output = 0;
        for (int i = this.start; i <= this.stop; i++){
            output += i;
        }
        return output;
    }

    public String toString() {
        return this.start + "\t" + this.stop + "\ntotal " + getTotal() + "\neven count " + getEvenCount() + "\nodd count " + getOddCount() + "\n";
    }
    public static void main ( String[] args ) {
        LoopStats values = new LoopStats(0,0);

        values.setNums(1, 5);
        System.out.println(values.toString());
        values.setNums(2, 8);
        System.out.println(values.toString());
        values.setNums(5, 15);
        System.out.println(values.toString());
    }
}
/*Output:
1	5
total 15
even count 2
odd count 3

2	8
total 35
even count 4
odd count 3

5	15
total 110
even count 5
odd count 6
*/