package Conditional_Statement;

import java.util.Scanner;

public class If_Else_If_Statement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age : ");
        int age = sc.nextInt();


        if (age >= 18) {
            System.out.println("They can vote or Drive");
        }
        else if (age >= 13 && age < 18) {
            System.out.println("They are teenagers");
        } else {
            System.out.println("They are not adult");
        }

    }
}
