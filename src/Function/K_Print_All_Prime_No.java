package Function;

public class K_Print_All_Prime_No {
    public static boolean isPrime(int n){
        for (int i=2;i<=n;i++){
            if(n % 2 == 0){
                return false;
            }
        }
        return true;
    }
    public static void primeInRange(int n){
        for(int i=2; i<=n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }
    public static void main(String[] args) {
        primeInRange(18);
    }
}
