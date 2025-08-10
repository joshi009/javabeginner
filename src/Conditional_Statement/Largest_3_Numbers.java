package Conditional_Statement;

public class Largest_3_Numbers {
    public static void main(String[] args) {
        int a = 1;
        int b = 4;
        int c = 7;

        if(a >= b && b >= c){
            System.out.println("The largest number :" + a);
        }else if (b >= c){
            System.out.println("The largest  number : " + b);
        }
        else {
            System.out.println("The largest number : " + c);
        }
    }
}
