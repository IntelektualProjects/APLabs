/*
* Shreyas Potnuru
* Chapter 04
* Program 19
*/
public class Word {
    private String word;

    public Word() { this.word = ""; } // Default Constructor
    public Word(String s) { this.word = s; } //Initialization Constructor

    public void setString(String s) {
        this.word = s;
    }
    public String getFirstChar() { // Gets first character of string
        return this.word.substring(0,1);
    }
    public String getLastChar() { // Gets last character of string
        return this.word.substring(this.word.length() - 1);
    }
    public String getBackWards() { // gets the backwards of the string
        String back = "";
        for (int i = this.word.length() - 1; i >= 0; i--)
            back += this.word.substring(i, i + 1);
        return back;
    }
    public String toString() {
        return getFirstChar() + "\n" + getLastChar() + "\n" + getBackWards() + "\n" + this.word + "\n";
    }
    public static void main ( String[] args ){
        Word string = new Word("");

        string.setString("Hello");
        System.out.println(string.toString());

        string.setString("World");
        System.out.println(string.toString());

        string.setString("Jukebox");
        System.out.println(string.toString());

        string.setString("LordoftheRings");
        System.out.println(string.toString());

        string.setString("IceCream");
        System.out.println(string.toString());
    }
}
/*Output:
H
o
olleH
Hello

W
d
dlroW
World

J
x
xobekuJ
Jukebox

L
s
sgniRehtfodroL
LordoftheRings

I
m
maerCecI
IceCream*/