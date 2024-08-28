package com.automation.Practice;

public class Occurance {
    public static void main(String[] args) {
        String s = "rahulgupta";

        int c[] = new int[256];
        int i;

        for (i = 0; i < s.length(); i++) {
            if (s.charAt(i) != 0) {
                c[(int) s.charAt(i)]++;
            }
        }

        for (i = 0; i < c.length; i++) {
            if (c[i] != 0) {
                System.out.println((char) i + " = " + c[i]);
            }
        }

    }
}
