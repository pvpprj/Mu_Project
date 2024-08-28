package com.automation.Practice;

import io.cucumber.java.sl.In;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Repeat_Word_in_String {
    public static void main(String[] args) {
        String s1= "ab cd xy ab cd xy ab xy jk jk po bn bn mm oo";
        String s[]=s1.split(" ");

        Map<String, Integer> m=new HashMap<>();

        for (String ss:s){
            if (m.containsKey(ss))
                m.put(ss,m.get(ss)+1);
            else m.put(ss,1);
        }

        m.forEach((k,v)-> System.out.println(k+"="+v));

        for ( Map.Entry<String, Integer> entry: m.entrySet() ){
            if (entry.getValue()==1){
                System.out.println("Repeate = "+entry.getKey());
            }
        }
int count=0;
        for ( Map.Entry<String, Integer> entry: m.entrySet() ){
//            if (entry.getValue()== Collections.max(m.values())){
            if (count < entry.getValue()){
                count=entry.getValue();
//                System.out.println("MAX = "+entry.getKey()+"="+entry.getValue());
            }        }

        for ( Map.Entry<String, Integer> entry: m.entrySet() ){
            if (entry.getValue()== count){
                System.out.println("MAX = "+entry.getKey()+"="+entry.getValue());
          }}
        System.out.println("Count = "+count);

        System.out.println(m.get("ab"));








    }
}
