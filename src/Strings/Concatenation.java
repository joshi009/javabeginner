package Strings;

import java.util.Scanner;

public class Concatenation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first Name ");
        String firstName = sc.next();
        System.out.println("Enter the second Name ");
        String secondName = sc.next();
//        String firstName = "Hello";
//        String secondName = "World";
        String fullNane = firstName + " " + secondName;
        System.out.println("fullName is  " + fullNane );

    }
}
