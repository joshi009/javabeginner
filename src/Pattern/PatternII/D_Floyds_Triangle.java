package Pattern.PatternII;

public class D_Floyds_Triangle {
    public static void Floyds_Triangle_With_Number(int n){
        int counter = 1;
        //outer loop
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++ ){
                System.out.print(j+" ");
                counter++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Floyds_Triangle_With_Number(6);
    }
}
