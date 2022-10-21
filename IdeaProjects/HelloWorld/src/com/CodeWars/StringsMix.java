package com.CodeWars;

import java.util.Arrays;

public class StringsMix {
    public static String mix(String s1, String s2) {
        String[] listed = new String[26];
        int[] s1_list = countLetters(s1);
        int[] s2_list = countLetters(s2);
        for(int i = 0; i < 26; i++){
            String str = "";
            if(s1_list[i] <= 1 && s2_list[i] <= 1)
                str += "";

            else if(s1_list[i] == s2_list[i]){
                str += "=:";
                for(int k = 0; k < s1_list[i]; k++)
                    str += (char)(97 + i);
            }
            else if(Math.max(s1_list[i], s2_list[i]) == s1_list[i] && Math.max(s1_list[i], s2_list[i]) > 1){
                str += "1:";
                for(int k = 0; k < s1_list[i]; k++)
                    str += (char)(97 + i);
            }
            else if(Math.max(s1_list[i], s2_list[i]) == s2_list[i] && Math.max(s1_list[i], s2_list[i]) > 1){
                str += "2:";
                for(int k = 0; k < s2_list[i]; k++)
                    str += (char)(97 + i);
            }
            else
                str += "";
            listed[i] = str;
        }
        Arrays.sort(listed);
        System.out.println(Arrays.toString(listed));
        return "";
    }

    public static int[] countLetters(String s){
        int[] letters = new int[26];
        for(int i = 0; i < s.length(); i++){
            if((int)s.charAt(i) >= 97 && (int)s.charAt(i) <= 122)
                letters[(int)s.charAt(i) - 97] += 1;
        }
        return letters;
    }
}
