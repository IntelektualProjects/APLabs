/*
* Shreyas Potnuru
* Chapter 06
* Program 35
*/

public class Program35Main {

    public static void main(String[] args){
        Employee Warren = new Employee("Warren", 1995, 56785.0, "123-56-9080");
        Employee peaceone = new Employee("Peace", 1987, 77987.0, "098-99-4345");
        Employee peacetwo = new Employee("Peace", 1987, 77987.0, "098-99-4345");
        Warren.setTruth(peacetwo);
        System.out.println(Warren.toString(peaceone));
        peaceone.setTruth(peacetwo);
        System.out.println(peaceone.toString(peacetwo));
    }
}
/*Output:
Name: Warren
Social Security Number: 123-56-9080
Salary: $56785.0
Year of Hire: 1995

Is not the same person as
Name: Peace
Social Security Number: 098-99-4345
Salary: $77987.0
Year of Hire: 1987

Name: Peace
Social Security Number: 098-99-4345
Salary: $77987.0
Year of Hire: 1987

Is the same person as
Name: Peace
Social Security Number: 098-99-4345
Salary: $77987.0
Year of Hire: 1987
*/