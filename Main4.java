package com.may26.constructorChaining;

class Alpha
{
    { 
    System.out.println("Block 1"); 
    }
    { 
    System.out.println("Block 2"); 
    }
    
    Alpha() 
    {
        System.out.println("Alpha Constructor");
    }
}

class Beta extends Alpha
{
    { 
    System.out.println("Block 11"); 
    }
    { 
    System.out.println("Block 22"); 
    }
    
     Beta() 
    {
        System.out.println("Beta Constructor");
    }
}

public class Main4
{
    public static void main(String[] args) {
        new Beta();
    }
}
