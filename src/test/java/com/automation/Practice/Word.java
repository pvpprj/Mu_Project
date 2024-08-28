package com.automation.Practice;

import java.util.Collections;
import java.util.HashMap;
import java.util.*;

public class Word {
    public static void main(String[] args) {

        String s = "ab cd xy ab cd xy ab xy jk jk po bn bn";
        String a[] = s.split(" ");
        HashMap<String, Integer> m = new HashMap<String, Integer>();

        for (String aa : a) {
            if (m.containsKey(aa)) {
                m.put(aa, m.get(aa) + 1);
            } else
                m.put(aa, 1);
        }
        m.forEach((k, v) -> System.out.println(k + " = " + v));

        int maxValueInMap = Collections.max(m.values());

        for (Map.Entry<String, Integer> entry : m.entrySet()) {
            if (entry.getValue() == maxValueInMap) {
                System.out.println("Max key ="+entry.getKey()+","+entry.getValue());
            }
        }
    }
}