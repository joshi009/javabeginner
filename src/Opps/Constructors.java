package Opps;

public class Constructors {
    public static void main(String[] args) {
        Student s1 = new Student("Kalyan");
//          Student s1 = new Student();
        System.out.println(s1.name);
    }
}
    class Student1 {
        String name;
        int roll;

        Student1(String name){  //(String name)
            this.name = name;
//            System.out.println("Constructor is called...");
        }
    }

