package com.automation.Practice;

public class SortAnd2ndMaxNo {
    public static void main(String[] args) {
        int a[] = {3, 1, 4, 7, 0, 12, 12, 11, 2, 89, 89};
        int i, j, temp = 0;  int k = 0;

        for (i = 0; i < a.length; i++) {
            for (j = 0; j < a.length; j++) {
                if (a[i] < a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }            }        }

        for (i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

        for (i = 0; i < a.length; i++) {
            if (a[i] != a[a.length - 1]) {
                k = a[i];
            }        }

        System.out.println("2nd no = " + k);
    }
}
