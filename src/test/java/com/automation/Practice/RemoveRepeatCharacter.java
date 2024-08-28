package com.automation.Practice;
import java.util.HashSet;

public class RemoveRepeatCharacter {
    public static void main(String[] args) {
        String input = "vhjagsgjagsagsjgsjas";
        StringBuilder sb=new StringBuilder(input);
        int i,j,k,l;         System.out.println("before de = "+sb);


        for (i=0;i<sb.length();i++){
            for (j=0;j<sb.length();j++){
                if(sb.charAt(i)==sb.charAt(j)){
                    sb.deleteCharAt(j);
                }
            }
        }

        System.out.println("After de = "+sb);




    }
}