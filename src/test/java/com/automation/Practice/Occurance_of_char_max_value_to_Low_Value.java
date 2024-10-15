package com.automation.Practice;

import java.util.*;

public class Occurance_of_char_max_value_to_Low_Value {
    public static void main(String[] args) {

        int i,j; int temp=0;
        String s="RahulRahulRahulrr";
        s=s.toLowerCase();
        char c1[]=s.toCharArray();
        Map<Character,Integer> m=new TreeMap<>();

        for(char c:c1){
            if(m.containsKey(c))
                m.put(c,m.get(c)+1);
            else
                m.put(c,1);
        }

        m.forEach((k,v)-> System.out.println(k+"="+v));

        Set<Integer> ll= new TreeSet<>(m.values());

        System.out.println(ll);

        int array[]= new int[ll.size()];

        for(int q:ll){
            array[temp]=q;
            temp++;
        }		System.out.println(Arrays.toString(array));
        System.out.println("--------------------------------");

        for(i=array.length-1;i>=0;i--){
            for(Map.Entry<Character,Integer> entry : m.entrySet()){
                if(array[i]==entry.getValue()){
                    System.out.println(entry.getKey()+" = "+entry.getValue());
                }
            }
        }

        
    }
}
