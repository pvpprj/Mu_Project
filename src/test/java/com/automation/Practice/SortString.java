package com.automation.Practice;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SortString {
    public static void main(String[] args) {
        String s1 = "Life is RUDEE is capital";
        String s[] = s1.split(" ");
        int j, i;

        //  Arrays.sort(s);
        int max = 0;

        for (i = 0; i < s.length; i++) {
            for (j = 0; j < s.length; j++) {
                if (s[i].length() > s[j].length()) {
                    max = i;
                }
            }
        }

        System.out.println(s[max]);


    }
}
