package Pattern.practiceset;

public class Derc_Pattern {
    public static int DecPattern(int n){

        for(int i = 1; i<= n; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
        return n;
    }
    public static void main(String[] args) {

        DecPattern(10);
    }
}
