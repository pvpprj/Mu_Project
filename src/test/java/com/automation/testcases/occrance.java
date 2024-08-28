package com.automation.testcases;

public class occrance {
    public static void main(String[] args) {
        int  i;
        String s="rahul gupta";

        int c[]=new int[256];

        for (i=0;i<s.length();i++){
            if (s.charAt(i)!=0)
            {
                c[(int)s.charAt(i)]++;
            }
        }

        for (i=0;i<c.length;i++){
            if (c[i]!=0)
            {
                System.out.println((char)i+"="+c[i]);
            }
        }






    }
}
