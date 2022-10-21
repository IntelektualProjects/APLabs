package com.CodeWars;

public class DnaStrand {
    public static String makeComplement(String dna) {
        String match = "";
        for(int i = 0; i < dna.length(); i++){
            if(dna.substring(i, i + 1).equals("A")){
                match += "T";
            }
            if(dna.substring(i, i + 1).equals("T")){
                match += "A";
            }
            if(dna.substring(i, i + 1).equals("G")){
                match += "C";
            }
            if(dna.substring(i, i + 1).equals("C")){
                match += "G";
            }
        }
        return match;
    }

}
