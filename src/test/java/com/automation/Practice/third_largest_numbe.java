package com.automation.Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class third_largest_numbe {
    public static void main(String[] args) {
        int a[] = {2, 4,4,2,1,2,3,4,5,6,7,8,9,8,7,6,5,4, 1, 5, 3, 6}; int i,j; int secMax=0; int count=0;
        int thirdMax=0;
        Arrays.sort(a);    System.out.println(Arrays.toString(a));

        for(i=0;i<a.length;i++){
            if(a[i]!=a[a.length-1]){
                secMax=a[i]; count=i;
            }       }

        System.out.println("secMax = "+secMax);
        System.out.println("Count = "+count+"    "+a.length);

        for(i=0;i<count ;i++){
            if(a[i]!=a[count]){
                thirdMax=a[i];
            }       }

        System.out.println("thirdMax = "+thirdMax);

//        -------------------------------------OR----------------------------------

/*
        Set s=new TreeSet();
        for (i=0;i<a.length;i++) {
            s.add(a[i]);      }

        ArrayList aa= new ArrayList(s);
        System.out.println("Set = "+s);    System.out.println("Arr = "+aa);
        System.out.println("thirdMax = "+aa.get(aa.size()-3));
*/


    }
}
