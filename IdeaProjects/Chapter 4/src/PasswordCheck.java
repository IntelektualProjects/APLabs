/*
* Shreyas Potnuru
* Chapter 04
* Program 25
*/
import java.util.Scanner;

class PasswordCheck{
    private String password;

    public PasswordCheck(){ this.password = "";} // Default Constructor
    public PasswordCheck(String p){ this.password = p;} // Initialization Constructor

    public void setPassword(String p){ this.password = p;} // Setter method

    public void check(){ // Check for valid password method
        Scanner keyboard = new Scanner(System.in);
        int i = 1;

        while (i <= 11){
            System.out.print("Enter the password: ");
            setPassword(keyboard.nextLine());
            if (!this.password.equals("password123")){ // if user enters correct password (password123)
                System.out.println("INVALID");
            }
            else {
                System.out.println("VALID");
                break;
            }
            i++;
        }
    }
    public static void main( String[] args ){
    PasswordCheck trial = new PasswordCheck();
        trial.check();
    }
}