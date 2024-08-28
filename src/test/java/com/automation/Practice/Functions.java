package com.automation.Practice;

import java.util.*;
import java.io.*;

class Function {
    String LongestWord(String sen) {
        int max = 0;
        String[] s = sen.split("[^a-z^0-9]");
        
        String maxWord = "";
        for (int i = 0; i < s.length; i++)
        {
            System.out.println(s[i]);
            if (s[i].length() > max)
            {
                maxWord = s[i];
                max = s[i].length();
            }
        }
        return maxWord;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Function c = new Function();
        System.out.print(c.LongestWord(s.nextLine()));
    }
}