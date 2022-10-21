/*
* Shreyas Potnuru
* Chapter 06
* Program 35
*/

public class Employee extends Person{
    private int hire_year;
    private double salary;
    private String SS;
    private boolean truth;

    public Employee (){
        super();
        hire_year = 2020;
        salary = 0.0;
        SS = "123-456-7890";
        truth = false;
    }

    public Employee(String name, int year, double s, String ss){
        super(name);
        this.hire_year = year;
        this.salary = s;
        this.SS = ss;
        truth = false;
    }

    public int getHire_year(){
        return hire_year;
    }
    public double getSalary(){
        return salary;
    }
    public String getSS(){
        return SS;
    }
    public boolean getTruth(){ return truth;}

    public void setHire_year(int year){
        hire_year = year;
    }
    public void setSalary(double money){
        salary = money;
    }
    public void setSS(String code){
        SS = code;
    }

    public void setTruth(Employee ugh){
        super.setTruth(ugh);
        boolean cero = super.getTruth();
        boolean one = ugh.getHire_year() == getHire_year();
        boolean two = ugh.getSalary() == getSalary();
        boolean tres = ugh.getSS().equals(getSS());
        if(one && two && tres && cero){
            truth = true;
        }
    }
    public String toString(Employee e){
        String one = super.toString() + "\nSocial Security Number: " + getSS() + "\nSalary: $" + getSalary() + "\nYear of Hire: " + getHire_year();
        String two = e.toString() + "\nSocial Security Number: " + getSS() + "\nSalary: $" + getSalary() + "\nYear of Hire: " + getHire_year();
        if(one.equals(two)){
            return one + "\n\nIs the same person as \n" + two + "\n";
        }
        return one + "\n\nIs not the same person as \n" + two + "\n";
    }

}
