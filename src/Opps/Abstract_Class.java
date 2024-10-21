package Opps;

public class Abstract_Class {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.eat();
        h.walk();
        System.out.println(h.color);

//        Chicken c = new Chicken();
//        c.eat();
//        c.walk();
    }
}
abstract class Animal3{  //non abstract
    String color;
    Animal3(){
        color = "brown";
    }
    void eat(){
        System.out.println("Animal eats");
    }
    abstract void walk();    //abstract
}
class Horse extends Animal3{
    void changeColor(){
        color = "dark brown";
    }
    void walk(){
        System.out.println("walks on 4 legs");
    }
}
class Chicken extends Animal3{
    void changeColor(){
        color =  "yellow";
    }
    @Override
    void walk() {
        System.out.println("walks on 2 legs");
    }
}
