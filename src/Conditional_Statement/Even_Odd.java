package Conditional_Statement;

import java.util.Scanner;

public class Even_Odd {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the no : ");
        int no = sc.nextInt();

        if(no % 2 == 0){
            System.out.println("The number is Even");
        }else {
            System.out.println("The number id Odd");
        }
    }
}
