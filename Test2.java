package com.may26.constructorChaining;

class A 
{
    A() 
    {
        System.out.println("Class A Constructor");
    }
}
class B extends A 
{
    B() 
    {
        System.out.println("Class B Constructor");
    }
}
public class Test2 
{
    public static void main(String[] args) 
    {
        B obj = new B();
    }
}
