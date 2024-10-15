package com.automation.Practice;

import java.util.ArrayList;

public class prime {
    public static void main(String[] args) {
        int n = 15;
        int i, j = 0;
        ArrayList a = new ArrayList();
        ArrayList b = new ArrayList();

        for (i = 1; i <= n; i++) {
            for (j = 2; j <= i; j++) {
                if (i % j == 0) {
                    break;
                }
            }

            if (i == j)
                a.add(i);
        }
        System.out.print("Prime = " + a);
    }
}
