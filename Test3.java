package com.may26.constructorChaining;

class A1 
{
    A1(int x)
    {
        System.out.println("Class A: " + x);
    }
}
class B1 extends A1 
{
    B1() 
    {
        super(10);
        System.out.println("Class B");
    }
}
public class Test3 
{
    public static void main(String[] args)
    {
        B1 obj = new B1();
    }
}

