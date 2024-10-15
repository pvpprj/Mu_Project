package com.automation.Practice;

public class Print_charecter {
    public static void main(String[] args) {
     //   Input = "a2b3c4" and output = aabbbcccc""
        String s = "a2b3c4"; int i,j;

       for (i=0;i<s.length();i++){
           if (Character.isAlphabetic(s.charAt(i))){
               System.out.print(s.charAt(i));
           }
           else {
               int a = Character.getNumericValue(s.charAt(i));
               for (j=1;j<a;j++){
                   System.out.print(s.charAt(i-1));
               }

       }}




    }
}
