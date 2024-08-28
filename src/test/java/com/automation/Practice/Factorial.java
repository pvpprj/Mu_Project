package com.automation.Practice;

public class Factorial {
    public static void main(String[] args) {
        int n=14775; int i,j,k; int add=0; int temp=n;

        while (n!=0){
            int r=n%10; int f=1;
            for (i=1;i<=r;i++){
                f=f*i;            }
            add=f+add;
            n=n/10;
        }

        if (add==temp)
            System.out.println("Good");
        else             System.out.println("NOT Good");

    }
}
