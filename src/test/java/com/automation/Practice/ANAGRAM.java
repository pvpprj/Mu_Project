package com.automation.Practice;

import java.util.Arrays;
import java.util.Locale;

public class ANAGRAM {
    public static void main(String[] args) {
        String str1 ="R33ace"; String str2 ="Care33";
        str1=str1.toLowerCase();  str2=str2.toLowerCase();

        if (str1.length()==str2.length()){
            char c1[]=str1.toCharArray();  char c2[]=str2.toCharArray();
            Arrays.sort(c1);   Arrays.sort(c2);

            if (Arrays.equals(c1,c2))
                System.out.println("Anagram");
            else System.out.println("Not Anagram");
        }
            else
            System.out.println("Not Anagram");
    }
}
