package com.automation.Practice;

public class jjj {
    public static void main(String[] args) {
        B b=new B();      // b.test();
b.rrr();
      //  A a=new A();  a.test();
    }
}

    class  A{
         void test(){ System.out.println("A");         }  }

    class  B extends A{
         void test(){ System.out.println("B");}
        void rrr(){
            super.test();
            test();
        }

}