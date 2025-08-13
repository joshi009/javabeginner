package Conditional_Statement;

import java.util.Scanner;

public class Ternary_Operator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();


        // ternary operator
        String type = ((n % 2 == 0) ? "EVEN":"ODD");
        System.out.println(type);

    }
}
