package com.automation.Practice;

public class CountSpecial_Characters {
    public static void main(String[] args) {
        String s="asdert123456!@#$%^ jjj mm";
        int i,j,k; int alpha,digit;  alpha=0;   digit=0;

        for(i=0;i<s.length();i++){
          if(!Character.isLetterOrDigit(s.charAt(i))){
              System.out.print(s.charAt(i));
          }
        }
        System.out.println();

       /* int special;
        System.out.println("alpha = "+alpha);
        System.out.println("digit = "+digit);
            special=s.length()-alpha-digit;
        System.out.println("special = "+special);*/


    }

}
