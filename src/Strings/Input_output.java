package Strings;

import java.util.Scanner;

public class Input_output {
    public static void main(String[] args) {
        int Char[] = {'a','b','c','d'};
        String str1 = "abcd";
        String str2 = "xyz";

        Scanner sc = new Scanner(System.in);
        String name;
//        name = sc.next();
        name = sc.nextLine();
        System.out.println(name);
    }
}
