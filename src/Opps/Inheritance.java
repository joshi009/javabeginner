package Opps;

public class Inheritance {
    public static void main(String[] args) {
        Fish shark = new Fish();
        shark.eat();
        shark.breathe();

        Animal A = new Animal();
        A.breathe();
    }
}
// Base/Parent class
class Animal{
    String color;
    void eat(){
        System.out.println("eats");
    }
    void breathe(){
        System.out.println("breathes");
    }
}

// Child/Derived class / subclass
class Fish extends Animal{
    int fins;
    void swim(){
        System.out.println("swim in water");
    }

}
