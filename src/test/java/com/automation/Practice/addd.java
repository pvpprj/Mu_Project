package com.automation.Practice;

import javafx.scene.transform.Scale;
import java.util.Scanner;

public class addd {
    public static void main(String[] args) {
       String s="I love Java Programming";
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter no ");
//        int n=sc.nextInt();
       String s1[]=s.split(" ");
       int i,j;

       for (i=0;i<s1.length;i++){
           if(i==2){
               String db=s1[i];
             /*  char c[]=db.toCharArray();
               for (j=c.length-1;j>=0;j--){
                   System.out.print(c[j]);
               }*/
               uu(db);
           }
           else  // System.out.print(" "+s1[i]+" ");
               System.out.print(s1[i]+" ");
       }
    }

   static   void uu(String db){
         char c[]=db.toCharArray(); int j;
         System.out.print(" ");
         for (j=c.length-1;j>=0;j--){
             System.out.print(c[j]);
         }
         System.out.print(" ");
     }
}