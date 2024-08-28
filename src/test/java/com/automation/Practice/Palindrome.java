package com.automation.Practice;

public class Palindrome {
    public static void main(String[] args) {
        String s="sanas";
       int i,j,n; n=s.length();

       for (i=0;i<n/2;i++){
           if (s.charAt(i)!=s.charAt(n-1-i))
           break;
       }

       if (i==n/2)
           System.out.println("Palindrome");
       else   System.out.println("NOT Palindrome");
    }
}