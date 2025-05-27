package com.may26.constructorChaining;

class Parent1
{
   protected int num = 100;
}
class Child1 extends Parent 
{
    protected int num = 200;
}
public class Test 
{
   public static void main(String[] args) 
   {
        Child1 obj = new Child1();
        System.out.println(obj.num);
    }
}
