package com.automation.Practice;

import com.sun.org.apache.xpath.internal.objects.XString;

import java.util.*;

public class pp {
    public static void main(String[] args) {
       // String input = new String("aabbccddeeff");
        String input = "aabbccddeeffggggghhhhhiiiiijjjjkkkkllllllmmmmmmmnnnnnnooooopppppqqqqrrrssss";
int sb[]={1,2,3,4,5,6,8}; int n=sb.length+1; int sum=0;int i,j,k;
        String ree="";
       String s="Download from artifact repository"; String re=""; System.out.println(s);

       for(i=0;i<s.length();i++){
           re=s.charAt(i)+re;
       }     System.out.println(re);

        for(i=s.length()-1;i>=0;i--){
            ree=ree+s.charAt(i);
        }   System.out.println(ree);

String str[]=re.split(" ");

        for(i=str.length-1;i>=0;i--){
            System.out.print(str[i]+" ");
        }

    }    }