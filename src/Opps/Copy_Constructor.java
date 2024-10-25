package Opps;

public class Copy_Constructor {
    public static void main(String[] args) {
    Boy b1 = new Boy();
    b1.name = "Kalyan";
    b1.roll = 436;
    b1.password = "abcd";
    b1.marks[0] = 100;
    b1.marks[1] = 90;
    b1.marks[2] = 80;

    Boy b2 = new Boy(b1);  //copy
    b2.password = "xyz";
    b1.marks[2] = 100;

    for(int i=0; i<3; i++){
        System.out.println(b2.marks[i]);
    }
}
}
class Boy {
    String name;
    int roll;
    String password;
    int marks[];

    //Copy constructors
    Boy(Boy b1){
        marks = new int[3];
        this.name = b1.name;
        this.roll = b1.roll;
        this.marks = b1.marks;
    }
    Boy(){
        marks = new int[3];
    System.out.println("constructor is called...");
    }
    Boy(String name){
        marks = new int[3];
        this.name = name;
    }
    Boy (int roll){
        marks = new int[3];
        this.roll= roll;
    }
}

