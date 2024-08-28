package com.automation.Practice;

import java.util.HashMap;
import java.util.Map;

public class ttt {
    public static void main(String[] args) {
//        HashMap 1 contains INDIA:- Virat and Designation:- C
//        HashMap 2 contains INDIA:- Rohit and Designation:- VC
//        Output should display combined as :
//        INDIA:- {Virat, Rohit}
//        Designation:- {C,VC}

        HashMap<String ,String> h1 =new HashMap<String ,String>();
        HashMap<String ,String> h2 =new HashMap<String ,String>();


        h1.put("INDIA","Virat"); h1.put("Designation","C");
        h1.put("INDIA","Rohit"); h1.put("Designation","VC");
        h2.putAll(h1);

        for (Map.Entry<String ,String> entry :h1.entrySet())
        {
            h2.put(entry.getKey(),entry.getValue());
        }

        h1.forEach((k,v)-> System.out.println(k+"="+v));

        for (Map.Entry<String ,String> entry : h1.entrySet())
        {
           if (entry.getKey()=="INDIA"){
               System.out.println(entry.getValue());
           }

            if (entry.getKey()=="Designation"){
                System.out.println(entry.getValue());
            }

        }
    }
}
