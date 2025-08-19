package Function;

public class F_binomial_Coefficient {
    public static int factorial2(int n){
        int f = 1;
        for(int i=1 ; i <= n ; i++){
            f = f * i;
        }
        return f;
    }

    public static int binCoeff(int n, int r){

        int fact_n = factorial2(n);
        int fact_r = factorial2(r);
        int fact_nmr = factorial2(n-r);
        int binCoeff = fact_n / (fact_r * fact_nmr);
        return binCoeff;
    }
    public static void main(String[] args){
            System.out.println(binCoeff(5,2));
        }
}
