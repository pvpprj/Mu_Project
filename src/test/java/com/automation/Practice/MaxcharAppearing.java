package com.automation.Practice;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MaxcharAppearing {
    public static void main(String[] args) {
        String s="vshaasgahsags";
        int c[]=new int[256]; int i,j;

//        By Asci value

        for (i = 0; i < s.length(); i++) {
            if (s.charAt(i)!=0){
                c[(int)s.charAt(i)]++;
            }        }

        for (i = 0; i < c.length; i++) {
            if (c[i]!=0){     System.out.println((char)i+"="+c[i]);      }        }
// BY Map
        System.out.println("MAP***********");

     Map<Character,Integer> m=new HashMap<>();
        char ch[]=s.toCharArray();
        for (char c1:ch){
            if (m.containsKey(c1))
                m.put(c1,m.get(c1)+1);
           else m.put(c1,1);
        }
        m.forEach((k,v)-> System.out.println(k+"="+v));

        int max= Collections.max(m.values());

        for (Map.Entry<Character,Integer> entry : m.entrySet()){
            if (max==entry.getValue())
            System.out.println("MAX = "+entry.getKey()+"="+entry.getValue());
        }




    }
}
