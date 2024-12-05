package Recursion;

public class Tiling_Problem {
    public static int tilingProb(int n){
        //base case
        if( n == 0 || n == 1){
            return 1;
        }
//        kaam
        int fnm1 = tilingProb(n-1);  //vertical choice
        int fnm2 = tilingProb(n-2);   //horizontal choice
        int totWays = fnm1 + fnm2;
        return totWays;
    }

    public static void main(String[] args) {
        System.out.println(tilingProb(3
        ));
    }
}
