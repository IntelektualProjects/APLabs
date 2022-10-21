/*
Shreyas Potnuru
Chapter 02
Program 12 Extra Credit
*/

public class NameExtra {
    private String name;

    public NameExtra() {name = ""; } // Default Constructor

    public NameExtra(String s) {name = s; } // Initialization Constructor

    public void setName(String s) {
        name = s;
    }

    public String getFirst() { // Gets first name from string
        int index = name.indexOf(" ");
        return name.substring(0,index);
    }

    public String getLast() { // Gets last name from string
        int index = name.indexOf(" ");
        return name.substring(index + 1);
    }

    public String getMiddle() { // Get middle name from string
        int index_upper_limit = name.indexOf(" ");
        int index_lower_limit = name.lastIndexOf(" ");
        return name.substring(index_upper_limit, index_lower_limit + 1);

    }

    public String toString() {
        setName(name);
        return "First Name: " + getFirst() + "\nLast Name: " + getLast() + "\nMiddle Name: " + getMiddle() + "\nFull Name: " + name;
    }
    public static void main(String[] args){
        NameExtra sandy = new NameExtra("Sandy Ryanne Painter");
        NameExtra benny = new NameExtra("Benny Java Programmer");
        NameExtra sally = new NameExtra("Sally Pie Baker");

        System.out.println(sandy.toString() + "\n");
        System.out.println(benny.toString() + "\n");
        System.out.println(sally.toString());
    }
}
/*Output:
First Name: Sandy
Last Name: Ryanne Painter
Middle Name:  Ryanne
Full Name: Sandy Ryanne Painter

First Name: Benny
Last Name: Java Programmer
Middle Name:  Java
Full Name: Benny Java Programmer

First Name: Sally
Last Name: Pie Baker
Middle Name:  Pie
Full Name: Sally Pie Baker
 */