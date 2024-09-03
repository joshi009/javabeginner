package Mst;

public class Calculator {
    public static void main(String[] args) {
        char ch = '-';
        int a = 1;
        int b = 2;
        switch (ch){
            case '+':
            System.out.println(a+b);
            break;
            case '-':
                System.out.println(a-b);
                break;
            case '*':
                System.out.println(a*b);
                break;
            case '/':
                System.out.println(a/b);
                break;
            default:
                System.out.println("invalid operator");
        }
    }
}
