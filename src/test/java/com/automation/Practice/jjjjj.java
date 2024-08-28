package com.automation.Practice;
import java.util.*;
public class jjjjj {
    public static void main(String[] args) {
        int a[] = {1,2,3,5};     int i, j, n;    int temp = 0;  int sum=0;
String s="If you want want the end Collection to be in the form of Set and if you want to define your own natural order rather than that of TreeSet then";   char cc[]=s.toCharArray(); int secMax=0;
Map<String,Integer> map=new HashMap<>(); n=s.length();

ArrayList<Integer> ll= new ArrayList<>();
ll.add(9); ll.add(8); ll.add(2);  ll.add(1);  ll.add(4);  ll.add(18);  ll.add(90);

        ArrayList<String> str= new ArrayList<>();
        str.add("Raj"); str.add("Zzzzz"); str.add("ABC"); str.add("Rahul"); str.add("Abcd"); str.add("Abcd");

        System.out.println("Before sort = "+str);        Collections.sort(str);
        System.out.println("After sort = "+str);

        Collections.reverse(str);  System.out.println("reverse = "+str);

        HashSet<String> hs= new HashSet<>(str);
        System.out.println("HashSet = "+hs);

    }
}