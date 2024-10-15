package com.automation.Practice;

import java.util.ArrayList;
import java.util.Collections;

public class findSecondMaxNoInString {
    public static void main(String[] args) {
        String s="sdddd121333";
        int i,j;
        ArrayList<Integer> a = new ArrayList<>(); int secMax=0;

        for(i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i))){
                System.out.print(s.charAt(i));
                a.add((int) s.charAt(i));
            }
        }

        Collections.sort(a);
        System.out.println();
        System.out.print(a);  System.out.println();

        for(i=0;i<a.size();i++){
            if(a.get(i)!=a.get(a.size()-1))
            {
                secMax=a.get(i);
            }
        }
        System.out.println("secMax = "+(char)secMax);
    }
}
