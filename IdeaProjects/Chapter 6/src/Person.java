/*
Shreyas Potnuru
Chapter 06
Program 34
*/
public class Person {

    private String name;
    private boolean nameTruth;

    public Person(){
        name = "No name Yet";
        nameTruth = false;
    }

    public Person(String initialName){
        name = initialName;
        nameTruth = false;
    }

    public void setName(String newName){
        name = newName;
    }

    public String toString(){
        return "Name: " + name;
    }

    public void setTruth(Person otherPerson){
        nameTruth = this.name.equalsIgnoreCase(otherPerson.name);
    }

    public String getName(){
        return name;
    }
    public boolean getTruth(){
        return nameTruth;
    }
}

