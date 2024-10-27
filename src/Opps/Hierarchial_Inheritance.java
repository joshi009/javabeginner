package Opps;

public class Hierarchial_Inheritance {
    public static void main(String[] args) {
      Bird b=new Bird();
        b.fly();
        b.eat();
         b.breathe();
         Fish1 f = new Fish1();
         f.swim();
         f.breathe();
         f.eat();


    }
}


class Animal2{
    String color;
    void eat(){
        System.out.println("eats");
    }
    void breathe(){
        System.out.println("breathe");
    }
}
class Mammal1 extends Animal2{
    void walk(){
        System.out.println("walk");
    }
}
class Fish1 extends Animal2{
    void swim(){
        System.out.println("swim");
    }
}
class Bird extends Animal2{
    void fly(){
        System.out.println("fly");
    }
}
