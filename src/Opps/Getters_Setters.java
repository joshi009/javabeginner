package Opps;

public class Getters_Setters {
    public static void main(String[] args) {
        Pen p1 = new Pen(); //create a object
        p1.setColor("Blue");
        System.out.println(p1.getColor());
        p1.setTip(5);
        System.out.println(p1.getTip());
        p1.setColor("Yellow");
        System.out.println(p1.getColor());
    }
}
class Pen{
    private String color;
    private int tip;

    String getColor(){
        return this.color;
    }
    int getTip(){
        return this.tip;
    }
    void setColor(String newcolor){
        this.color = newcolor;
    }
    void setTip(int tip){
        this.tip = tip;
    }
}
