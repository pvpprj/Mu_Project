package com.automation.Practice;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Count_Word_In_String {
    public static void main(String[] args) {

        String s = "India is my country. I love my country.";
        String a[] = s.split(" ");
        Map<String, Integer> m = new HashMap<String, Integer>();

        for (String aa : a) {
            if (m.containsKey(aa)) {
                m.put(aa, m.get(aa) + 1);
            } else m.put(aa, 1);
        }
        m.forEach((k, v) -> System.out.println(k + "=" + v));

        /*for (Map.Entry<String, Integer> entry : m.entrySet()) {
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }*/

        int max = Collections.max(m.values());

        for (Map.Entry<String, Integer> entry : m.entrySet()) {
            if (entry.getValue() == max)
                System.out.println(entry.getKey() + "=" + entry.getValue());
        }


    }
}
