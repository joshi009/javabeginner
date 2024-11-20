package Recursion;

public class Power {
    public static int power(int x, int n){
        if(n == 0){
            return 1;
        }
        int Xnm1 = power(x,n-1);
        int Xn = x *Xnm1;
        return Xn;
//        return x*power(x,n-1);
    }

    public static void main(String[] args) {
        System.out.println(power(2,5));
    }
}
