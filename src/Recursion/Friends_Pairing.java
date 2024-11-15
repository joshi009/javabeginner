package Recursion;

public class Friends_Pairing {
    public static int friendsPairing(int n) {
//    base case
        if (n == 1 || n == 0) {
            return n;
        }
//        choice


//        single
        int fnm1 = friendsPairing(n-1);

//        pairing
        int fnm2 = friendsPairing(n-2);
        int pairways = (n-1)* fnm2;

        //total way
        int totways = fnm1 + pairways;
        return totways;
    }

    public static void main(String[] args) {
        System.out.println(friendsPairing(3));
    }

}
