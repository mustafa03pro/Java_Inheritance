package com.may23.inheritance;


import java.util.Scanner;
public class ZooManagement {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int choice =sc.nextInt();
         sc.nextLine();
        if(choice>=4){
            System.out.println("Invalid choice.");
            System.exit(0);

        }
        

        
       
        switch(choice){
            case 1: String name=sc.nextLine();
            Animal a1=new Animal(name);
            System.out.println(a1);
            break;
            case 2:String name1=sc.nextLine();
            boolean hasFur=Boolean.parseBoolean(sc.nextLine());
        

             Mammal m1=new Mammal(name1,hasFur);
            System.out.println(m1);
            break;
            case 3:String name2=sc.nextLine();
             boolean hasFur1=Boolean.parseBoolean(sc.nextLine());
        
            String breed=sc.nextLine();
            Dog d1=new Dog(name2,hasFur1,breed);
            System.out.println(d1);
            
            break;

        }
        sc.close();
        
    }
}
class Animal {
    private String name;
    public Animal(String name){
        this.name=name;
    }
    public String getname() {
        return name;
    }
    
     public String toString(){
         return "Animal [getName()= "+getname()+"]";
     }
    
}
class Mammal extends Animal{
    private boolean hasFur;
    public Mammal(String name,boolean hasFur){
        super(name);
        this.hasFur=hasFur;
    }
     public boolean gethasFur() {
        return hasFur;
    }
    
    public String toString(){
         return "Mammal [getName()= "+getname()+", isHasFur()="+gethasFur()+"]";
     }
    
}
class Dog extends Mammal{
    private String breed;
    public Dog(String name, boolean hasFur,String breed){
       super(name, hasFur);
        this.breed=breed;
    }
     public String getbreed() {
        return breed;
    }
    public void setbreed(String breed) {
        this.breed = breed;
    }
    public String toString(){
         return "Dog [getName()= "+getname()+", isHasFur()="+gethasFur()+", breed="+getbreed()+"]";
     }
    
}