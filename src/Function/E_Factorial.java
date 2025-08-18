package Function;

public class E_Factorial {
    public static int factorial(int n){
        int f = 1;
        for(int i=1; i<=n; i++){
            f = f*i;
        }
        return f;

    }
    public static void main(String[] args) {
//        factorial(4);
        System.out.println("Factorial of n :  " + factorial(4));
    }
}
