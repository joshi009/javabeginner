package Conditional_Statement;

import java.util.Scanner;

public class Pass_Fail {
    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the marks : ");
        int Marks = sc.nextInt();

        String Report_card = (Marks >= 33) ? "PASS" : "FAIL";
        System.out.println(Report_card);
    }
}
