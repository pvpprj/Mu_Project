package com.automation.Practice;

import java.util.*;

public class missing_multiple_No_array {
    public static void main(String[] args) {
        int a[] = {-6, -9, 3, 21, 55, 21, 4, -2};   // -8,-7,-5,-4,-3
        Arrays.sort(a);  int i;

        Set<Integer> set = new TreeSet<>();

        for (i = a[0]; i < a[a.length - 1]; i++) {
            set.add(i);
        }

        for (i = 0; i < a.length; i++) {
            set.remove(a[i]);
        }

        for (int x : set) {
            System.out.print(x + " ,");
        }
        System.out.println();
        System.out.println(set);

    }
}
