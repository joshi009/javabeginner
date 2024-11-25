package Recursion;

public class Sum_N_Natural {
    public static int sumNatural(int n) {
        if (n == 1) {
            return 1;
        }
        int sum1 = sumNatural(n-1);
        int totsum = n + sum1;
        return totsum;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(sumNatural(n));
    }
}