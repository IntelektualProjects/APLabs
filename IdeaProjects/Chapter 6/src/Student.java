/*
* Shreyas Potnuru
* Chapter 06
* Program 34
*/

public class Student extends Person {

    private int studentNumber;
    private boolean truth;


    public Student(){
        super();
        studentNumber = 0;
        truth = false;
    }

    public Student(String initialName, int initialStudentNumber){
        super(initialName);
        studentNumber = initialStudentNumber;
        truth = false;
    }

    public void reset(String newName, int newStudentNumber){
        setName(newName);
        studentNumber = newStudentNumber;
    }

    public void setStudentNumber(int newStudentNumber){
        studentNumber = newStudentNumber;
    }

    public void setEquals(Student otherStudent){
        super.setTruth(otherStudent);
        truth =  super.getTruth() &&(this.studentNumber == otherStudent.studentNumber);
    }

    public int getStudentNumber(){
        return studentNumber;
    }
    public boolean getTruth(){
        return truth;
    }

    public String toString(Student boi){
        String one = super.toString() + "\nStudent Number: " + getStudentNumber();
        String two = boi.toString() + "\nStudent Number: " + boi.getStudentNumber();
        if (!boi.getTruth()){
            return one + "\n\n Is not the same person as \n\n" + two + "\n";
        }
        return one + "\n\n Is the same person as \n\n" + two + "\n";
    }
}
