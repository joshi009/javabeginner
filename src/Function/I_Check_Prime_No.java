package Function;

import java.util.Scanner;

public class I_Check_Prime_No {

    public static boolean isPrime(int n){
        //corner case
        if(n == 1 || n == 2){
            return true;
        }
        boolean isPrime = true;
        for(int i=2; i<n-1; i++){  // completely divide
            if(n % i == 0){
                isPrime = false;
            }
        }
        return isPrime;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ente a number to check if it is prime: ");
        int n = sc.nextInt();

        if(isPrime(n)){
            System.out.println(n+" is a Prime Number.");
        }else {
            System.out.println(n+" is a Not Prime Number.");
        }
//        System.out.println(isPrime(5));
    }
}
