package com.automation.Practice;

import groovyjarjarantlr4.runtime.tree.Tree;

import java.util.*;
public class Soer_Set {
    public static void main(String[] args) {
        TreeSet<String> str= new TreeSet<>();
        str.add("Raj"); str.add("Zzzzz"); str.add("ABC"); str.add("Rahul"); str.add("Abcd"); str.add("Abcd");
        System.out.println("HashSet = "+str);

        TreeMap<String,Integer> map= new TreeMap<>();
        map.put("Raj",1);   map.put("Zzzzz",2); map.put("ABC",3); map.put("Rahul",4); map.put("Abcd",5);
        System.out.println("HashMap = "+map);


    }
}
