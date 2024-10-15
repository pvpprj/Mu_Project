package com.automation.Practice;

import java.util.Arrays;
import java.util.HashSet;

public class Group_strings_anagrams_of_each_other {
    public static void main(String[] args) {
        String s[] = {"eat", "tea", "tan", "ate", "nat", "bat"}; int i,j,k;
        HashSet hs1 = new HashSet();

        for(i=0;i<s.length;i++){
            hs1.clear();
            for(j=i+1;j<s.length;j++){
                String s1=s[i].toLowerCase(); String s2=s[j].toLowerCase();
                char c1[]=s1.toCharArray();
                char c2[]=s2.toCharArray();
                Arrays.sort(c1);
                Arrays.sort(c2);

                if(c1.length == c2.length){
                    if (Arrays.equals(c1,c2)){
                        hs1.add(s1);  hs1.add(s2);
                    }
                }
            }
            if(!hs1.isEmpty())
            System.out.println( hs1);
        }
    }
}
