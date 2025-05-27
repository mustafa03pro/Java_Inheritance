package com.may26.constructorChaining;

class Parent2 
{
    Parent2()
    {
        System.out.println("Parent Constructor");
    }
}
class Child2 extends Parent
{
    Child2() 
    {
        this(10);
        System.out.println("Child Constructor");
    }
    Child2(int x) 
    {
        super();
        System.out.println("Child Constructor with x: " + x);
    }
}
public class Main2
{
    public static void main(String[] args)
    {
        Child2 obj = new Child2();
    }
}
