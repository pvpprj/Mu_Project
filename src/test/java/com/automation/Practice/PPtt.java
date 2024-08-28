package com.automation.Practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class PPtt {
    public static void main(String[] args) throws IOException {
        /*String s1="New";
        s1=s1.concat(" Delhi");
      //  s1=s1+"er";
        System.out.println(s1);
*/

        int a[] = {7, 2, 92,92,95, 3, 175, 4}; String s="RAHUL";
        int i, j, k = 0;
        int secMax = a[0];        int max = a[0];

        for (i=0;i<a.length;i++) {
            for (j=0;j<a.length;j++) {
                if (a[i]<a[j]){
                    k=a[i];
                    a[i]=a[j];
                    a[j]=k;
                }
            }
        }

        for (i=0;i<a.length;i++) {
            System.out.print(a[i]);
        }


        int n=a.length;

        for (i=0;i<a.length;i++) {
            if (a[i]!=a[n-1]){
                secMax=a[i];
            }
        }

        System.out.println("Second max = " + secMax);


    }
}