package com.automation.Practice;

public class Missing_values_from_sorted_array {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7,8,9,10,11,13,14,15};   // Missing No 12
        int i,n,sum;  sum=0; n=a.length +1;

        for(i=0;i<a.length;i++){
            sum=sum+a[i];
        }
        int total = n*(n+1)/2;

        System.out.println("sum = "+sum);
        System.out.println("total = "+total);
        System.out.print("Missing No = "+(total-sum));
    }
}