package com.automation.Practice;

import com.sun.org.apache.xpath.internal.objects.XString;

import java.util.*;

public class pp {
    public static void main(String[] args) {
        int a[] = {2, 4,4,2,1,2,3,4,5,6,7,8,9,8,7,6,5,4, 1, 5, 3, 6};
        int i,j; int secMax=0; int count=0;  int thirdMax=0;

        Set s=new TreeSet();
    for (i=0;i<a.length;i++) {
        s.add(a[i]);
    }

    ArrayList aa= new ArrayList(s);

        System.out.println("Set = "+s);    System.out.println("Arr = "+aa);

        System.out.println("thirdMax = "+aa.get(aa.size()-3));
    }    }