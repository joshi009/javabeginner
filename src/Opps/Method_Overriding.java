package Opps;

public class Method_Overriding {
    public static void main(String[] args) {
        Horses hr = new Horses();
        hr.eat();
    }
}

class Goat{
    void eat(){
        System.out.println("eats anything");
    }
}
class Horses extends Goat{
    void eat(){
        System.out.println("eats grass");
    }
}