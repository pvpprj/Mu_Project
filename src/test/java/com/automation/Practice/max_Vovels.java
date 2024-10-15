package com.automation.Practice;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class max_Vovels {
    public static void main(String[] args) {
        String s="abciiidef"; int i,j; int max=0; char c1=' ';
        int c[]=new int[256];  s=s.toLowerCase();

        for(i=0;i<s.length();i++){
            if(s.charAt(i)!=0){
              if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u' ){
                  c[(int) s.charAt(i)]++;
              }        }}

        for(i=0;i<c.length;i++){
            if(c[i]!=0){
                System.out.println((char)i+"="+c[i]);
            }}

        for(i=0;i<c.length;i++){
            if(c[i]!=0){
                if(max<c[i]){
                    max=c[i];
                    c1=(char)i;
                }
            }}
        System.out.println("Max Vovels -> "+c1+"="+max);


//  -----------------------------------------------or----------------------------------
        System.out.println("Using map -------------------------------------");

        Map<Character,Integer> m= new HashMap<Character,Integer>();
        char ch[]=s.toCharArray();
        for(char k:ch) {
            if(k=='a' || k=='e' || k=='i' || k=='o' || k=='u' ) {
               if (m.containsKey(k)) {
                    m.put(k,m.get(k)+1);
               }
               else m.put(k,1);
           }
        }

        m.forEach((key,value)-> System.out.println(key+"="+value));
         max= Collections.max(m.values());

         System.out.println("max = "+max);


    }
}