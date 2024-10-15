package com.automation.Practice;

import java.util.*;

public class ddd {
    public static void main(String[] args) {
//        String a = "WebElement1:Locator1,WebElement2:Locator2,WebElement3:Locator3";
//        String b = "WebElement4:Locator4,WebElement2:Locator2,WebElement3:Locator3";
//        List<String> l=new ArrayList<>(Arrays.asList(a));
//        System.out.println("List = "+l);
//
//        String pop =String.valueOf(l);
//        System.out.println("String = "+pop);


        String s="RahulRahulRahulrr";
        String s1=s.toUpperCase();
        char c[]=s1.toCharArray();
        HashMap<Character,Integer> m = new HashMap<Character,Integer>();
        for(char c1:c)
        { if(m.containsKey(c1))
        { m.put(c1, m.get(c1)+1);
        }
        else
            m.put(c1,1); }
        m.forEach((k,v)-> System.out.print(k+"="+v+","));
        System.out.println();

        Collections.max(m.values());
        m.remove('A');
        m.forEach((k,v)-> System.out.print(k+"="+v+","));

    }
}
