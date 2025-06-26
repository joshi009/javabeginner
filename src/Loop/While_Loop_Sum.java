package Loop;

import java.util.Scanner;

public class While_Loop_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a range of number");
        int n = sc.nextInt();
        int sum = 0;
        int counter  = 1;
        while ( counter <= n){
            sum += counter;
            counter++;
        }
        System.out.println("Sum is " + sum);

    }
}
