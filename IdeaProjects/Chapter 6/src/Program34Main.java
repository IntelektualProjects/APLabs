/*
* Shreyas Potnuru
* Chapter 06
* Program 34
*/

public class Program34Main {

    public static void main(String[] args) {
        Student warren = new Student("Warren", 12345);
        Student peaceOne = new Student("Peace", 67890);
        Student peacetwo = new Student("Peace", 67890);
        warren.setEquals(peaceOne);
        System.out.println(warren.toString(peaceOne));
        peaceOne.setEquals(peacetwo);
        System.out.println(peacetwo.toString(peaceOne));
    }
}
/*Output:
Name: Warren
Student Number: 12345

 Is not the same person as

Name: Peace
Student Number: 67890

Name: Peace
Student Number: 67890

 Is not the same person as

Name: Peace
Student Number: 67890

*/