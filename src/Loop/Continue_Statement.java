package Loop;

import java.util.Scanner;

public class Continue_Statement {
//    public static void main(String[] args) {
//        for (int i = 1; i <= 10; i++){
//            if(i == 3){
//                continue;
//            }
//            System.out.print(i +" ");
//        }
//    }


public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    do {
        System.out.print("enter your number :");
        int n = sc.nextInt();

        if (n % 10 == 0) {
            continue;
        }
        System.out.println("number was : " + n);
    } while (true);
}
}