package Pattern.PatternII;

public class B_Inverted_And_Rotated_Half_Pyramid {
    public static void Inverted_and_Rotated_Half_Pyramid(int n){
        //outer loop
        for (int i = 1; i <= n; i++){
            //Space
            for(int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }
            //Star
            for(int k = 1; k <= i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Inverted_and_Rotated_Half_Pyramid(7);
    }
}
