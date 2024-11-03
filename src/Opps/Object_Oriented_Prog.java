package Opps;

public class Object_Oriented_Prog {
    public static void main(String[] args) {
        pencil p1 = new pencil();
        p1.SetColor("Blue");
        System.out.println(p1.color);
        p1.SetTip(5);
        System.out.println(p1.tip);


        Studentx x = new Studentx();
        x.name = ("kalyan");
        System.out.println(x.name);
        x.age = 124;
        System.out.println(x.age);
        x.percentage = (90 + 80 + 99) / 3;
        System.out.println(x.percentage);
    }
}
    class pencil{
        String color;
        int tip;

        void SetColor(String newColor) {
            color = newColor;
        }
        void SetTip(int newTip){
            tip = newTip;
        }
    }
    class Studentx{
        String name;
        int age;
        float percentage;

        void calPercentage(int phy,int che, int math){
            percentage = (phy + che + math) / 3;
        }
    }



