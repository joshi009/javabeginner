package Recursion;

public class Factorial {
    public static  int fact(int n){
//        base case
        if (n == 1 || n == 0){
            return 1;
        }
//        int  fnm1  = fact(n-1);
        int fn = n *  fact(n-1);
        return fn;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(fact(5));
    }
}
