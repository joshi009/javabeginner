package Opps;

public class Shallow_and_Deep_copy {
    public static void main(String[] args) {
        Men m1 = new Men();
        m1.name = "Kalyan";
        m1.roll = 436;
        m1.password = "abcd";
        m1.marks[0] = 100;
        m1.marks[1] = 90;
        m1.marks[2] = 80;

        Men m2 = new Men(m1);  //copy
        m2.password = "xyz";
        m1.marks[2] = 100;

        for(int i=0; i<3; i++){
            System.out.println(m2.marks[i]);
        }
    }
}
class Men {
    String name;
    int roll;
    String password;
    int marks[];

    // Shallow Copy constructors
//    Boy(Boy b1){
//        marks = new int[3];
//        this.name = b1.name;
//        this.roll = b1.roll;
//        this.marks = b1.marks;
//    }

    // deep copy constructors
    Men(Men m1){
        marks = new int[3];
        this.name = m1.name;
        this.roll = m1.roll;
        for(int i=0; i<3; i++){
            this.marks[i] = m1.marks[i];
        }
    }
    Men(){
        marks = new int[3];
        System.out.println("constructor is called...");
    }
    Men(String name){
        marks = new int[3];
        this.name = name;
    }
    Men (int roll){
        marks = new int[3];
        this.roll= roll;
    }
}
