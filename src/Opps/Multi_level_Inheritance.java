package Opps;

public class Multi_level_Inheritance {
    public static void main(String[] args) {
        Dog dobby = new Dog();
        dobby.eat();
        dobby.leg = 4;
        System.out.println(dobby.leg);
    }
}
class Animal1{
   String color;
    void eat(){
        System.out.println("eats");
    }
    void breathe(){
        System.out.println("breathe");
    }
}
class Mammal extends Animal{
    int leg;
}
class Dog extends Mammal{
    String breed;
}
