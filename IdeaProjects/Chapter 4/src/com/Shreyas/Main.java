package com.Shreyas;

class Main {
    public static void main(String[] args) {
        String x = "The";
        String newString = "";
        for (int i = 0; i <= x.length() - 1; i++){
            newString += x.substring(i, i + 1);
        }
        System.out.println(newString);
    }
}