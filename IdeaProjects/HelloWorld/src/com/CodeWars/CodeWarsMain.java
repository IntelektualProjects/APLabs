package com.CodeWars;

import java.util.Arrays;

public class CodeWarsMain{
    public static String plant(char sd, int water, int fert, int temp){
        String seed = Character.toString(sd);
        String plant = "";
        for(int i = 1; i <= water; i++){
            for(int s = 0; s < water; s++)
                plant += "-";
            for(int l = 0; l < fert; l++)
                plant += seed;
        }
        if(temp < 20 || temp > 30){
            String part = plant.substring(0, plant.length() - 1);
            part = part.replace(seed, "");
            return part + seed;
        }
        return plant;
    }

    public static void main(String[] args){

        System.out.println(plant('+', 1, 3, 15));
    }
}
