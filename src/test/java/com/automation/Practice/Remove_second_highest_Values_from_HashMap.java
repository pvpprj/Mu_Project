package com.automation.Practice;
import java.util.*;
public class Remove_second_highest_Values_from_HashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Rahul", 10); map.put("Goa", 20); map.put("Mumbai", 30); map.put("Delhi", 40);
        map.put("Kolkata", 50); map.put("Gujrat", 60); map.put("China", 50);
        map.forEach((k,v)-> System.out.print(k+"="+v+"  "));

        ArrayList<Integer> aa= new ArrayList<>(map.values());
        ArrayList<String> str= new ArrayList<>();    // Stroing sec max value in this list
        Collections.sort(aa);    //
        int max = Collections.max(map.values());
        int i,secM=0; String sss="";

        for(i=0;i<aa.size();i++){
            if(aa.get(i)!=aa.get(aa.size()-1)){
                secM=aa.get(i);
            }  }
        System.out.println();
        System.out.println("Second max = "+secM);

        for (Map.Entry<String,Integer> entry : map.entrySet()) {
            if(entry.getValue()==secM){
                str.add(entry.getKey());
            }    }

        System.out.println("Store second max values in this list ____"+str);

        /* for (String s : str) {  map.remove(s); }*/
        for(i=0;i<str.size();i++){   map.remove(str.get(i)); }

        System.out.println("After Remove ________________");
        map.forEach((k,v)-> System.out.print(k+"="+v+"  "));
    }
}