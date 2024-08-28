package com.automation.Practice;

public class ReverseOfString {
    public static void main(String[] args) {
        String s= "Rahul Gupta";
        String s1="";   int i,j;

        for (i=s.length()-1;i>=0;i--){
            s1=s1+s.charAt(i);
        }
        System.out.println(s1);

        String rev []=s1.split(" ");
        for (i=rev.length-1;i>=0;i--){
            System.out.print(rev[i]+" ");
        }

    }
}
