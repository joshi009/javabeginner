package Mst;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number :");
        int a = sc.nextInt();
        System.out.println("Enter the second number :");
        int b = sc.nextInt();
        System.out.println("Enter the operation + , - , * , / ,");
        char ch = sc.next().charAt(0);
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
