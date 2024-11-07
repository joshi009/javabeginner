package Opps;

public class Static_keyword {
    public static void main(String[] args) {
    Students s1 = new Students();
    s1.schoolName = "JNV";

    Students s2 = new Students();
        System.out.println(s2.schoolName);

        Students s3 = new Students();
        s3.schoolName = "kid Care School";
    }
}
class Students{
//    static int returnPercentage(int math, int phy, int chem){
//        return (math + chem + phy) /3;
//    }
    String name;
    int roll;
    static String schoolName;

    void setName(String name){
        this.name = name;
    }
    String getName(){
        return this.name;
    }
}
