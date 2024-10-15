package com.automation.Practice;

import java.util.Arrays;

public class xxx {
    public static void main(String[] args) {
        String s1 = "If your code takes input";
        String s[] = s1.split(" ");        int i, j;
        System.out.println(s1);

        for (i = 0; i < s.length; i++) {
            if (i == 2) {
                String p=s[i];  char c[]=p.toCharArray();

                for(j=c.length-1;j>=0;j--){
                    System.out.print(c[j]);
                }
                System.out.print(" ");
            } else   //System.out.println();
                System.out.print(s[i] + " ");
        }
    }
}