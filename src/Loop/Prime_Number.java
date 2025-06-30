package Loop;

import java.util.Scanner;

public class Prime_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the numbers :");
        int n = sc.nextInt();

        if(n == 2){
            System.out.println("2 is a prime number");
        }else {
            boolean isPrime = true;
            for (int i = 2; i<=n-1; i++){
                if(n % i == 0 ){
                    isPrime = false;
                }
            }
            if(isPrime == true){
                System.out.println("n is prime number");
            }else {
                System.out.println("n is not prime number");
            }
        }
    }
}
