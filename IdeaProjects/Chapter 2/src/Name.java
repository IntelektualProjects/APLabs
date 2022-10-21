/*
* Shreyas Potnuru
* Chapter 02
* Program 12
* */

public class Name
{
    private String name;

    public Name() {name = ""; } // Default Constructor

    public Name(String s) {name = s; } // Initialization Constructor

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

    public String toString() {
        setName(name);
        return "First Name: " + getFirst() + "\nLast Name: " + getLast() + "\nFull Name: " + name + "\n";
    }
    public static void main(String[] args) {
        Name name = new Name("");
        name.setName("Sandy Painter");
        System.out.println(name.toString());

        name.setName("Benny Programmer");
        System.out.println(name.toString());

        name.setName("Sally Baker");
        System.out.println(name.toString());

        name.setName("John Doe");
        System.out.println(name.toString());

        name.setName("Sammy Lammy");
        System.out.println(name.toString());
    }
}
/*Output:
First Name: Sandy
Last Name: Painter
Full Name: Sandy Painter

First Name: Benny
Last Name: Programmer
Full Name: Benny Programmer

First Name: Sally
Last Name: Baker
Full Name: Sally Baker

First Name: John
Last Name: Doe
Full Name: John Doe

First Name: Sammy
Last Name: Lammy
Full Name: Sammy Lammy
*/