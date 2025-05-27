package com.may26.constructorChaining;
class Parent3
{
    { 
    System.out.println("Parent Non-Static Block");
    }
}

class Child3 extends Parent3
{
    { 
    System.out.println("Child Non-Static Block");
    }
}

public class Main3
{
    public static void main(String[] args) 
    {
        Child3 obj = new Child3();
    }
}